package com.system.demo_sys.resource;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.system.demo_sys.model.UserEntity;

@RestController
@RequestMapping("/address")
public class AddressResource {

  @GetMapping
  public ResponseEntity<List<UserEntity>> getAllUsers() {


    return ResponseEntity.status(HttpStatus.OK).build();
  }
}
