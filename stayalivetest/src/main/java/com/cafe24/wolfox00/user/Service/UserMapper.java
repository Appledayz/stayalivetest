package com.cafe24.wolfox00.user.Service;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.wolfox00.user.vo.User;
import com.cafe24.wolfox00.user.vo.UserRequest;

@Mapper
public interface UserMapper {
	List<UserRequest> selectUserListAll();
	int login(User user);
	void addUser(User user);
}