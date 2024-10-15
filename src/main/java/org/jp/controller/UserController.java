package org.jp.controller;


import org.jp.dto.UserDto;
import org.jp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.jp.dto.UserEntityReq;
import org.jp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

	
	@Autowired
	private UserService service;
	
	@PostMapping("/createNewUser")
	public ResponseEntity<String> createuser(@RequestBody UserEntityReq req){
		return ResponseEntity.ok(service.saveentity(req));
	}
	
	
	@PostMapping("/userLogin")
	public ResponseEntity<String> loginuser(@RequestBody UserEntityReq entityReq){
		return ResponseEntity.ok(service.login(entityReq));
	}
	
	


    @Autowired
    private UserService userService;

    @PostMapping("/createNewUser")
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto) {
        UserDto saveDto = this.userService.createUserDto(userDto);
        return new ResponseEntity<>(saveDto, HttpStatus.CREATED);
    }
    
    @PostMapping("/userLogin")
    public ResponseEntity<String>  login(@RequestBody UserDto dto){
    	return ResponseEntity.ok(userService.login(dto));
    }
    
}
