package org.jp.controller;

import java.util.List;

import org.jp.dto.UserDtoReq;
import org.jp.dto.UserDtoRes;
import org.jp.entity.UserRole;
import org.jp.service.RoleService;
import org.jp.service.RoleServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/rolePermission/createRole")
public class RoleController {
	
	@Autowired
	private RoleServiceInterface roleService;
	
	@PostMapping("/post")
	public ResponseEntity<UserDtoReq> saveRole(@RequestBody UserDtoReq userDtoReq) {
		return new ResponseEntity<UserDtoReq>(roleService.saveRole(userDtoReq), HttpStatus.OK) ;
		
	}
	@GetMapping("/list")
	public List <UserDtoRes> getDetails(){
		List<UserDtoRes> userList= (List<UserDtoRes>) roleService.getDetails();
		return  userList;
		
			
	}

}
