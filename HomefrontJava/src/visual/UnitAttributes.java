package visual;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import javax.swing.*;

import control.PlaceholdParser;
import data.Unit;

public class UnitAttributes extends JPanel {
	JEditorPane htmlPane;

	public UnitAttributes(Unit unit) {
		String html = "";

		try {
			InputStream htmlStream = this.getClass().getResourceAsStream("UnitTemplate.html");
			StringBuilder sb = new StringBuilder();

			while (true) {
				byte[] bytes = new byte[1];
				int number = htmlStream.read(bytes);
				if (number == -1) {
					break;
				}
				sb.append(new String(bytes));
			}

			html = sb.toString();
			
			try {
				html = PlaceholdParser.parse(unit, html);
			} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e) {
				e.printStackTrace();
			}
			
			htmlPane = new JEditorPane("text/html", html);

			this.add(htmlPane);
			htmlPane.setSize(500, 500);
			htmlPane.setEditable(false);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
