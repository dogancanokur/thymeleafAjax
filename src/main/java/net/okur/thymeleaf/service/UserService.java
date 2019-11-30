package net.okur.thymeleaf.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import net.okur.thymeleaf.UserForm;
import net.okur.thymeleaf.model.User;

@Service
public class UserService {
    private List<UserForm> userForms;

    public List<User> getData(UserForm form) {
	User user = new User(form.getName(), form.getSurname());
	return new ArrayList<User>(Arrays.asList(user));
    }

    public List<UserForm> getUserForms() {
	return userForms;
    }

    public void setUserForms(List<UserForm> userForms) {
	this.userForms = userForms;
    }

}
