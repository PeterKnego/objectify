/*
 * $Id: BeanMixin.java 1075 2009-05-07 06:41:19Z lhoriman $
 * $URL: https://subetha.googlecode.com/svn/branches/resin/rtest/src/org/subethamail/rtest/util/BeanMixin.java $
 */

package com.googlecode.objectify_v3.test;

import java.util.Arrays;
import java.util.logging.Logger;

import org.testng.annotations.Test;

import com.googlecode.objectify_v3.Key;
import com.googlecode.objectify_v3.Objectify;
import com.googlecode.objectify_v3.test.entity.HasArrays;

/**
 * Tests of persisting arrays
 * 
 * @author Jeff Schnitzer <jeff@infohazard.org>
 */
public class ArrayTests extends TestBase
{
	/** */
	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger(ArrayTests.class.getName());
	
	/** */
	@Test
	public void testStringArrays() throws Exception
	{
		Objectify ofy = this.fact.begin();
		
		HasArrays hasa = new HasArrays();
		hasa.strings = new String[] { "red", "green" };
		
		Key<HasArrays> k = ofy.put(hasa);

		HasArrays fetched = ofy.get(k);

		assert Arrays.equals(fetched.strings, hasa.strings);
	}

	/** */
	@Test
	public void testIntArrays() throws Exception
	{
		Objectify ofy = this.fact.begin();
		
		HasArrays hasa = new HasArrays();
		hasa.ints = new int[] { 5, 6 };
		
		Key<HasArrays> k = ofy.put(hasa);

		HasArrays fetched = ofy.get(k);

		assert Arrays.equals(fetched.ints, hasa.ints);
	}

	/** */
	@Test
	public void testIntegerArrays() throws Exception
	{
		Objectify ofy = this.fact.begin();
		
		HasArrays hasa = new HasArrays();
		hasa.integers = new Integer[] { 5, 6 };
		
		Key<HasArrays> k = ofy.put(hasa);

		HasArrays fetched = ofy.get(k);

		assert Arrays.equals(fetched.integers, hasa.integers);
	}

	/** */
	@Test
	public void testLongArrays() throws Exception
	{
		Objectify ofy = this.fact.begin();
		
		HasArrays hasa = new HasArrays();
		hasa.longs = new long[] { 5, 6 };
		
		Key<HasArrays> k = ofy.put(hasa);

		HasArrays fetched = ofy.get(k);

		assert Arrays.equals(fetched.longs, hasa.longs);
	}

}
