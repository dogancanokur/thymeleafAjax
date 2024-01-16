package net.okur.thymeleaf.controller;

import java.util.List;
import javax.validation.Valid;
import net.okur.thymeleaf.dto.AjaxResponseBody;
import net.okur.thymeleaf.dto.UserRequest;
import net.okur.thymeleaf.model.User;
import net.okur.thymeleaf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {

  private final UserService userService;

  @Autowired
  public UserRestController(UserService userService) {
    this.userService = userService;
  }

  @PostMapping("/user")
  public ResponseEntity<AjaxResponseBody> getSearchResultViaAjax(
      @Valid @RequestBody UserRequest userRequest) {

    AjaxResponseBody result = new AjaxResponseBody();

    List<User> userList = userService.getData(userRequest);
    if (userList.isEmpty()) {
      result.setMessage("User list is empty.");
    } else {
      result.setMessage("Success");
    }

    result.setUserList(userList);
    return ResponseEntity.ok(result);
  }
}
