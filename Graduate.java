package ITMD510.HW3.human;

import java.util.Scanner;
import java.util.ArrayList;

public  class Graduate extends Person {
	 int ID;
	 String name;
	 String gender;
	 ArrayList<String> gradDetail= new ArrayList<String>();

	public ArrayList<String> gradinfo() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter graduate Student details ID, Name, Gender :");
			System.out.println("Enter Graduate Student ID :");
			ID = sc.nextInt();
			System.out.println("Enter Graduate Student name :");
			name = sc.next();
			System.out.println("Enter Graduate Student gender :");
			gender = sc.next();
			String s1 = "Grad Student ID :"+ID+ " ";
			String s2 = "Grad Student Name : " + name + " ";
			String s3 = "Grad Student Gender :" + gender;
			String s12 = s1 + s2 + s3;
			gradDetail.add(s12);
			System.out.println(gradDetail.get(0));
			System.out.println("Graduate srdent is created successfully..");
			return gradDetail;
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
	public ArrayList<String> instructinfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<String> underinfo() {
		// TODO Auto-generated method stub
		return null;
	}

	
	

}
	