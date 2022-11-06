package com.ssafy.happy.user;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.happy.user.mapper.UserMapper;

@Service
public class UserService {

	@Autowired
	UserMapper userMapper;
	
	public List<UserDto> loadUser() {
		return userMapper.loadUser();
	}

	public void upload(HashMap<String, String> map) {
		userMapper.upload(map);
	}

}
