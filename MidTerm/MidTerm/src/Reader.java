import java.io.*;
import java.util.ArrayList;

import javax.swing.JComponent;

public class Reader extends JComponent {
	
	String color;
	int length, width, area, perimeter, radius;
	
	public Reader(String c, String l, String w){
		
		color = c;
		length = Integer.parseInt(l);
		width = Integer.parseInt(w);
		area = length * width;
		perimeter = length + length + width + width;
	}
	
	ArrayList<Shape> shapes = new ArrayList<Shape>();
	
	
	private void init() throws FileNotFoundException, IOException{
		try (FileInputStream is = new FileInputStream("C:/Users/zgoold17/Desktop/shapes.txt")){
			InputStreamReader ir = new InputStreamReader(is);
			BufferedReader rdr = new BufferedReader(ir);
			String line = rdr.readLine();
			while(line != null){
				String[] spaces = line.split(" ");
				//add if statements for the differnt shapes seperated by the parts 
			}
			
		}
	}
	public static void main(String[] args) {
		
		/*
		try {
			FileInputStream fstream = new FileInputStream("C:/Users/zgoold17/Desktop/shapes.txt");
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String line;
			while ((line = br.readLine()) != null){
				String[] dataString = line.split(" ");
				Reader reader = new Reader(dataString[0], dataString [1], dataString [2]);
			}
		} catch (Exception e){
			System.out.println("error");
		}
*/
	}

}
