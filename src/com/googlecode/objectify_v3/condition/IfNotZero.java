package com.googlecode.objectify_v3.condition;


/**
 * <p>Simple If condition that returns true if the value is anything other than zero.
 * Note that a null value returns true.</p>
 * 
 * @author Jeff Schnitzer <jeff@infohazard.org>
 */
public class IfNotZero extends ValueIf<Number>
{
	@Override
	public boolean matches(Number value)
	{
		return value != null && value.doubleValue() != 0;
	}
}
