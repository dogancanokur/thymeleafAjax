package net.okur.thymeleaf.dto;

import java.util.List;

import net.okur.thymeleaf.model.User;

public class AjaxResponseBody {
  private String message;
  private List<User> userList;

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public List<User> getUserList() {
    return userList;
  }

  public void setUserList(List<User> userList) {
    this.userList = userList;
  }
}
