package com.bensites.java.QuickMath.core;

import java.util.ArrayList;

public class OperatorRegistry {
	public ArrayList<Operator> Registry = new ArrayList<Operator>();
	public Operator register(Operator operator){
		Registry.add(operator);
		return operator;
	}
	public Operator[] getOperators(){
		return null;
	}
}
