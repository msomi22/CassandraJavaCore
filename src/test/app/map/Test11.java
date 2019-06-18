package test.app.map;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Test11 {

	static String content = "<gg>3306</gg> <gg>3306</gg> <gg>3306</gg> <gg>3306</gg> ";
	//<name>peter</name>

	public static void main(String[] args) {


		//replaceValue("name","peter");

		String name = "KCB_EN_KCB_13062019.csv.AD2-REPORT.csv.asc";
		name  = name.replaceAll("\\..*$", "");
		System.out.println("name = " + name);

	}


	private static void replaceValue(String tag, String value) {
		String regex = "<(.*?)>(.*?)</(.*?)>";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(content);

		if (matcher.find()) {                                                
			content = content.replaceAll(matcher.group(1), tag)
					.replaceAll(matcher.group(2), value)
					.replaceAll(matcher.group(3), tag);
		}
		System.out.println(content);
	}

}
