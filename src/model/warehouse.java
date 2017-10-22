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
public class warehouse {
    String itemID, itemName;
    int endingStock;

    public warehouse(String itemID, String itemName, int endingStock) {
        this.itemID = itemID;
        this.itemName = itemName;
        this.endingStock = endingStock;
    }

    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getEndingStock() {
        return endingStock;
    }

    public void setEndingStock(int endingStock) {
        this.endingStock = endingStock;
    }
    
    
}
