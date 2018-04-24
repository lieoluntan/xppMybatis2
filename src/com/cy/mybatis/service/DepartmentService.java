package com.cy.mybatis.service;

import java.util.ArrayList;

import com.cy.mybatis.beans.Department;



/*
 * @author 刘鑫
 * @date 2018-1-29 13：17
 */
public interface DepartmentService {
	String insert(Department department);
	
	String delete(String uuid);
	
	String update(Department department);
	
	Department getByUuid(String uuid);
	
	ArrayList<Department> getList();
	
	public String getDepartmentByName(Department dM);
	
	public String getDepaartmentByName1(Department dM);
	
	String getonoff(Department department);
	
}
