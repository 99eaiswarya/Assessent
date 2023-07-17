package com.in28minutes.mockito.mockitodemo.list;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListTest {
    @Test
    public void simpleTest(){
        List listMock=mock(List.class);
        //listMock.size()=>3
        when(listMock.size()).thenReturn(3);
        assertEquals(3,listMock.size());
    }
    @Test
    public void multipleReturns(){
        List listMock=mock(List.class);
        //listMock.size()=>3
        when(listMock.size()).thenReturn(1).thenReturn(2);
        assertEquals(1,listMock.size());
        assertEquals(2,listMock.size());
    }

    @Test
    public void specificParameters(){
        List listMock=mock(List.class);
        //listMock.size()=>3
        when(listMock.get(0)).thenReturn("SomeString");
        assertEquals("SomeString",listMock.get(0));

    }
    @Test
    public void genericParameters(){
        List listMock=mock(List.class);
        //listMock.size()=>3
        when(listMock.get(Mockito.anyInt())).thenReturn("SomeOtherString");
        assertEquals("SomeOtherString",listMock.get(0));

    }

}
