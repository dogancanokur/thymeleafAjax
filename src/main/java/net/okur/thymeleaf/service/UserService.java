package net.okur.thymeleaf.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import net.okur.thymeleaf.dto.UserRequest;
import net.okur.thymeleaf.model.User;

@Service
public class UserService {
  private List<UserRequest> userRequests;

  public List<User> getData(UserRequest form) {
    User user = new User(form.getName(), form.getSurname());
    return new ArrayList<>(Arrays.asList(user));
  }

  public List<UserRequest> getUserForms() {
    return userRequests;
  }

  public void setUserForms(List<UserRequest> userRequests) {
    this.userRequests = userRequests;
  }
}
