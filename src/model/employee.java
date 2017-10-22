/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Windows 10
 */
public class employee {
    String employeeID, employeeName, department, password;
    boolean managerDept;
    
    public employee(String employeeID, String employeeName, String department, boolean managerDept, String password){
        this.employeeID=employeeID;
        this.employeeName=employeeName;
        this.department=department;
        this.managerDept=managerDept;
        this.password=password;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public String getPassword() {
        return password;
    }

    public boolean isManagerDept() {
        return managerDept;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setManagerDept(boolean managerDept) {
        this.managerDept = managerDept;
    }
    
    
}
