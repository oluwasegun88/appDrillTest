package testsDrillerApplication;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import testDrillerClass.TestDrillerApp;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class testDrillerTesting {

    @Test
    @DisplayName("To Assert That Object Exist")
    void toAssertThatObjectExist(){
        TestDrillerApp testDriller = new TestDrillerApp();
        assertNotNull(testDriller);
    }

    @Test
    void toCalculatePriceFor3Copies(){
        TestDrillerApp testDrillerApp = new TestDrillerApp();
        int amount = testDrillerApp.calculateQuantityOfBooks(3);
        assertEquals(6000 , amount);

    }
    @Test
    void toCalculatePriceFor5Copies(){
        TestDrillerApp testDrillerApp = new TestDrillerApp();
        int amount = testDrillerApp.calculateQuantityOfBooks(5);
        assertEquals( 9000, amount);
    }

    @Test
    void toCalculatePriceFor20Copies(){
        TestDrillerApp testDrillerApp = new TestDrillerApp();
        int amount = testDrillerApp.calculateQuantityOfBooks(20);
        assertEquals( 32000, amount);
    }

    @Test
    void toCalculatePriceFor40Copies(){
        TestDrillerApp testDrillerApp = new TestDrillerApp();
        int amount = testDrillerApp.calculateQuantityOfBooks(40);
        assertEquals(60000 , amount);

    }
    @Test
    void toCalculatePriceFor60Copies(){
        TestDrillerApp testDrillerApp = new TestDrillerApp();
        int amount = testDrillerApp.calculateQuantityOfBooks(60);
        assertEquals( 78000, amount);

    }
    @Test
    void toCalculatePriceFor80Copies(){
        TestDrillerApp testDrillerApp = new TestDrillerApp();
        int amount = testDrillerApp.calculateQuantityOfBooks(80);
        assertEquals(96000, amount);

    }
    @Test
    void toCalculatePriceFor300Copies(){
        TestDrillerApp testDrillerApp = new TestDrillerApp();
        int amount = testDrillerApp.calculateQuantityOfBooks(300);
        assertEquals(330000, amount);

    }
    @Test
    void toCalculatePriceFor600Copies(){
        TestDrillerApp testDrillerApp = new TestDrillerApp();
        int amount = testDrillerApp.calculateQuantityOfBooks(600);
        assertEquals(600000, amount);

    }
}
