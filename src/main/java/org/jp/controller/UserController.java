package org.jp.controller;


import org.jp.dto.UserDto;
import org.jp.dto.UserEntityReq;
import org.jp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {


	@Autowired
	private UserService userService;

	@PostMapping("/createNewUser")
	public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto) {
		UserDto saveDto = this.userService.createUserDto(userDto);
		return new ResponseEntity<>(saveDto, HttpStatus.CREATED);
	}

	@PutMapping("/updateuser/{id}")
	public ResponseEntity<UserDto> updateUserById(@PathVariable("id") Long id, @RequestBody UserDto userDto) {
		UserDto updatedUser = userService.updateUserById(id, userDto);

		if (updatedUser != null) {
			return new ResponseEntity<>(updatedUser, HttpStatus.OK);
			
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);

		}
	}

	@PostMapping("/userLogin")
	public ResponseEntity<String> loginuser(@RequestBody UserEntityReq entityReq){
		return ResponseEntity.ok(userService.login(entityReq));
	}
}
