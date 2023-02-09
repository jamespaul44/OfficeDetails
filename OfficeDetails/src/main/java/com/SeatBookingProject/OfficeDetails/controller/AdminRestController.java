package com.SeatBookingProject.OfficeDetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SeatBookingProject.OfficeDetails.exception.AddCredentialsException;
import com.SeatBookingProject.OfficeDetails.exception.DeleteCredentialsException;
import com.SeatBookingProject.OfficeDetails.exception.FindCredentialsException;
import com.SeatBookingProject.OfficeDetails.exception.UpdateCredentialsException;
import com.SeatBookingProject.OfficeDetails.model.Admin;
import com.SeatBookingProject.OfficeDetails.service.AdminService;

@RestController
public class AdminRestController {
	
	@Autowired
	AdminService service;
	
	@PostMapping("/addcredentials")
	public ResponseEntity<String> addCredentials(@RequestBody Admin admin) throws AddCredentialsException
	{
		if(admin == null) {
			throw new AddCredentialsException();
		}
		service.add(admin);
		return ResponseEntity.ok("Credentials added successfully");
	}
	
	@PostMapping("/findcredentials")
	public ResponseEntity<String> findCredentials(@RequestBody Admin admin) throws FindCredentialsException
	{
		if(admin == null) {
			throw new FindCredentialsException();
		}
		
		String password = admin.getPassword();
		
		// Perform a more secure check for the password
		if(!password.equals("vinod@123")) {
			throw new FindCredentialsException();
		}
		
		service.find(password);
		return ResponseEntity.ok("Welcome to the homepage");
	}
	
	@DeleteMapping("/deleteadmin/{adminName}")
	public ResponseEntity<String> deleteAdmin(@PathVariable String adminName) throws DeleteCredentialsException
	{
		Admin admin = service.find(adminName);
		if(admin == null) {
			throw new DeleteCredentialsException(adminName);
		}
		service.delete(adminName);
		return ResponseEntity.ok("Details deleted successfully");
	}
	
	@PostMapping("/updateadmin")
	public ResponseEntity<String> updateAdminDetails(@RequestBody Admin admin) throws UpdateCredentialsException
	{
		if(admin == null) {
			throw new UpdateCredentialsException();
		}
		return ResponseEntity.ok("Details updated successfully");
	}
}