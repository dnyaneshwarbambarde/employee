package com.employe_info_.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employe_info_.entity.Employee;
import com.employe_info_.repository.EmployeeRepositroy;
@Service
public class EmployeServicesimpl implements Employeservices {

	@Autowired
	private EmployeeRepositroy employeRepo;
	
	@Override
	public void saveLead(Employee employe) {
		employeRepo.save(employe);

	}

	@Override
	public List<Employee> listAll() {
		List<Employee> employes = employeRepo.findAll();
		return employes;
	}

	@Override
	public void deleteLeadById(long id) {
		employeRepo.deleteById(id);
		
	}

	@Override
	public Employee findOneLeadById(long id) {
		Optional<Employee> findById = employeRepo.findById(id);
		if (findById.isPresent()) {
			Employee employe = findById.get();
			return employe;
		}else {
			return null;
		}
		
	}


}
