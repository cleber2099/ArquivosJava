package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class App3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] lines = new String[] {"Bom dia, Boa tarde, boa noite"};
		String path = "C:\\Windows\\Temp\\teste2.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))){
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch(IOException e){
			e.printStackTrace();
		}
	
	
	}

}
