package org.jp.controller;

import org.jp.dto.UserDtoReq;
import org.jp.entity.UserRole;
import org.jp.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/rolePermission/createRole")
public class RoleController {
	
	@Autowired
	private RoleService roleService;
	
	@PostMapping("/post")
	public ResponseEntity<UserDtoReq> saveRole(@RequestBody UserDtoReq userDtoReq) {
		return new ResponseEntity<UserDtoReq>(roleService.saveRole(userDtoReq), HttpStatus.OK) ;
		
	}

}
