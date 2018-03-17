
	package ITMD510.HW3.academic;
	import java.util.ArrayList;
	import java.util.Scanner;

	public class Class implements enroll {
		int ID5;
		String courseID;
		String name5;
		String DaysOfWeek;
		ArrayList<String> classinfo = new ArrayList<String>();

		public ArrayList<String> classDetails() {

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the ID & Name of Classes that you want to create: ");
			for (int i = 1; i <= 10; i++) {
				System.out.println("Enter Class ID:");
				ID5 = sc.nextInt();
				System.out.println("Enter Course ID for thiss ID:");
				courseID = sc.next();
				System.out.println("Enter Class Name:");
				name5 = sc.next();
				System.out.println("Enter Days of Week for the Class:");
				DaysOfWeek = sc.next();
				String s16 = "Class ID :"+ID5 + " ";
				String str10 = "Course ID : " + courseID + " ";
				String s17 = "Class  Name : " + name5 + " ";
				String str20 = "Days of the Week : " + DaysOfWeek;
				String s18 = str10 +s16+s17+str20;
				classinfo.add(s18);
				
			}
			System.out.println(classinfo);
			System.out.println("Classes Have been successfully created..");
			return classinfo;
		}

		@Override
		public ArrayList<String> courseDetails() {
			// TODO Auto-generated method stub
			return null;
		}

		
	}


