package com.googlecode.objectify_v3.test.entity;

import javax.persistence.Embedded;
import javax.persistence.Id;

import com.googlecode.objectify_v3.annotation.Cached;

/**
 */
@Cached
public class Town
{
	@Id
	public Long id;

	public String name;
	
	@Embedded
	public Person mayor;

	@Embedded
	public Person[] folk;
}
