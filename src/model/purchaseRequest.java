/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Windows 10
 */
public class purchaseRequest {
    String employeeID, itemID, um, remark, statusPR, prName; 
    Date requestDate, receivingDate;
    boolean approvalManager;
    int prID, quantity ;

    public purchaseRequest(String employeeID, String itemID, String um, String remark, String statusPR, String prName, Date requestDate, Date receivingDate, boolean approvalManager, int prID, int quantity) {
        this.employeeID = employeeID;
        this.itemID = itemID;
        this.um = um;
        this.remark = remark;
        this.statusPR = statusPR;
        this.prName = prName;
        this.requestDate = requestDate;
        this.receivingDate = receivingDate;
        this.approvalManager = approvalManager;
        this.prID = prID;
        this.quantity = quantity;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public String getUm() {
        return um;
    }

    public void setUm(String um) {
        this.um = um;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getStatusPR() {
        return statusPR;
    }

    public void setStatusPR(String statusPR) {
        this.statusPR = statusPR;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getReceivingDate() {
        return receivingDate;
    }

    public void setReceivingDate(Date receivingDate) {
        this.receivingDate = receivingDate;
    }

    public boolean isApprovalManager() {
        return approvalManager;
    }

    public void setApprovalManager(boolean approvalManager) {
        this.approvalManager = approvalManager;
    }

    public int getPrID() {
        return prID;
    }

    public void setPrID(int prID) {
        this.prID = prID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getPrName() {
        return prName;
    }

    public void setPrName(String prName) {
        this.prName = prName;
    }
    
    
}
