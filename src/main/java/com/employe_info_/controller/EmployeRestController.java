package com.employe_info_.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//makes it web services layer in project

import com.employe_info_.entity.Employee;
import com.employe_info_.service.Employeservices;


@RestController
@RequestMapping("/employee")
// to call this call
public class EmployeRestController {
	@Autowired
	private Employeservices employeservices;

	@GetMapping
	// convert java object into json object
	public List<Employee> getAllLeads() {
		List<Employee> employes = employeservices.listAll();
		return employes;
	}
	@PostMapping
	 public void saveOneLead(@RequestBody Employee employe) {
		employeservices.saveLead(employe); 
	 }
	@PutMapping
	 public void updateLead(@RequestBody Employee employe) {
		employeservices.saveLead(employe); 
	 }
	@DeleteMapping("/delete/{id}")
	public void deleteOneLead(@PathVariable("id") Long id) {
		employeservices.deleteLeadById(id);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
	 }
	///Developing end points
	@GetMapping("/api/get/{id}")
	public Employee getOneLead(@PathVariable("id") Long id){
		Employee employe = employeservices.findOneLeadById(id);
		return employe;
	}
	

}
