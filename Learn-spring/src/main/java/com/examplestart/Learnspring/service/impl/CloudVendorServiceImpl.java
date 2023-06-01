package com.examplestart.Learnspring.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.examplestart.Learnspring.Exception.CloudVendorNotFoundException;
import com.examplestart.Learnspring.model.CloudVendor;
import com.examplestart.Learnspring.repository.CloudVendorRepository;
import com.examplestart.Learnspring.service.CloudvendorService;

@Service
public class CloudVendorServiceImpl implements CloudvendorService{

	
	CloudVendorRepository cloudVendorRepository;
	
	public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
		super();
		this.cloudVendorRepository = cloudVendorRepository;
	}

	public String createCloudVendor(CloudVendor cloudVendor) {
		cloudVendorRepository.save(cloudVendor);
		return "success";
	}

	public String updateCloudVendor(CloudVendor cloudVendor) {
		cloudVendorRepository.save(cloudVendor);
		return "success";
	}

	public String deleteCloudVendor(String cloudVendorId) {
		cloudVendorRepository.deleteById(cloudVendorId);
		return "success";
	}

	public CloudVendor getCloudVendor(String cloudVendorId) {
		if(cloudVendorRepository.findById(cloudVendorId).isEmpty())
			throw new CloudVendorNotFoundException("Requested cloud vendor does not exist");
		return cloudVendorRepository.findById(cloudVendorId).get();
		 
	}

	public List<CloudVendor> getAllCloudVendors() {
		
		return cloudVendorRepository.findAll();
	}
	
	

}
