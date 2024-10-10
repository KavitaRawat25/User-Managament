package org.jp.repository;

import org.jp.entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<UserRole, Long>{

}
