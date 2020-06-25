package programs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Readingproperty {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Properties pro=new Properties();
		
		FileInputStream f=new FileInputStream("D:\\All selenium projects\\ALL selenium projects\\javaprojectfolder\\property\\config.properties");
		pro.load(f);
		
	System.out.println(	pro.get("url"));
	System.out.println(pro.get("name"));
	}

}
