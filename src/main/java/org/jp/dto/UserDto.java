package org.jp.dto;

import org.jp.entity.UserRole;

import lombok.Data;

@Data
public class UserDto {
    private String userName;
    private Long phoneNo;
    private Long roleId;
    private Boolean status;
    private String userEmail;
    private String password;
    private UserRole userRole;
}
