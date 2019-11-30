package net.okur.thymeleaf.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import net.okur.thymeleaf.AjaxResponseBody;
import net.okur.thymeleaf.UserForm;
import net.okur.thymeleaf.model.User;
import net.okur.thymeleaf.service.UserService;

@RestController
public class HomeRestController {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
	this.userService = userService;
    }

    @PostMapping("/kullanici")
    public ResponseEntity<?> getSearchResultViaAjax(@Valid @RequestBody UserForm kullaniciForm, Errors hata) {

	AjaxResponseBody result = new AjaxResponseBody();

	List<User> kullaniciList = userService.getData(kullaniciForm);
	if (kullaniciList.isEmpty()) {
	    result.setMessage("sorun olustu");
	} else {
	    result.setMessage("basarili");
	}

	result.setSonuc(kullaniciList);
	return ResponseEntity.ok(result);

    }
}