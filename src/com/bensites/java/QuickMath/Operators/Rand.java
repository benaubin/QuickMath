package com.bensites.java.QuickMath.Operators;

import java.util.ArrayList;
import java.util.Random;

import com.bensites.java.QuickMath.core.Operator;

public class Rand extends Operator{

	public Rand() {
		super("rand", 2);
	}
	@Override
	public double doOperation(ArrayList<String> args) {
		Random r = new Random();
		double between = Double.parseDouble(args.get(0));
		return r.nextDouble() * between;
	};
}
