package ITMD510.HW3.human;

import java.util.ArrayList;
import java.util.Scanner;

public class UnderGraduate extends Person {
	 int ID1;
	 String name1;
	 String gender1;
		 ArrayList<String> underDetail= new ArrayList<String>();
	public ArrayList<String> underinfo() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Undergraduate Student details ID, Name, Gender :");
		System.out.println("Enter undergraduate Student ID :");
			ID1 = sc.nextInt();
			System.out.println("Enter undergraduate Student name :");
			name1 = sc.next();
			System.out.println("Enter undergraduate Student gender :");
			gender1 = sc.next();
			String s4 = "Undergrad Student ID :"+ID1 + " ";
			String s5 = "Undergrad Student Name : " + name1 + " ";
			String s6 = "Undergrad Student Gender :" + gender1;
			String s11 = s4+s5+s6;
			underDetail.add(s11);
			System.out.println(underDetail.get(0));
			System.out.println("Undergraduate srdent is created successfully..");
			return underDetail;
			
	}
	@Override
	public ArrayList<String> classDetails() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ArrayList<String> courseinfo() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ArrayList<String> gradinfo() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ArrayList<String> instructinfo() {
		// TODO Auto-generated method stub
		return null;
	}
			
		
}
