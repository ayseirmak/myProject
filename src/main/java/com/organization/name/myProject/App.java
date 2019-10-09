package com.organization.name.myProject;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	public static boolean double_search(ArrayList<Integer> array, int e) {
    		System.out.println("inside double search");
    		if (array == null) return false;
    		for (int elt : array) {
    		if (elt == 2*e) return true;
    		}
    		return false;
    		}

    }
}
