package com.employe_info_.service;

import java.util.List;

import com.employe_info_.entity.Employee;

public interface Employeservices {
	public void saveLead(Employee employe);
	public List<Employee> listAll();
	public void deleteLeadById(long id);
	public Employee findOneLeadById(long id);

}
