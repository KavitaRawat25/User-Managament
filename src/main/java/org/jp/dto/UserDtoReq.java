package org.jp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDtoReq {

	private String roleName;

	private String roleDescription;

	private boolean canAccessMobileRequest;

	private boolean canAccessWebRequest;

	private int status;

}
