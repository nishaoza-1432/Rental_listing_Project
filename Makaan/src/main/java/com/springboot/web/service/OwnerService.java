package com.springboot.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.web.model.Owner;
import com.springboot.web.repository.OwnerRepository;

@Service
public class OwnerService implements OwnerServiceInterface {
	 @Autowired
	 private OwnerRepository orepo;

	public void addOwner(Owner ownobj) {
		orepo.save(ownobj);
	}
	
	public Owner getOwnerByEmail(String email) {
        return orepo.findByEmail(email).orElse(null);
    }
}
