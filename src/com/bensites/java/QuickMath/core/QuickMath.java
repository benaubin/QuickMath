package com.bensites.java.QuickMath.core;
import java.util.ArrayList;

import com.bensites.java.QuickMath.Operators.RegisterCore;

public class QuickMath {
	public static ArrayList<String> params;
	public static OperatorRegistry registry = new OperatorRegistry();
	public static void main(String[] args) {
		params = toArray(args);
		for (String arg : args)
			print(arg);
		print("Running");
		registerOperators();
		
		Operator operation = registry.getFromString(args[1]);
		print(operation.doOperation(params));
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
	public static void registerOperators(){
		RegisterCore.register();
	}
}
