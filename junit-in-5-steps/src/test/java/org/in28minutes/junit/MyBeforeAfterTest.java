package org.in28minutes.junit;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions.*;


public class MyBeforeAfterTest {
    @BeforeEach
    void beforeEach(){
        System.out.println("BeforeEach");
    }
    @Test
    public void test1(){
        System.out.println("test1");
    }
    @Test
    public void test2(){
        System.out.println("test2");
    }
    @Test
    public void test3(){
        System.out.println("test3");
    }
    @AfterEach
    public void afterEach(){
        System.out.println("AfterEach");
    }

}
