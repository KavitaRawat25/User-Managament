package org.jp.service;

import java.util.List;

import org.jp.dto.UserDtoReq;
import org.jp.dto.UserDtoRes;

public interface RoleServiceInterface {
	public UserDtoReq saveRole(UserDtoReq userDtoReq);
	public List<UserDtoRes> getDetails();

}
