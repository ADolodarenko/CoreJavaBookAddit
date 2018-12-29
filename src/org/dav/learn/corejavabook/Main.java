package org.dav.learn.corejavabook;

import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;
import java.util.List;

public class Main
{
	public static void main(String[] args)
	{
        /*
        LocalDate date = DateTimeUtil.getLocalDate(2016, 256);

        System.out.println(date.format(DateTimeFormatter.BASIC_ISO_DATE));

        date = DateTimeUtil.getLocalDate(2018, 256);
        System.out.println(date.format(DateTimeFormatter.BASIC_ISO_DATE));

        for (Locale locale : Locale.getAvailableLocales())
            System.out.println(locale.toLanguageTag() + " - " + locale.getDisplayName(Locale.forLanguageTag("en_US")));
            */

        /*System.out.println(Normalizer.normalize("Žena se na něho dívala a ptala se ho", Normalizer.Form.NFKC));

        DateFormat format = new SimpleDateFormat("dd.MM.yyyy_HH_mm_ss");
        System.out.println(format.format(new Date()));*/

		ScriptEngineManager manager = new ScriptEngineManager();
		for (ScriptEngineFactory factory : manager.getEngineFactories())
		{
			StringBuilder builder = new StringBuilder(factory.getEngineName());
			builder.append(": ");

			completeBuilder(builder, factory.getNames(), ", ", "; ");
			completeBuilder(builder, factory.getMimeTypes(), ", ", "; ");
			completeBuilder(builder, factory.getExtensions(), ", ", ".");

			System.out.println(builder.toString());
		}
	}

	private static void completeBuilder(StringBuilder builder, List<String> values, String separator, String suffix)
	{
		if (builder == null || values == null || values.isEmpty())
			return;

		for (String value : values)
			builder.append(value).append(separator);

		builder.delete(builder.length() - 2, builder.length());
		builder.append(suffix);
	}
}
