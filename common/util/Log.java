package university.common.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Log {

	private static String logFile =  "university.log";
	private static final long MAX_FILE_SIZE = 1_000_000;
	
	static void write(String clazz, String text) throws IOException{
		check();
		File f = new File(logFile);
		FileWriter fw = new FileWriter(f.getAbsoluteFile());
		Date date = new Date();
		fw.write(date + " " + clazz + " " + text);
		fw.close();
	}
	
	static void check() throws IOException{
		File f = new File(logFile);
		if (f.exists()){
			if (f.length() > MAX_FILE_SIZE) {
				boolean flag = true;
				while(flag) {
					int i = 1;
					String fileName = logFile.substring(0, logFile.indexOf("."));
					String fileExt = logFile.substring(logFile.indexOf(".")+1);
					File newFile = new File(fileName+"-"+zeroToInt(i)+"."+fileExt);
					if (newFile.exists()) {
						i++;
					} else {
						f.renameTo(newFile);
						flag = false;
					}
				}
			}
		} else {
			create();
		}
	}
	
	static String zeroToInt(int i) {
		String result = "";
		String ii = String.valueOf(i);
		for (int t=0;t<5-ii.length();t++) {
			result+="0";
		}
		return result + ii;
	}
	
	private static void create() throws IOException{
		File f = new File(logFile);
		if (!f.exists()) {
			f.createNewFile();
		}
	}
	
	
}
