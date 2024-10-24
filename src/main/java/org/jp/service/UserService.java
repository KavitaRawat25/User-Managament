package org.jp.service;
import java.util.List;




import org.jp.dto.UserDto;
import org.jp.entity.UserEntity;
import org.jp.dto.UserDto;



public interface UserService {
	
	 public UserDto createUserDto(UserDto userDto);
	 
	 List<UserDto> getUsers();

	
}
