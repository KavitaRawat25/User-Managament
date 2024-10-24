package org.jp.service.impl;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import org.jp.dto.UserDto;
import org.jp.entity.UserEntity;
import org.jp.repository.UserRepo;
import org.jp.service.UserService;
import org.jp.translator.UserTranslator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.persistence.Id;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo userRepo;

	@Autowired
	private UserTranslator userTranslator;


	
	@Override
	public UserDto createUserDto(UserDto userDto) {
		
		UserEntity saveEntity = userRepo.save(userTranslator.translateUserDtoToUserEntity(userDto));
		
		return userTranslator.translateUserEntityToUserDto(saveEntity);
	}
	
	
	
	@Override
	public List<UserDto> getUsers() {
	    // Find all users from the database
		
	    List<UserEntity> users = userRepo.findAll();
	    System.out.println("Data find successfull");
	   
	    // Convert each UserEntity to UserDto
	    List<UserDto> dtousersDtos = users.stream()
	                                      .map(UserEntity -> userTranslator.translateUserEntityToUserDto(UserEntity)) 
	                                      .collect(Collectors.toList());
	    
	    return dtousersDtos;
	}

	
}
