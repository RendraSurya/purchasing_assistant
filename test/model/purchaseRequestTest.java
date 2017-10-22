/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import gui.DashboardNP;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import static net.ucanaccess.converters.Functions.date;
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
public class purchaseRequestTest {
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    String reqDate = "07/06/2013";
    String recDate = "07/07/2013";
    purchaseRequest instance;
    
    public purchaseRequestTest() {
        try {
            Date date1 = formatter.parse(reqDate);
            Date date2 = formatter.parse(recDate);
            instance = new purchaseRequest("123456789", "ML9421", "pcs", "Mengganti kerusakan", "in progress", "Beli Mouse", date1, date2, true, 1, 1);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
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
     * Test of getEmployeeID method, of class purchaseRequest.
     */
    @Test
    public void testGetEmployeeID() {
        String expResult = "123456789";
        String result = instance.getEmployeeID();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEmployeeID method, of class purchaseRequest.
     */
    @Test
    public void testSetEmployeeID() {
        String employeeID = "123456789";
        instance.setEmployeeID(employeeID);
    }

    /**
     * Test of getItemID method, of class purchaseRequest.
     */
    @Test
    public void testGetItemID() {
        String expResult = "ML9421";
        String result = instance.getItemID();
        assertEquals(expResult, result);
    }

    /**
     * Test of setItemID method, of class purchaseRequest.
     */
    @Test
    public void testSetItemID() {
        String itemID = "ML9421";
        instance.setItemID(itemID);
    }

    /**
     * Test of getUm method, of class purchaseRequest.
     */
    @Test
    public void testGetUm() {
        String expResult = "pcs";
        String result = instance.getUm();
        assertEquals(expResult, result);
    }

    /**
     * Test of setUm method, of class purchaseRequest.
     */
    @Test
    public void testSetUm() {
        String um = "pcs";
        instance.setUm(um);
    }

    /**
     * Test of getRemark method, of class purchaseRequest.
     */
    @Test
    public void testGetRemark() {
        String expResult = "Mengganti kerusakan";
        String result = instance.getRemark();
        assertEquals(expResult, result);
    }

    /**
     * Test of setRemark method, of class purchaseRequest.
     */
    @Test
    public void testSetRemark() {
        String remark = "Mengganti Rusak";
        instance.setRemark(remark);
    }

    /**
     * Test of getStatusPR method, of class purchaseRequest.
     */
    @Test
    public void testGetStatusPR() {
        String expResult = "in progress";
        String result = instance.getStatusPR();
        assertEquals(expResult, result);
    }

    /**
     * Test of setStatusPR method, of class purchaseRequest.
     */
    @Test
    public void testSetStatusPR() {
        String statusPR = "in progress";
        instance.setStatusPR(statusPR);
    }

    /**
     * Test of getRequestDate method, of class purchaseRequest.
     */
    @Test
    public void testGetRequestDate() {
        try {
            Date date1 = formatter.parse(reqDate);
            Date date2 = formatter.parse(recDate);
            instance = new purchaseRequest("123456789", "ML9421", "pcs", "Mengganti kerusakan", "in progress", "Beli Mouse", date1, date2, true, 1, 1);
            Date expResult = date1;
            Date result = instance.getRequestDate();
            assertEquals(expResult, result);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
    }

    /**
     * Test of setRequestDate method, of class purchaseRequest.
     */
    @Test
    public void testSetRequestDate() {
        Date requestDate = null;
        instance.setRequestDate(requestDate);
    }
    /**
     * Test of getReceivingDate method, of class purchaseRequest.
     */
    
    @Test
    public void testGetReceivingDate() {
        try {
            Date date1 = formatter.parse(reqDate);
            Date date2 = formatter.parse(recDate);
            instance = new purchaseRequest("123456789", "ML9421", "pcs", "Mengganti kerusakan", "in progress", "Beli Mouse", date1, date2, true, 1, 1);
            Date expResult = date2;
            Date result = instance.getReceivingDate();
            assertEquals(expResult, result);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    /**
     * Test of setReceivingDate method, of class purchaseRequest.
     */
    @Test
    public void testSetReceivingDate() {
        Date receivingDate = null;
        instance.setReceivingDate(receivingDate);
    }

    /**
     * Test of isApprovalManager method, of class purchaseRequest.
     */
    @Test
    public void testIsApprovalManager() {
        boolean expResult = true;
        boolean result = instance.isApprovalManager();
        assertEquals(expResult, result);
    }

    /**
     * Test of setApprovalManager method, of class purchaseRequest.
     */
    @Test
    public void testSetApprovalManager() {
        boolean approvalManager = false;
        instance.setApprovalManager(approvalManager);
    }

    /**
     * Test of getPrID method, of class purchaseRequest.
     */
    @Test
    public void testGetPrID() {
        int expResult = 1;
        int result = instance.getPrID();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPrID method, of class purchaseRequest.
     */
    @Test
    public void testSetPrID() {
        int prID = 1;
        instance.setPrID(prID);
    }

    /**
     * Test of getQuantity method, of class purchaseRequest.
     */
    @Test
    public void testGetQuantity() {
        int expResult = 1;
        int result = instance.getQuantity();
        assertEquals(expResult, result);
    }

    /**
     * Test of setQuantity method, of class purchaseRequest.
     */
    @Test
    public void testSetQuantity() {
        int quantity = 1;
        instance.setQuantity(quantity);
    }

    /**
     * Test of getPrName method, of class purchaseRequest.
     */
    @Test
    public void testGetPrName() {
        String expResult = "Beli Mouse";
        String result = instance.getPrName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPrName method, of class purchaseRequest.
     */
    @Test
    public void testSetPrName() {
        String prName = "Beli Keyboard";
        instance.setPrName(prName);
    }
    
}
