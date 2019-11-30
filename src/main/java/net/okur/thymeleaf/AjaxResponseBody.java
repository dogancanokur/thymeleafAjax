package net.okur.thymeleaf;

import java.util.List;

import net.okur.thymeleaf.model.User;

public class AjaxResponseBody {
    private String message;
    private List<User> sonuc;

    public String getMessage() {
	return message;
    }

    public void setMessage(String message) {
	this.message = message;
    }

    public List<User> getSonuc() {
	return sonuc;
    }

    public void setSonuc(List<User> sonuc) {
	this.sonuc = sonuc;
    }

}
