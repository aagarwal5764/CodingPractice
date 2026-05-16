package com.junit5.test;

import com.junit5.src.Demo;
import org.junit.jupiter.api.*;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class DemoTest {

    @BeforeAll
    static void beforeAll(){
        System.out.println("Before All Test");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("After All Test");
    }

    Demo demo;

    @BeforeEach
    void init(){
        demo = new Demo();
        System.out.println("Before Test");
    }

    @Test
    void test(){
        assertEquals(25, demo.computeSquare(5));
        assertEquals(25, demo.computeSquare(5), "Failed statement");
        assertEquals(25, demo.computeSquare(5), () -> "Failed statement");
        assertNotEquals(26, demo.computeSquare(5));
        assertNotEquals(26, demo.computeSquare(5), "Failed statement");
        assertTrue(demo.computeSquare(5) == 25);
        assertFalse(demo.computeSquare(5) != 25);

        assertArrayEquals(new int[]{2, 4, 6}, demo.doubles(new int[]{1, 2, 3}));
        //assertThrows(NullPointerException.class, );
        assertTimeout(Duration.ofMillis(10), () -> demo.doubles(new int[]{1, 2, 3}));


    }

    @AfterEach
    void destroy(){
        System.out.println("After Test Clean-up");
    }
}