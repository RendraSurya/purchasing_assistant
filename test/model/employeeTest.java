/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Windows 10
 */
public class employeeTest {
    employee instance = new employee("100012541", "Almira", "Purchasing", true, "Almira1234");
    public employeeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getEmployeeID method, of class employee.
     */
    @Test
    public void testGetEmployeeID() {
        String expResult = "100012541";
        String result = instance.getEmployeeID();
        assertEquals(expResult, result);
    }

    /**
     * Test of getEmployeeName method, of class employee.
     */
    @Test
    public void testGetEmployeeName() {
        String expResult = "Almira";
        String result = instance.getEmployeeName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDepartment method, of class employee.
     */
    @Test
    public void testGetDepartment() {
        String expResult = "Purchasing";
        String result = instance.getDepartment();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPassword method, of class employee.
     */
    @Test
    public void testGetPassword() {
        String expResult = "Almira1234";
        String result = instance.getPassword();
        assertEquals(expResult, result);
    }

    /**
     * Test of isManagerDept method, of class employee.
     */
    @Test
    public void testIsManagerDept() {
        boolean expResult = true;
        boolean result = instance.isManagerDept();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEmployeeID method, of class employee.
     */
    @Test
    public void testSetEmployeeID() {
        String employeeID = "210145";
        instance.setEmployeeID(employeeID);
    }

    /**
     * Test of setEmployeeName method, of class employee.
     */
    @Test
    public void testSetEmployeeName() {
        String employeeName = "Sudiro";
        instance.setEmployeeName(employeeName);
    }

    /**
     * Test of setDepartment method, of class employee.
     */
    @Test
    public void testSetDepartment() {
        String department = "Purchasing";
        instance.setDepartment(department);
    }

    /**
     * Test of setPassword method, of class employee.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "sabi1234";
        instance.setPassword(password);
    }

    /**
     * Test of setManagerDept method, of class employee.
     */
    @Test
    public void testSetManagerDept() {
        boolean managerDept = false;
        instance.setManagerDept(managerDept);
    }
    
}
