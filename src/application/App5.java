package application;

import java.io.File;
import java.util.Scanner;

public class App5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String  strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		System.out.println("get Name: "+ path.getName());
		System.out.println("get Parent: "+ path.getParent());
		System.out.println("get  Path> "+ path.getPath()) ;
	
	}

}
