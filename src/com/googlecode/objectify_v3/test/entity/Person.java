package com.googlecode.objectify_v3.test.entity;

import javax.persistence.Embedded;

import com.googlecode.objectify_v3.annotation.Cached;

/**
 */
@Cached
public class Person
{
	@Embedded
	public Name name;
	public int age;

	public Person()
	{
	}

	public Person(Name name, int age)
	{
		this.name = name;
		this.age = age;
	}
}
