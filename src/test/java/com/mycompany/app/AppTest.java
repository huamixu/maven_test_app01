package com.mycompany.app;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class AppTest {   
    private static App app = new App();

    @Before
    public void setUp() throws Exception {
        app.clear();
    }

    @Test
    public void testAdd() {
        com.mycompany.app.App.add(3);
        App.add(4);
        assertEquals(7, App.getResult());

    }

    @Test
    public void testSubstract() {
        App.add(8);
        app.substract(3);
        assertEquals(5, App.getResult());

    }

//    @Ignore("Multiply() Not yet implemented")
//    
//    @Test
//    public void testMultiply() {
//        fail("Not yet implemented");
//    }
//    
// 
//
//    @Test
//    public void testDivide() {
//        App.add(8);
//        App.divide(2);
//        assertEquals(4, App.getResult());
//        
//        
//    }
//    
//    @Test(timeout = 1000)
//    public void squareRoot() {
//        App.squareRoot(4);
//        assertEquals(2, App.getResult());
//    }  

}


