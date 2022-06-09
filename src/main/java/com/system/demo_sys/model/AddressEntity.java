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
@Table(name = "address")
public class AddressEntity implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column()
  private String street;

  @Column()
  private String number;

  @Column()
  private String district;

  @Column()
  private String city;

  @Column()
  private String state;

  @Column()
  private String cep;
}
