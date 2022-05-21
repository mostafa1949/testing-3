package DigitalWatch.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import DigitalWatch.src.DigitalWatch;

public class DigitalWatchTest {
    DigitalWatch a;
    @Before
    public void setUp() throws Exception {
        a= new DigitalWatch();
    }

    @Test
    public void test1() {
        a.forInput('c');
        a.forInput('a');
        assertEquals("hour",a.getInnerState());
        assertEquals("UPDATE",a.getState());
    }
    @Test
    public void test2() {
        a.forInput('b');
        a.forInput('a');
        assertEquals("chime",a.getInnerState());
        assertEquals("ALARM",a.getState());
    }
    @Test
    public void test3() {
        a.forInput('c');
        a.forInput('b');
        assertEquals("min",a.getInnerState());
        assertEquals("UPDATE",a.getState());
        assertEquals(1,a.getMin());
    }
    @Test
    public void test4() {
        a.forInput('c');
        a.forInput('a');
        a.forInput('a');
        a.forInput('b');
        assertEquals("day",a.getInnerState());
        assertEquals("UPDATE",a.getState());
        assertEquals(2,a.getDay());
    }


}