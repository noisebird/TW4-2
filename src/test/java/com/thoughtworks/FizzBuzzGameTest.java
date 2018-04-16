package com.thoughtworks;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.List;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
public class FizzBuzzGameTest {
    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Mock
    private AquireReader reader;
    private FizzBuzzGame game;
    public FizzBuzzGameTest(){
        MockitoAnnotations.initMocks(this);
    }
    @Before
    public void setUp(){
        game=new FizzBuzzGame();
        System.setOut(new PrintStream(outContent));
    }
    @Test
    public void should_return_Fizz_when_have_input_3_number_is_correct() {
        Teacher teacher=new Teacher(3,5,7);
        assertTrue(teacher.isReasonableNum());
    }
    @Test
    public void should_return_Fizz_when_the_number_out_of_bound() {
        Teacher teacher=new Teacher(3,15,7);
        assertFalse(teacher.isReasonableNum());
    }

    @Test
    public void should_return_the_same_result() throws Exception {
        when(reader.read()).thenReturn(100);
        game.init(reader);
        assertEquals("1",game.getResults().get(0));
    }

}
