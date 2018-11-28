package com.cafe24.wolfox00.user.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe24.wolfox00.user.vo.User;
import com.cafe24.wolfox00.user.vo.UserRequest;

@Service
@Transactional
public class UserService {
	@Autowired
	private UserMapper userMapper;
	public List<UserRequest> userList() {
		List<UserRequest> list = userMapper.selectUserListAll();
		return list;
	}
	public int login(User user) {
		return userMapper.login(user);
	}
}
