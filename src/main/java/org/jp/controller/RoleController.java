package org.jp.controller;

import org.jp.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/rolePermission/createRole")
public class RoleController {
	
	@Autowired
	private RoleService roleService;
	
	

}
