package apnacollege;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ex2 {
	public static void main(String[] args) {		
		String name=JOptionPane.showInputDialog("Enter Your name ");
		JOptionPane.showMessageDialog(null,"Hello "+name);
		
		int age=Integer.parseInt(JOptionPane.showInputDialog("Input Your Age"));
		JOptionPane.showMessageDialog(null, "You are "+age+" year old");
		
	}
	
}
