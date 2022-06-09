package com.system.demo_sys.services;

import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.system.demo_sys.model.UserEntity;
import com.system.demo_sys.repository.UserRepository;

@Service
public class UserService {
  // O autowired serve para avisar o spring injetar a dependencia, no caso o UserRepository
  // Isso tambem poderia ser feito via contrutor
  @Autowired
  UserRepository userRepository;

  // Se algo der errado com a transaçao ele faz um rollback
  @Transactional
  public UserEntity save(UserEntity userEntity) {
    return userRepository.save(userEntity);
  }

  public List<UserEntity> findAll() {
    return userRepository.findAll();
  }

  public Optional<UserEntity> findById(Integer id) {
    return userRepository.findById(id);
  }
}
