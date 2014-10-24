package com.bensites.java.QuickMath.core;

import java.util.ArrayList;

public class Operator{
	public Operator(String operator, int ArgumentsNeeded){
		getOperator = operator;
		argumentsNeeded = ArgumentsNeeded;
		QuickMath.registry.register(this);
	}
	public final int argumentsNeeded;
	public final String getOperator;
	
	/**
	 * Does the operation - defaults to running with doOperation with just supplying a the 0th and 2nd number as doubles.
	 * @param Arguments of operation (should be formed like "x operator x")
	 * @return Value when returned.
	 */
	public double doOperation(ArrayList<String> args) {
		return doOperation(Double.valueOf(args.get(0)),Double.valueOf(args.get(2)));
	};
	
	public double doOperation(double left, double right){
		throw(new java.lang.ClassFormatError("This operator ("+ this.getOperator +") is broken"));
	}
}
