package org.jp.service;

import java.util.Optional;

import org.jp.dto.UserDtoReq;
import org.jp.dto.UserDtoRes;
import org.jp.entity.UserRole;
import org.jp.repository.RoleRepo;
import org.jp.translater.RoleTranslater;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class RoleService implements RoleServiceInterface{

	
	@Autowired
	private RoleRepo roleRepo;
	
	@Autowired
    private RoleTranslater roleTranslater;
	
	public UserDtoReq saveRole(UserDtoReq userDtoReq) {
		
		UserRole userRole = roleTranslater.translateRole(userDtoReq);
		UserRole savedRole = roleRepo.save(userRole);
		return roleTranslater.translateRoleDto(savedRole);
	}
	
	
	public UserDtoRes updateRoleByid(Long id, UserDtoReq req){
		
		Optional<UserRole>  role = roleRepo.findById(id);
		if(role.isPresent()) {
			UserRole resp = role.get();
			
			
			UserRole user = roleTranslater.translateRole(req);
			user.setId(id);
			UserRole saverole = roleRepo.save(user);
			return roleTranslater.translateRoleToRes(saverole);
			}
		return null;
	}
}
