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

	// -------------------- UPDATE USER -------------------------------
	@Override
	public UserDto updateUserById(Long id, UserDto userDto) {
		Optional<UserEntity> existingUserOptional = userRepo.findById(id);

		if (existingUserOptional.isPresent()) {
			UserEntity existingUser = existingUserOptional.get();

			existingUser.setFirstName(userDto.getFirstName());
			existingUser.setLastName(userDto.getLastName());
			existingUser.setPhoneNo(userDto.getPhoneNo());
			existingUser.setRoleId(userDto.getRoleId());
			existingUser.setStatus(userDto.getStatus());
			existingUser.setUserEmail(userDto.getUserEmail());

			UserEntity updatedEntity = userRepo.save(existingUser);

			return userTranslator.translateUserEntityToUserDto(updatedEntity);

		} else {
			throw new RuntimeException("User not found with id: " + id);
		}
	}

}
