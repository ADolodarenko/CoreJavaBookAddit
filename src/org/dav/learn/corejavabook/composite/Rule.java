package org.dav.learn.corejavabook.composite;

import java.awt.*;

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
		try
		{
			return (Integer) AlphaComposite.class.getField(name).get(null);
		}
		catch (Exception e)
		{
			return -1;
		}
	}

	public String getExplanation()
	{
		StringBuilder r = new StringBuilder("Source ");
		if (porterDuff2.equals("  ")) r.append("clears");
		if (porterDuff2.equals(" S")) r.append("overwrites");
		if (porterDuff2.equals("DS")) r.append("blends with");
		if (porterDuff2.equals(" D")) r.append("alpha modifies");
		if (porterDuff2.equals("D ")) r.append("alpha complement modifies");
		if (porterDuff2.equals("DD")) r.append("does not affect");
		r.append(" destination");
		if (porterDuff1.equals(" S")) r.append(" and overwrites empty pixels");
		r.append(".");

		return r.toString();
	}

	@Override
	public String toString()
	{
		return name;
	}
}
