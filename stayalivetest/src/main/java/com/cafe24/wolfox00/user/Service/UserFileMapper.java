package com.cafe24.wolfox00.user.Service;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.wolfox00.user.vo.UserFile;

@Mapper
public interface UserFileMapper {
	int insertUserFile(UserFile userFile);
}
