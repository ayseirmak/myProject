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
		ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(1, 2, 3, 6));
		assertTrue(new App().double_search(array,array2,2,3));
		}
		public void testNotFound() {
		ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
		ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(1, 2, 3, 6));
		assertFalse(new App().double_search(array,array2,4,6));
		}
		public void testEmptyArray() {
		ArrayList<Integer> array = new ArrayList<>();
		ArrayList<Integer> array2 = new ArrayList<>();
		assertFalse(new App().double_search(array, array2,4,6));
		}
		public void testNull() {
		assertFalse(new App().double_search(null, null,1,2));
		}

    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}
