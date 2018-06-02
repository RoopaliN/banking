/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class banking {
    
    create c;
    
    
    public banking() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        c=new create();
        
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void create() {
        assertEquals(0, c.addAcc(10,10));
         assertEquals(20, c.addAcc(20,200));
          assertEquals(30, c.addAcc(30,345));
    }
    
    @Test
    public void deposit() {
        assertEquals(6000, c.deposit(1000,1020,1020,5000));
        assertEquals(15000, c.deposit(5000,1021,1021,10000));
        assertEquals(13800, c.deposit(8800,1022,1022,5000));
    }
    
    @Test
    public void withdraw() {
        assertEquals(500, c.withdraw(500,2099,2099,1000));
        assertEquals(900, c.withdraw(100,2066,2066,1000));
        assertEquals(122, c.withdraw(878,2055,2055,1000));
    }
    
    @Test
    public void totbal() {
        assertEquals(5000, c.totbal(5000));
    }
    
    
    @Test
    public void transfer() {
        assertEquals(9000, c.transfer(1055,10000,1000,1056));
        assertEquals(8990, c.transfer(1057,10078,1088,5687));
        assertEquals(48400, c.transfer(5523,56000,7600,5654));
    }
    
    @Test
    public void richest() {
        assertEquals(50000, c.richest(50000,5500,1));
    }    
}
