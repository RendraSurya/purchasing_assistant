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
    
        @Test
    public void noPgwStringTest(){
        window.textBox("noPgwTxt").enterText("Bos");
        window.button("loginBtn").click();
        window.optionPane().requireMessage("Nomor Pegawai Harus Dalam Angka");
    }
    
    @Test
    public void inputEmptyTest(){
        window.textBox("noPgwTxt").enterText("");
        window.textBox("passPgwTxt").enterText("");
        window.button("loginBtn").click();
        window.optionPane().requireMessage("Nomor Pegawai Harus Dalam Angka");
        
    }
    
    @Test
    public void validateUserTest(){
        LoginScreen login = new LoginScreen();
        window.textBox("noPgwTxt").enterText("199304090007");
        window.textBox("passPgwTxt").enterText("happy9493");
        window.button("loginBtn").click();
        String noPgw = "199304090007";
        String passPgw = "happy9493";
        boolean result=login.validateUser(noPgw,passPgw);
        assertTrue(result);
    }
    
    @Test
    public void invalidUPTest(){
        LoginScreen login = new LoginScreen();
        window.textBox("noPgwTxt").enterText("19930");
        window.textBox("passPgwTxt").enterText("");
        window.button("loginBtn").click();
        String noPgw = "19930";
        String passPgw = "";
        boolean result=login.validateUser(noPgw,passPgw);
        assertFalse(result);
    }
    
    @Test
    public void unvalidUserTest(){
        LoginScreen login = new LoginScreen();
        window.textBox("noPgwTxt").enterText("19784");
        window.textBox("passPgwTxt").enterText("happy9493");
        window.button("loginBtn").click();
        String noPgw = "19930";
        String passPgw = "happy9493";
        boolean result=login.validateUser(noPgw,passPgw);
        assertFalse(result);
    }
   
    @Test
    public void unvalidPassTest(){
        LoginScreen login = new LoginScreen();
        window.textBox("noPgwTxt").enterText("199703070020");
        window.textBox("passPgwTxt").enterText("happy");
        window.button("loginBtn").click();
        String noPgw = "199703070020";
        String passPgw = "happy";
        boolean result=login.validateUser(noPgw,passPgw);
        assertFalse(result);
    }
    
    
}
