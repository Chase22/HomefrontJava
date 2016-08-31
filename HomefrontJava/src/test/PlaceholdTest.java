package test;

import java.lang.reflect.InvocationTargetException;

import control.PlaceholdParser;

public class PlaceholdTest {
	public static void start() {
		PlaceholdTest test = new PlaceholdTest(5, "Test");

		String template = "Dies ist der %test1%te %test2%";

		try {
			template = PlaceholdParser.parse(test, template);
			System.out.println(template);
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			e.printStackTrace();
		}

	}

	private int test1;
	private String test2;

	public int getTest1() {
		return test1;
	}

	public void setTest1(int test1) {
		this.test1 = test1;
	}

	public String getTest2() {
		return test2;
	}

	public void setTest2(String test2) {
		this.test2 = test2;
	}

	public PlaceholdTest(int test1, String test2) {
		super();
		this.test1 = test1;
		this.test2 = test2;
	}

}
