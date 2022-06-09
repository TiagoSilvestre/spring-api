package com.system.demo_sys.resource;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.system.demo_sys.dto.UserDto;
import com.system.demo_sys.model.UserEntity;
import com.system.demo_sys.services.UserService;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/users")
public class UserResource {

  final UserService userService;

  public UserResource(UserService userService) {
    this.userService = userService;
  }

  @GetMapping
  public ResponseEntity<List<UserEntity>> getAllUsers() {
    return ResponseEntity.status(HttpStatus.OK).body(userService.findAll());
  }

  @GetMapping("/{id}")
  public ResponseEntity<Object> getUser(@PathVariable(value = "id") String id){
    Optional<UserEntity> userModelOptional = userService.findById(Integer.parseInt(id));
    if (!userModelOptional.isPresent()) {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found.");
    }
    return ResponseEntity.status(HttpStatus.OK).body(userModelOptional.get());
  }

  @PostMapping
  public ResponseEntity<Object> saveUser(@RequestBody UserDto userDto) {
    UserEntity userEntity = new UserEntity();
    BeanUtils.copyProperties(userDto, userEntity);
    return ResponseEntity.status(HttpStatus.CREATED).body(userService.save(userEntity));
  }

  @PutMapping("/{id}")
  public ResponseEntity<Object> updateUser(@RequestBody UserDto userDto, @PathVariable(value = "id") String id) {
    Optional<UserEntity> userModelOptional = userService.findById(Integer.parseInt(id));
    if (!userModelOptional.isPresent()) {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found.");
    }
    UserEntity userEntity = new UserEntity();
    BeanUtils.copyProperties(userDto, userEntity);
    return ResponseEntity.status(HttpStatus.OK).body(userService.save(userEntity));
  }


}
