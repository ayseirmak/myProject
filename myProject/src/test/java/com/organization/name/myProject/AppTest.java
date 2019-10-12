package com.organization.name.myProject;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import junit.framework.TestCase;
import org.junit.Test;
/**
 * Unit test for simple App.
 */
public class AppTest 
{
	public void testFound() {
		ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
		assertTrue(new App().double_search(array, 4));
		}
		public void testNotFound() {
		ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
		assertFalse(new App().double_search(array, 5));
		}
		public void testEmptyArray() {
		ArrayList<Integer> array = new ArrayList<>();
		assertFalse(new App().double_search(array, 1));
		}
		public void testNull() {
		assertFalse(new App().double_search(null, 1));
		}

    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}
