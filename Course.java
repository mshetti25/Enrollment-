package ITMD510.HW3.academic;

import java.util.Scanner;
import java.util.ArrayList;

public class Course implements enroll{
	
	String ID4;
	String name4;
	ArrayList<String> courseDetails = new ArrayList<String>();

	public ArrayList<String> courseinfo() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the ID & Name of Courses that you want to create: ");
		for (int i = 1; i <= 5; i++) {
			System.out.println("Enter Course ID:");
			ID4 = sc.next();
			System.out.println("Enter Course Name:");
			name4 = sc.next();
			String s13 = "Course ID :"+ID4 + " ";
			String s14 = "Course  Name : " + name4 + " ";
			String s15 = s13+s14;
			courseDetails.add(s15);
			
		}
		System.out.println(courseDetails);
		System.out.println("Courses Have been successfully created..");
		return courseDetails;
	}
	

	@Override
	public ArrayList<String> classDetails() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public ArrayList<String> courseDetails() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
