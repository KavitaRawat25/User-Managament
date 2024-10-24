package org.jp.translater;

import java.util.ArrayList;


import java.util.List;
import java.util.stream.Collectors;

import org.jp.dto.UserDtoReq;
import org.jp.dto.UserDtoRes;
import org.jp.entity.UserRole;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RoleTranslater {
	@Autowired
	private ModelMapper modelMapper;

	public UserRole translateRole(UserDtoReq userDtoReq) {
		return modelMapper.map(userDtoReq, UserRole.class);
	}

	public UserDtoReq translateRoleDto(UserRole userRole) {
		return modelMapper.map(userRole, UserDtoReq.class);
	}

	public UserDtoRes translateRoleRes(UserRole userRole) {
		return modelMapper.map(userRole, UserDtoRes.class);
	}

	public List<UserDtoRes> translateRoleDto(List<UserRole> userRoles) {
		return userRoles.stream().map(this::translateRoleRes).collect(Collectors.toList());
	}

	public UserDtoRes translateRoleToRes(UserRole userRole) {
		return modelMapper.map(userRole, UserDtoRes.class);
	}

}
