package ITMD510.HW3.human;

import java.util.ArrayList;
import java.util.Scanner;

public class Instructor extends Person{
	int ID2;
	 String name2;
	 String gender2;
	 ArrayList<String> instructDetail = new ArrayList<String>();
	public ArrayList<String> instructinfo() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Instruct details ID, Name, Gender for 3 instructors:");
		for(int i=1; i<=3; i++){
		System.out.println("Enter Instruct ID :");
			ID2 = sc.nextInt();
			System.out.println("Enter instruct name :");
			name2 = sc.next();
			System.out.println("Enter Instruct gender :");
			gender2 = sc.next();
			String s7 = "Instructor ID :"+ID2 + " ";
			String s8 = "Instructor  Name : " + name2 + " ";
			String s9 = "Instructor Gender :" + gender2;
			String s10 = s7+s8+s9;
			instructDetail.add(s10);
			
		}
		System.out.println(instructDetail);
			System.out.println("Instructor is created successfully..");
			return instructDetail;
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
	public ArrayList<String> underinfo() {
		// TODO Auto-generated method stub
		return null;
	}

}
