package com.springboot.web.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.web.model.Owner;

public interface OwnerRepository extends JpaRepository<Owner,Integer> {
	Optional<Owner> findByEmail(String email);
}

