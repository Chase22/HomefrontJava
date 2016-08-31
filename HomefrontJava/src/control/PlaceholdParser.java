package control;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PlaceholdParser {
	public static String parse(Object object, CharSequence template) throws NoSuchMethodException, SecurityException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		ArrayList<String> placeholders = new ArrayList<String>();
		Pattern p = Pattern.compile("%[^%]+%");
		Matcher m = p.matcher(template);
		while (m.find()) {
			placeholders.add((m.group().subSequence(1, m.group().length() - 1).toString()));
		}

		for (String string : placeholders) {
			//Camelcasing
			String camelString = string.substring(0, 1).toUpperCase() + string.substring(1);
			String methodName = "get" + camelString;
			Method method = object.getClass().getMethod(methodName);
			Object returnValue = method.invoke(object);
			String placeholder = "%" + string + "%";
			template = template.toString().replaceAll(placeholder, returnValue.toString());
		}
		return template.toString();
	}
}
