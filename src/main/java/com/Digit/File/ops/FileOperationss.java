package com.Digit.File.ops;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOperationss {
public static void main(String[] args) {
	String path1= "C:\\Users\\Basudev.kirtania\\Documents\\Fileops\\Input.txt";
	String path2= "C:\\Users\\Basudev.kirtania\\Documents\\Fileops\\Output.txt";
	try {
	FileInputStream fis= new FileInputStream(path1);
	int temp;
	FileOutputStream fso=new FileOutputStream(path2);
	while((temp=fis.read())!=-1) {
		fso.write(temp);
	}
	fso.close();
	fis.close();
	
	
	}catch (Exception e) {
		// TODO: handle exception
	}
}
}
