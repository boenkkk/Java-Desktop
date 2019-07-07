package aPengenalanJava.ddException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ggThrowsExceptionTest {
	public static void main(String[] args){
		try {
			methodYgTdkBertanggungJawab();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void methodYgTdkBertanggungJawab() throws FileNotFoundException,IOException{
		FileInputStream inputStream = new FileInputStream("file.txt");
		System.out.println("kode setelah buka file");
	}
}