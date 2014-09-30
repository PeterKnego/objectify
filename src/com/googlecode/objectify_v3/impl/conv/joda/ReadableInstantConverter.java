package com.googlecode.objectify_v3.impl.conv.joda;

import java.lang.reflect.Constructor;
import java.util.Date;

import org.joda.time.ReadableInstant;

import com.googlecode.objectify_v3.impl.TypeUtils;
import com.googlecode.objectify_v3.impl.conv.Converter;
import com.googlecode.objectify_v3.impl.conv.ConverterLoadContext;
import com.googlecode.objectify_v3.impl.conv.ConverterSaveContext;


/**
 * Converts Joda ReadableInstants (DateTime, DateMidnight, etc) into java.util.Date 
 */
public class ReadableInstantConverter implements Converter
{
	@Override
	public Object forDatastore(Object value, ConverterSaveContext ctx)
	{
		if (value instanceof ReadableInstant)
			return ((ReadableInstant)value).toInstant().toDate();
		else
			return null;
	}

	@Override
	public Object forPojo(Object value, Class<?> fieldType, ConverterLoadContext ctx, Object onPojo)
	{
		if (value instanceof Date && ReadableInstant.class.isAssignableFrom(fieldType))
		{
			// All the Joda instants have a constructor that will take a Date
			Constructor<?> ctor = TypeUtils.getConstructor(fieldType, Object.class);
			return TypeUtils.newInstance(ctor, value);
		}
		else
			return null;
	}
}
