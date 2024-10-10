package org.jp.translater;

import org.jp.dto.UserDtoReq;
import org.jp.dto.UserDtoRes;
import org.jp.entity.UserRole;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RoleTranslater{
	@Autowired
	private ModelMapper modelMapper;
	
	public UserRole translateRole(UserDtoReq userDtoReq) {
		return modelMapper.map(userDtoReq, UserRole.class);
	}
	public UserDtoReq translateRoleDto(UserRole userRole) {
		return modelMapper.map(userRole, UserDtoReq.class);
	}
	
	public UserDtoRes translateRoleToRes(UserRole userRole) {
		return modelMapper.map(userRole, UserDtoRes.class);
	}

	
	
}
