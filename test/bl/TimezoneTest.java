/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

import java.time.LocalTime;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;

/**
 *
 * @author Elias
 */
public class TimezoneTest {
    
    public TimezoneTest() {
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
     * Test of run method, of class Timezone.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        Timezone test = new Timezone(LocalTime.now());
        new Thread(test).start();
        if(LocalTime.now().getHour() == test.getTime().getHour()){
            if(LocalTime.now().getMinute() == test.getTime().getMinute()){
                assertEquals(LocalTime.now()
                        .getSecond(), test.getTime().getSecond());
            }
            else{
                fail();
            }
        }
        else{
            fail();
        }
    }
    
}
