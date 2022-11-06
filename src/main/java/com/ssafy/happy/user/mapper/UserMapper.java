package com.ssafy.happy.user.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.happy.user.UserDto;

@Mapper
public interface UserMapper {

	List<UserDto> loadUser();

	void upload(HashMap<String, String> map);

}
