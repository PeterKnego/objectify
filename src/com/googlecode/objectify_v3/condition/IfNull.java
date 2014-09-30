package com.googlecode.objectify_v3.condition;


/**
 * <p>Simple If condition that returns true if the value is null.</p>
 * 
 * @author Jeff Schnitzer <jeff@infohazard.org>
 */
public class IfNull extends ValueIf<Object>
{
	@Override
	public boolean matches(Object value)
	{
		return value == null;
	}
}
