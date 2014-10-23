package com.bensites.java.QuickMath.core;

import java.util.ArrayList;

public interface Operator{
	/**
	 * Gets operator name to be praised as.
	 * @since Release
	 * @author Ben
	 * @return Name of Operator, to be praised as
	 */
	public String getOperatorName();
	public double doOperation(ArrayList<String> args);
	public int argumentsNeeded();
}
