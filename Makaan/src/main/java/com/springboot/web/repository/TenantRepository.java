package com.springboot.web.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.web.model.Tenant;

public interface TenantRepository extends JpaRepository<Tenant,Integer> {

}

