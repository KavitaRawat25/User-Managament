package org.jp.repository;

import org.jp.entity.UserEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<UserEntity, Long> {

//	UserEntity findAll(UserEntity translateUserDtoToUserEntity);
//    // Custom query methods can be added here if needed
}
