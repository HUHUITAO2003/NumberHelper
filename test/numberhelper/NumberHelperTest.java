/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberhelper;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author juliet
 */
public class NumberHelperTest {
    
    public NumberHelperTest() {
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
     * Test of isEven method, of class NumberHelper.
     */
    @Test
    public void testIsEven() {
        System.out.println("isEven");
        NumberHelper instance = new NumberHelper(3);
        boolean expResult = false;
        boolean result = instance.isEven();
        assertEquals(expResult, result);
    }

    /**
     * Test of isOdd method, of class NumberHelper.
     */
    @Test
    public void testIsOdd() {
        System.out.println("isOdd");
        NumberHelper instance = new NumberHelper(3);
        boolean expResult = true;
        boolean result = instance.isOdd();
        assertEquals(expResult, result);
    }

    /**
     * Test of sum method, of class NumberHelper.
     */
    @Test
    public void testSum() {
        System.out.println("sum");
        int n = -6;
        NumberHelper instance = new NumberHelper(1);
        int expResult = -5;
        int result = instance.sum(n);
        assertEquals(expResult, result);
    }

    /**
     * Test of isPrime method, of class NumberHelper.
     */
    @Test
    public void testIsPrime() {
        System.out.println("isPrime");
        NumberHelper instance = new NumberHelper(3);
        boolean expResult = true;
        boolean result = instance.isPrime();
        assertEquals(expResult, result);
    }

    /**
     * Test of isDivisibleBy method, of class NumberHelper.
     */
    @Test
    public void testIsDivisibleBy() {
        System.out.println("isDivisibleBy");
        int n = 3;
        NumberHelper instance = new NumberHelper(111);
        boolean expResult = true;
        boolean result = instance.isDivisibleBy(n);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isEven method, of class NumberHelper.
     */
    @Test
    public void testIsEven2() {
        System.out.println("isEven");
        NumberHelper instance = new NumberHelper(0);
        boolean expResult = true;
        boolean result = instance.isEven();
        assertEquals(expResult, result);
    }

    /**
     * Test of isOdd method, of class NumberHelper.
     */
    @Test
    public void testIsOdd2() {
        System.out.println("isOdd");
        NumberHelper instance = new NumberHelper(876868);
        boolean expResult = false;
        boolean result = instance.isOdd();
        assertEquals(expResult, result);
    }

    /**
     * Test of sum method, of class NumberHelper.
     */
    @Test
    public void testSum2() {
        System.out.println("sum");
        int n = -6;
        NumberHelper instance = new NumberHelper(-1);
        int expResult = -7;
        int result = instance.sum(n);
        assertEquals(expResult, result);
    }

    /**
     * Test of isPrime method, of class NumberHelper.
     */
    @Test
    public void testIsPrime2() {
        System.out.println("isPrime");
        NumberHelper instance = new NumberHelper(1);
        boolean expResult = true;
        boolean result = instance.isPrime();
        assertEquals(expResult, result);
    }

    /**
     * Test of isDivisibleBy method, of class NumberHelper.
     */
    @Test
    public void testIsDivisibleBy2() {
        System.out.println("isDivisibleBy");
        int n = 12;
        NumberHelper instance = new NumberHelper(144);
        boolean expResult = true;
        boolean result = instance.isDivisibleBy(n);
        assertEquals(expResult, result);
    }
}
