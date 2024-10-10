package org.jp.service;

import org.jp.dto.UserDtoReq;
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
}
