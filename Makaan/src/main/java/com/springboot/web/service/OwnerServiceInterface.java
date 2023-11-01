package com.springboot.web.service;

import com.springboot.web.model.Owner;

public interface OwnerServiceInterface {
	public void addOwner(Owner ownobj);
	public Owner getOwnerByEmail(String email);

}
