package com.sarkar;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.sarkar.controller.LoginController;

/**
 * Unit test for simple App.
 */
public class AppTest {


    /**
     * Rigourous Test :-)
     */
	@Test
    public void testApp()
    {
    	LoginController lg = new LoginController();
    	String results = lg.Login();
    	assertEquals(results, "Wel Come to Sarkar Dairy Farm");
        
    }
}
