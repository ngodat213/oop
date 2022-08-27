package service;

import entity.*;
import java.util.*;
import java.util.stream.Collectors;

public class EmployeeManager {
	private List<Employee> employees;
	
	// -- CONSTRUCTOR -- //
	public EmployeeManager() {
		this.employees = new ArrayList<>();
	}
	
	public void insert(Employee employee) {
		this.employees.add(employee);
	}
	
	public boolean deleteByID(String id) {
		Employee employee = this.employees.stream().filter(e -> e.getId().equals(id)).
							findFirst().orElse(null);
		if(employee == null) {
			return false;
		}
		employees.remove(employee);
		return true;
	}
	
	
	/*
	 * type = 0 -> Experience
	 * type = 1 -> Fresher
	 * type = 2 -> Intern
	 */
	public List<Employee> findByType(int type) {
        return this.employees.stream()
                .filter(employee -> {
                    if (type == 0) {
                        return employee instanceof Experience;
                    }
                    if (type == 1) {
                        return employee instanceof Fresher;
                    }
                    if (type == 2) {
                        return employee instanceof Intern;
                    }
                    return false;
                })
                .collect(Collectors.toList());
    }
	
	public List<Employee> findAll() {
		return this.employees;
	}
	
}
