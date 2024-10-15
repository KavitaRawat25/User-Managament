package org.jp.service.impl;

import java.util.Optional;

import org.jp.dto.UserDto;
import org.jp.entity.UserEntity;
import org.jp.repository.UserRepo;
import org.jp.service.UserService;
import org.jp.translator.UserTranslator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	
	public String login(UserDto req){
		Optional<UserEntity> user = userRepo.findByuserEmail(req.getUserEmail());
		if(user.isPresent()) {
			UserEntity ur = user.get();
			if(ur.getPassword().equals(req.getPassword())) {
				return "sucessfully login";
			}
			else {
				return "login not sucessfully";
			}
		}
		else {
			return "user not found";
		}
	}
	
}
