package org.in28minutes.junit;

//import org.junit.Test;
import org.junit.jupiter.api.*;
//import org.junit.jupiter.api.BeforeEach;

public class MyMathBeforeAfter {
    @BeforeAll
    static void beforeAll(){
        System.out.println("BeforeAll");
    }
    @BeforeEach
    public void beforeEach(){
        System.out.println("beforeEach");
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
    @AfterAll
    static void afterAll(){
        System.out.println("AfterAll");
    }

}