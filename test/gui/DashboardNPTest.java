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
    
      
}
