package com.examplestart.Learnspring.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.examplestart.Learnspring.model.CloudVendor;
import com.examplestart.Learnspring.service.CloudvendorService;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {
    
	//CloudVendor cloudVendor;
	
	CloudvendorService cloudVendorService;
	
	
	public CloudVendorController(CloudvendorService cloudVendorService) {
		super();
		this.cloudVendorService = cloudVendorService;
	}

	//read specific cloud vendor
	@GetMapping("{vendorId}")
	public CloudVendor getCloudVendorDetails(@PathVariable("vendorId") String vendorId)
	{
		return cloudVendorService.getCloudVendor(vendorId);
		
		//return new CloudVendor ("C1","Vendor 1","Address one","XXX-XXX-XXXX");
	} 
	
	
	// read all cloud vendors
	
	@GetMapping()
	public List<CloudVendor> getAllCloudVendorDetails()
	{
		return cloudVendorService.getAllCloudVendors();
		
	
	} 
	
	@PostMapping
	public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
	{
		cloudVendorService.createCloudVendor(cloudVendor);
		return " cloud vendor created successfully";
	}
	@PutMapping
	public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
	{
		cloudVendorService.updateCloudVendor(cloudVendor);
		return " cloud vendor updated successfully";
	}
	
	@DeleteMapping("{vendorId}")
	public String deleteCloudVendorDetails(@PathVariable("vendorId") String vendorId)
	{
		cloudVendorService.deleteCloudVendor(vendorId);
		return " cloud vendor deleted successfully";
	}
	
}
