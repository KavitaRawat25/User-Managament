package org.jp.controller;

import org.jp.dto.UserDtoReq;
import org.jp.dto.UserDtoRes;
import org.jp.service.RoleService;
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
@RequestMapping("/rolePermission")
public class RoleController {
	
	@Autowired
	private RoleService roleService;
	
	@PostMapping("/createRole")
	public ResponseEntity<UserDtoReq> saveRole(@RequestBody UserDtoReq userDtoReq) {
		return new ResponseEntity<UserDtoReq>(roleService.saveRole(userDtoReq), HttpStatus.OK) ;
		
	}
	
	 @PutMapping("updaterole/{id}")
	    public ResponseEntity<UserDtoRes> updateRoleById(@PathVariable Long id, @RequestBody UserDtoReq userDtoReq) {
	        UserDtoRes updatedRole = roleService.updateRoleByid(id, userDtoReq);

	        if (updatedRole != null) {
	            return new ResponseEntity<>(updatedRole, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }

}
