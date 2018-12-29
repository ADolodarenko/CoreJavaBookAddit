package org.dav.learn.corejavabook.composite;

public class Rule
{
	private String name;
	private String porterDuff1;
	private String porterDuff2;

	public Rule(String n, String pd1, String pd2)
	{
		name = n;
		porterDuff1 = pd1;
		porterDuff2 = pd2;
	}

	public int getValue()
	{
		return 0;
	}

	public String getExplanation()
	{
		return null;
	}

	@Override
	public String toString()
	{
		return name;
	}
}
