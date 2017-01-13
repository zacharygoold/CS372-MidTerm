import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class GUI extends JComponent implements MouseMotionListener, MouseListener{

	public static void main(String[] args) throws FileNotFoundException {
		
		String circle = "/Images/circle.jpg";
		String rectangle = "/Images/rectangle.jpg";
		String square = "/Images/square.jpg";
		String triangle = "/Images/triangle.jpg";

		Image image1 = Toolkit.getDefaultToolkit().getImage(GUI.class.getResource(circle));
		image1 = image1.getScaledInstance(200, 200, Image.SCALE_DEFAULT);
		Image image2 = Toolkit.getDefaultToolkit().getImage(GUI.class.getResource(rectangle));
		image2 = image2.getScaledInstance(200, 200, Image.SCALE_DEFAULT);
		Image image3 = Toolkit.getDefaultToolkit().getImage(GUI.class.getResource(square));
		image3 = image3.getScaledInstance(200, 200, Image.SCALE_DEFAULT);
		Image image4 = Toolkit.getDefaultToolkit().getImage(GUI.class.getResource(triangle));
		image4 = image4.getScaledInstance(200, 200, Image.SCALE_DEFAULT);
		String fileName = "C:/Users/zgoold17/Desktop/shapes.txt";
		File file = new File (fileName);
		
		
        GUI fileSearch = new GUI();
		fileSearch .parseFile(fileName, "circle:");
		
		
		
		
		/*
		try {
			Scanner scanner = new Scanner(file);
			//read line by line
			int lineNum = 0;
			while (scanner.hasNextLine()){
				String line = scanner.nextLine();
				lineNum++;
				if(scanner.match("circle:")){
					
				}
			}
		} catch (FileNotFoundException e){
			
		}
		*/
		
		//Create JFrame
		JFrame frame = new JFrame("MidTerm");
		frame.setSize(1200, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	
	}
	
	
public void parseFile(String fileName,String searchStr) throws FileNotFoundException{
	Scanner scan = new Scanner(new File(fileName));
	while(scan.hasNext()){
		String line = scan.nextLine().toLowerCase().toString();
		if(line.contains(searchStr)){
			System.out.println(line);
		}
	}
}

	
/*
private static void readFile(String shapes){
	File file = new File(shapes);
	Scanner scanner = new Scanner("//CS1/home/zgoold17/CS372-1/MidTerm/MidTerm/src");
	while (scanner.hasNextLine()){
		System.out.println(scanner.nextLine());
	}
}
*/	
Image image1, image2, image3, image4;
public GUI (Image a, Image b, Image c, Image d){
	image1 = a;
	image2 = b;
	image3 = c;
	image4 = d;
	addMouseMotionListener(this);
	addMouseListener(this);
}



public GUI() {
	// TODO Auto-generated constructor stub
}


public void mousePressed(MouseEvent mouse){
	
}

public void mouseClicked(MouseEvent mouse){
	
}

public void mouseDragged(MouseEvent mouse){
	
}

public void mouseReleased(MouseEvent mouse){
	
}

int pressed = 0;
int graphicsX = 400, graphicsY = 500;
public void paint(Graphics g){ 
	Graphics2D gg = (Graphics2D)g;
	if (pressed == 1){ 
		gg.drawImage(image1, graphicsX, graphicsY, this);
	}
	else if (pressed == 2){
		gg.drawImage(image2, graphicsX, graphicsY, this);
	}
	else if (pressed == 3){
		gg.drawImage(image3, graphicsX, graphicsY, this);
	}
	else if (pressed == 4){
		gg.drawImage(image4, graphicsX, graphicsY, this);
	}
}

@Override
public void mouseEntered(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseExited(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseMoved(MouseEvent e) {
	// TODO Auto-generated method stub
	
}




}
