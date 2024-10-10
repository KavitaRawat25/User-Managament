package org.jp.service;

import org.jp.dto.UserDtoReq;
import org.jp.repository.RoleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class RoleService implements RoleServiceInterface{

	
	@Autowired
	private RoleRepo roleRepo;
	
	
}
