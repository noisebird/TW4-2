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

    @Test
    public void should_person_3_then_return_fizz() throws Exception {
        when(reader.read()).thenReturn(100);
        game.init(reader);
        assertEquals("Fizz",game.getResults().get(2));

    }
    @Test
    public void should_person_5_then_return_fizz() throws Exception {
        when(reader.read()).thenReturn(100);
        game.init(reader);
        assertEquals("Buzz",game.getResults().get(4));

    }
    @Test
    public void should_person_7_then_return_fizz() throws Exception {
        when(reader.read()).thenReturn(100);
        game.init(reader);
        assertEquals("Whizz",game.getResults().get(6));

    }
    @Test
    public void should_person_13_then_return_fizz() throws Exception {
        when(reader.read()).thenReturn(100);
        game.init(reader);
        assertEquals("Fizz",game.getResults().get(12));

    }
    @Test
    public void should_person_63_then_return_fizz() throws Exception {
        when(reader.read()).thenReturn(100);
        game.init(reader);
        assertEquals("Fizz",game.getResults().get(62));

    }
    @Test
    public void should_person_15_then_return_fizz() throws Exception {
        when(reader.read()).thenReturn(100);
        game.init(reader);
        assertEquals("FizzBuzz",game.getResults().get(14));

    }
    @Test
    public void should_person_21_then_return_fizz() throws Exception {
        when(reader.read()).thenReturn(100);
        game.init(reader);
        assertEquals("FizzWhizz",game.getResults().get(20));

    }
    @Test
    public void should_person_35_then_return_fizz() throws Exception {
        when(reader.read()).thenReturn(100);
        game.init(reader);
        assertEquals("Fizz",game.getResults().get(34));

    }
    @Test
    public void should_person_105_then_return_fizz() throws Exception {
        when(reader.read()).thenReturn(110);
        game.init(reader);
        assertEquals("FizzBuzzWhizz",game.getResults().get(104));

    }

    @Test
    public void other_test() throws Exception {
//  verify验证行为是否发生
        List<Integer> mock=mock(List.class);
        mock.add(1);
        mock.add(2);
        mock.clear();
        verify(mock).add(1);
//        verify(mock).add(3);
        verify(mock).clear();
//  模拟数据
        Iterator<String> it=mock(Iterator.class);
        when(it.next()).thenReturn("hello ").thenReturn("world").thenReturn(" !");
        assertEquals("hello world !",it.next()+it.next()+it.next());
    }
}
