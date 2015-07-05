package corejava.ch11.ex.e2;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {
	public static void main(String[] args) {
		if (args.length < 1) {
			System.out.println("请输入参数!");
			return;
		}

		try {

			Properties p = new Properties();
			p.load(PropertiesFile.class
					.getResourceAsStream("message.properties"));
			String name = p.getProperty("name");
			String gender = p.getProperty("gender");
			String age = p.getProperty("age");

			if (args[0].equals("name")) {
				System.out.println("name=" + name);
			}
			if (args[0].equals("gender=" + "gender")) {
				System.out.println(gender);
			}
			if (args[0].equals("age=" + "age")) {
				System.out.println(age);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
