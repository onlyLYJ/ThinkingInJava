package util;

import java.util.Arrays;

public class Print {
	
	public static final String SEPERATOR = ", "; 
	public static final String NEW_LINE = "\n"; 
	public static final String PREFIX = "["; 
	public static final String SUFFIX = "]"; 
	
	public static void print(Object o){
		System.out.print(o);
	}
	
	public static void println(Object o){
		System.out.println(o);
	}
	
	public static void printArr(Object[] o){
		Arrays.toString(o);
		
	}

}
