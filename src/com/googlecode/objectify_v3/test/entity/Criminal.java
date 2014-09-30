package com.googlecode.objectify_v3.test.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.Embedded;
import javax.persistence.Id;

import com.googlecode.objectify_v3.annotation.Cached;

/**
 * Entity for testing null/empty embedded arrays and collections
 */
@Cached
public class Criminal
{
	@Id
	public Long id;
	
	@Embedded
	public Name[] aliases;
	
	@Embedded
	public List<Name> moreAliases;

	@Embedded
	public Set<Name> aliasesSet;

	public Criminal()
	{
	}
}
