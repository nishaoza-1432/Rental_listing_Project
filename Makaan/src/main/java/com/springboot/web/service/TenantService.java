package com.springboot.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.springboot.web.model.Tenant;
import com.springboot.web.repository.TenantRepository;

@Service
public class TenantService {

    @Autowired
    private TenantRepository trepo;

    @ModelAttribute("/tenantRegistration")
	public void addTenant(Tenant tenobj) {
		trepo.save(tenobj);
		
	}

}
