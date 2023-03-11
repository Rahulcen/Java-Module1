package ioserialization;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class KeyboartoFile {

	public static void main(String[] args) throws IOException {
		System.out.println("main entered");
		String data = null; // where is data is very important in java
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		
		FileWriter writer = new FileWriter("Nammadafile.txt");
		
		System.out.println("Enter some text");
		data = reader.readLine();

		while (!data.equals("quit")) {
			
			writer.write(data);
			data = reader.readLine();
			System.out.println("You have entered" + data);
		}
		writer.flush();
		writer.close();
		reader.close();
		System.out.println("main exited...");

	}
}
