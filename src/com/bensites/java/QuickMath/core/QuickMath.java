package com.bensites.java.QuickMath.core;
import java.util.ArrayList;

public class QuickMath {
	public static ArrayList<String> params;
	public static OperatorRegistry registry;
	public static void main(String[] args) {
		print("Running");
		params = toArray(args);
	}
	public static ArrayList<String> toArray(String[] args){
		ArrayList<String> argsList = new ArrayList<String>();
		for(String argument : args)
			argsList.add(argument);
		return argsList;
	}
	public static void print(Object print){
		try{
			String printString = (String) print;
			if(printString.startsWith(" ")){
				System.out.print(printString);
			} else {
				System.out.println();
				System.out.print(printString);
			}
		} catch(java.lang.ClassCastException e){
			System.out.println();
			System.out.print(print);
		}
	}
}
