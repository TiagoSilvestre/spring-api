package com.system.demo_sys.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.system.demo_sys.models.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Integer> {

}
