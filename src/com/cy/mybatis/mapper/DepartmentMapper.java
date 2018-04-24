package com.cy.mybatis.mapper;

import java.util.ArrayList;
import java.util.List;

import com.cy.mybatis.beans.Department;


/*
 * @author 刘鑫
 * @date 2018-1-28 11：23
 */
public interface DepartmentMapper {
	//新增部门
	public boolean insert(Department department);
	//验证部门名称是否存在
	public List<Department> getdMByName(Department department);
	//删除部门
	public boolean delete(String uuid);
	//修改部门信息
	public boolean update(Department department);
	//查询所有部门
	public List<Department> getList();
	//查询单个部门
	public Department getByUuid(String uuid);
	//部门开关
	public boolean updateOnOff(String uuid,String oac);
}
