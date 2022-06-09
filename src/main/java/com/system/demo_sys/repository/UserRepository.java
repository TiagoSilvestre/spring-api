package com.system.demo_sys.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.system.demo_sys.model.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {

}
