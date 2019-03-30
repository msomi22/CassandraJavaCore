package test.app;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		/*ArrayList<Integer> years = new ArrayList<Integer>();
		years.add(2016);
		years.add(2017);
		years.add(2018);
		System.out.println(years); 
		int updatedMonth = (Integer)Collections.max(years);
		System.out.println(updatedMonth); */
		
		File folder = new File("E:\\logs");
		File[] listOfFiles = folder.listFiles();

		for (int i = 0; i < listOfFiles.length; i++) {
		  if (listOfFiles[i].isFile()) {
		    System.out.println("File " + listOfFiles[i].getName());
		    try {
				List<String> content = Files.readAllLines(listOfFiles[i].toPath());
				System.out.println("****************************" + content.size());
				/*content.stream().forEach(str -> {
					 System.out.println("Content " + str);
				});*/
				 System.out.println("****************************");
			} catch (IOException e) {
				e.printStackTrace();
			}
		    
		  } else if (listOfFiles[i].isDirectory()) {
		    System.out.println("Directory " + listOfFiles[i].getName());
		  }
		}

	}
	
	/**
	 * These two should be delivered before Friday, this week - we can work hard to meet this requirement
	 * Data warehouse - we have 27 tables - at least 14 operations
	 * NOBS - at least 11 operations - 
	 * 
	 * 
	 * FIMI - at least 5 operations for now 
	 * 
	 *  ESB Integration this week - we have to do anything humanly possible to achieve this.
	 *    - EDWH, 27 tables
	 *    - NOBS(+BancAssurance), 11 operations 
	 *    - FIMI
	 */

}
