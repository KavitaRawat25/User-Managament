package org.jp.service;

import java.util.Optional;

import org.jp.dto.UserEntityReq;
import org.jp.entity.UserEntity;
import org.jp.repository.UserRepo;
import org.jp.translater.UserEntityTranslator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	private UserEntityTranslator translator;
	
	@Autowired
	private UserRepo repo;
	
	public String saveentity(UserEntityReq entityReq) {
		UserEntity entity = translator.entitytranslator(entityReq);
		UserEntity saveuser = repo.save(entity);
		return "user created sucessfully";
	}
	
	
	public String login(UserEntityReq req){
		Optional<UserEntity> user = repo.findByuserEmail(req.getUserEmail());
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
