package com.tectoro.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String departmentname;
	private String departmentaddress;
	private String deptcode;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDepartmentname() {
		return departmentname;
	}
	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}
	public String getDepartmentaddress() {
		return departmentaddress;
	}
	public void setDepartmentaddress(String departmentaddress) {
		this.departmentaddress = departmentaddress;
	}
	public String getDeptcode() {
		return deptcode;
	}
	public void setDeptcode(String deptcode) {
		this.deptcode = deptcode;
	}
	public Department(int id, String departmentname, String departmentaddress, String deptcode) {
		super();
		this.id = id;
		this.departmentname = departmentname;
		this.departmentaddress = departmentaddress;
		this.deptcode = deptcode;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", departmentname=" + departmentname + ", departmentaddress="
				+ departmentaddress + ", deptcode=" + deptcode + "]";
	}
	
}
