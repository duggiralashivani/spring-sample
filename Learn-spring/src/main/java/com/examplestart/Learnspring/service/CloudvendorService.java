package com.examplestart.Learnspring.service;

import java.util.List;

import com.examplestart.Learnspring.model.CloudVendor;

public interface CloudvendorService {
	
	public String createCloudVendor(CloudVendor cloudVendor);
	public String updateCloudVendor(CloudVendor cloudVendor);
	public String deleteCloudVendor(String cloudVendorId);
	public CloudVendor getCloudVendor(String cloudVendorId);
	public List<CloudVendor> getAllCloudVendors();
}
