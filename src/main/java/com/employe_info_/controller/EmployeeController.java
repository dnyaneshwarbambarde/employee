package com.employe_info_.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.employe_info_.dto.EmployeData;
import com.employe_info_.entity.Employee;
import com.employe_info_.service.Employeservices;


@Controller
public class EmployeeController {
	@Autowired
	private Employeservices employeServices;
	
	

	
     
	@RequestMapping("/createEmploye")
	public String viewCreateEmployePage() {
		return "create_new_employe";
	}
	@RequestMapping("/saveEmployee")
	public String saveoneEmploye(@ModelAttribute("employe") Employee employe , ModelMap model) {
		employeServices.saveLead(employe);
	return"create_new_employe";
	}

	@RequestMapping("/listemploye")
	public String getAllEmploye(ModelMap model) {
		List<Employee> employes = employeServices.listAll();
		model.addAttribute("employes", employes);
		return "search_result";
	}
	@RequestMapping("/delete")
	public String deleteOneEmploye(@RequestParam("id") long id ,ModelMap model) {
		employeServices.deleteLeadById(id);
		List<Employee> employes = employeServices.listAll();
		model.addAttribute("employes", employes);
		return "search_result";
		
	}
	@RequestMapping("/	")
	public String updateOneEmploye(@RequestParam("id") long id ,ModelMap model) {
		Employee employe = employeServices.findOneLeadById(id);
		if (employe!=null) {
			model.addAttribute("employe", employe);
			return "update_lead";	
		}else {
			model.addAttribute("error", "No record found");
			return "error_page";
		}
		
	}
	@RequestMapping("/updateEmploye")
	public String updateLead(EmployeData data , ModelMap model) {
		Employee employe = new Employee();
		employe.setId(data.getId());
		employe.setFirstName(data.getFirstName());
		employe.setLastName(data.getLastName());
		employe.setEmail(data.getEmail());
		employe.setMobile(data.getMobile());
	      List<Employee> employes = employeServices.listAll();
			model.addAttribute("employes", employes);
			return "search_result";
	}
}
