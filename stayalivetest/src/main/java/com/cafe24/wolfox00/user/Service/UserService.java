package com.cafe24.wolfox00.user.Service;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.cafe24.wolfox00.user.vo.User;
import com.cafe24.wolfox00.user.vo.UserFile;
import com.cafe24.wolfox00.user.vo.UserRequest;

@Service
@Transactional
public class UserService {
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private UserFileMapper userFileMapper;
	
	public List<User> userList() {
		System.out.println("UserService.userList()");
		List<User> list = userMapper.selectUserListAll();
		return list;
	}
	public int login(User user) {
		return userMapper.login(user);
	}
	public int addUser(UserRequest userRequest, String realPath) {
		System.out.println("UserService.addUser()");
		userMapper.addUser(userRequest);
		User user = new User();
		user.setUserId(userRequest.getUserId());
		String userPhotoPath;
		int i = 0;
		if (userRequest.getUserPhoto() != null) {
			MultipartFile userPhoto = userRequest.getUserPhoto();
			if(userPhoto.getSize() != 0) {
				UserFile userFile = new UserFile();
				userFile.setUserId(userRequest.getUserId());
				String path = realPath+"upload";
				userFile.setUserFilePath(path);
				String originalFileName = userPhoto.getOriginalFilename();
				int pos = originalFileName.lastIndexOf(".");
				String ext = originalFileName.substring(pos + 1);
				userFile.setUserFileExt(ext);
				String filename = UUID.randomUUID().toString();
				userFile.setUserFileName(filename);
				userFile.setUserFileType(userPhoto.getContentType());
				userFile.setUserFileSize(userPhoto.getSize());
	
				File folder = new File(path);
				if (!folder.exists()) {
					if (folder.mkdirs()) {
						System.out.println("Multiple directories are created!");
					} else {
						System.out.println("Failed to create multiple directories!");
					}
				}
				try {
					//	내가 원하는 이름의 빈파일 하나를 만들자
					File file = new File(path+ "/" + filename + "." + ext);
					//	multipartFile파일을 빈파일로 복사하자
					userPhoto.transferTo(file);
				} catch (Exception e) {
					e.printStackTrace();
				}
				if(userFileMapper.insertUserFile(userFile)==1) {
					user.setUserPhoto("/upload/"+filename+"."+ext);
					i++;
				}
			}
		}
		userMapper.addUserPhoto(user);
		return i;
	}
}
