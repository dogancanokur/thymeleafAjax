package net.okur.thymeleaf.dto;

import javax.validation.constraints.NotBlank;

public class UserRequest {
  @NotBlank private String name;

  @NotBlank private String surname;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }
}
