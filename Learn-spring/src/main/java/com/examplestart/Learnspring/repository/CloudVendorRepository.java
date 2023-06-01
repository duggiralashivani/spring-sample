package com.examplestart.Learnspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examplestart.Learnspring.model.CloudVendor;

public interface CloudVendorRepository extends JpaRepository<CloudVendor, String> {

}
