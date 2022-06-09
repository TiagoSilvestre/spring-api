package com.system.demo_sys.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "users")
public class UserEntity implements Serializable {

  private static final long serailVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(nullable = false)
  private String first_name;

  @Column(nullable = false)
  private String last_name;

  @Column(nullable = false)
  private String email;

  @Column(nullable = false, length = 100)
  private String phone;

  @Column(nullable = false, length = 100)
  private String cpf;

  @Column(nullable = false, length = 100)
  private String password;
}
