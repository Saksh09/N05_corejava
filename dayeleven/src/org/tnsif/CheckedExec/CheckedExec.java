package org.tnsif.CheckedExec;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExec {

	public static void main(String[] args)  {
		try {
			FileInputStream f=new FileInputStream("C:\\Users\\Windows 10\\Documents\\sakshi.txt");
			System.out.println("File has found");
		} catch (FileNotFoundException e) {
			System.out.println("file does not exist :"+e);
		}

	}

}
