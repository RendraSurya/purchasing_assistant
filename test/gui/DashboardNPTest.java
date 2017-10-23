/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Dimension;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import static junit.framework.Assert.assertEquals;
import model.warehouse;
import org.fest.swing.fixture.FrameFixture;
import org.junit.After;
import org.junit.Test;
import org.junit.Before;
import org.fest.swing.fixture.JTableFixture;
import static org.fest.swing.data.Index.*;
import static org.fest.swing.data.TableCell.row;
import org.fest.swing.fixture.JPanelFixture;
import static org.junit.Assert.assertEquals;
//import org.fest.swing.fixture.
/**
 *
 * @author Weny Kinanti
 */
public class DashboardNPTest {
    public static FrameFixture dashw;
    public static JPanelFixture prw;
    Connection connection;
    Statement stmt;
    ResultSet rsStock;
    int counter = 0;
    int counter2 = 0;
    
    @Before
    public void before() {
       DashboardNP dashboard = new DashboardNP();
        dashw = new FrameFixture(dashboard);
        Dimension size = dashboard.getSize();
        dashw.show(size); 
    }
    
    @After
    public void after() {
        dashw.cleanUp();
        
    }
    
    @Test
    public void guiDashboard(){
        dashw.requireVisible();
        
    }
    
     @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        DashboardNP.main(args);
    }
    
    @Test
    public void tabTest(){
        dashw.tabbedPane().requireTitle("Dashboard", atIndex(0));
        dashw.tabbedPane().requireTitle("Purchase Request", atIndex(1));
        dashw.tabbedPane().requireTitle("Warehouse", atIndex(2));
        //tab dashboard
        dashw.tabbedPane().selectTab( 0 );
        JTableFixture table1 = dashw.table( "prTable" );
        table1.requireVisible();
        //tab Warehouse
        dashw.tabbedPane().selectTab( 2 );
        JTableFixture stockTable = dashw.table( "stockTable" );
        stockTable.requireVisible();
    }
    
    @Test
    public void showMinPRTest(){
        JTableFixture table1 = dashw.table( "prTable" );
        table1.cell(row(0).column(0)).requireValue( "1" );
        table1.cell(row(0).column(1)).requireValue( "Pesan Monitor LG" );
        table1.cell(row(0).column(2)).requireValue( "Inprogress" );
    }
    
    @Test
    public void showStockTest(){
        dashw.tabbedPane().selectTab( 2 );
        JTableFixture table2 = dashw.table( "stockTable" );
        table2.cell(row(0).column(0)).requireValue( "KAS4402" );
        table2.cell(row(0).column(1)).requireValue( "Laptop Asus" );
        table2.cell(row(0).column(2)).requireValue( "4" );
    }
    
    @Test
    public void prEmptyTest(){
        dashw.tabbedPane().selectTab( 1 );
        dashw.button("submitBtn").click();
        dashw.optionPane().requireMessage("Data harus diisi dengan lengkap dan benar");
    }
    
    @Test
    public void logoutTest(){
        dashw.button("logoutBtn").click();
        dashw.optionPane().requireMessage("Apakah anda yakin ingin Logout?");
        dashw.optionPane().yesButton().click();
        dashw.cleanUp();
                
    }
    
    @Test
    public void failLogoutTest(){
        dashw.button("logoutBtn").click();
        dashw.optionPane().requireMessage("Apakah anda yakin ingin Logout?");
        dashw.optionPane().noButton().click();     
    }
    
    @Test
    public void createPRTest1(){
        dashw.tabbedPane().selectTab( 1 );
        JTableFixture table2 = dashw.table( "createPRTable" );
        dashw.textBox("prText").enterText("Pengadaan Mouse");
        dashw.textBox("userID").enterText("199703070020");
        table2.cell(row(0).column(0)).requireValue("Item ID").enterValue("MLG2417").requireValue("MLG2417");
        //table2.cell(row(0).column(1)).requireValue("Nama Barang");
        table2.cell(row(0).column(2)).requireValue("1").enterValue("2").requireValue("2");
        //table2.cell(row(0).column(3)).requireValue("Pengukuran");
        table2.cell(row(0).column(4)).requireValue("Tulis Keterangan").enterValue("Pengganti Rusak").requireValue("Pengganti Rusak");
        dashw.button("submitBtn").click();
        dashw.optionPane().requireMessage("Data Tersimpan");
    }
    
    @Test
    public void createdbPRTest(){
        try {
            connection = DriverManager.getConnection("jdbc:ucanaccess://" + "D:/PurchasingAssistant.accdb;","", "");
            stmt = connection.createStatement();
            rsStock = stmt.executeQuery("SELECT * FROM PR");
            while(rsStock.next()){
                counter++;
            }
            dashw.tabbedPane().selectTab( 1 );
            JTableFixture table2 = dashw.table( "createPRTable" );
            dashw.textBox("prText").enterText("Pengadaan Mouse");
            dashw.textBox("userID").enterText("199703070020");
            table2.cell(row(0).column(0)).requireValue("Item ID").enterValue("MLG2417").requireValue("MLG2417");
            //table2.cell(row(0).column(1)).requireValue("Nama Barang");
            table2.cell(row(0).column(2)).requireValue("1").enterValue("2").requireValue("2");
            //table2.cell(row(0).column(3)).requireValue("Pengukuran");
            table2.cell(row(0).column(4)).requireValue("Tulis Keterangan").enterValue("Pengganti Rusak").requireValue("Pengganti Rusak");
            dashw.button("submitBtn").click();
            
            rsStock = stmt.executeQuery("SELECT * FROM PR");
            while(rsStock.next()){
                counter2++;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DashboardNPTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        assertEquals(counter+1,counter2);
    }
      
}
