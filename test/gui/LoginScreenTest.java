/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import static org.junit.Assert.*;
import java.awt.Dimension;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.fest.swing.fixture.FrameFixture;


/**
 *
 * @author Weny Kinanti
 */
public class LoginScreenTest {
    public static FrameFixture window;
    public static FrameFixture dashw;
    
    public LoginScreenTest() {
    }
    
    @Before
    public void before() {
        LoginScreen login = new LoginScreen();
        window = new FrameFixture(login);
        Dimension size = login.getSize();
        window.show(size);
    }
    
    @After
    public void after() {
        window.cleanUp();
        
    }
    
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        LoginScreen.main(args);
    }
   
    
    @Test
    public void testTampilanAwal(){
        window.textBox("noPgwTxt").requireEditable();
        assertTrue(window.textBox("noPgwTxt").text().contains("Nomor Pegawai"));
        window.textBox("passPgwTxt").requireEditable();
        assertTrue(window.textBox("passPgwTxt").text().contains("Password"));
        window.button("loginBtn").requireVisible();
    }
    
    
    
    
}
