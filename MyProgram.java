package ITMD510.HW3.program;

import java.util.Scanner;
import java.util.ArrayList;

import ITMD510.HW3.academic.Class;
import ITMD510.HW3.academic.Course;
import ITMD510.HW3.human.Graduate;
import ITMD510.HW3.human.UnderGraduate;
import ITMD510.HW3.human.Instructor;

public class MyProgram {
	static ArrayList<String> gradStud = new ArrayList<String>();
	static ArrayList<String> underStud = new ArrayList<String>();
	static ArrayList<String> inst = new ArrayList<String>();
	static ArrayList<String> classA = new ArrayList<String>();
	static ArrayList<String> courseA = new ArrayList<String>();
	static ArrayList<String> std = new ArrayList<String>();
	static ArrayList<String> sEnroll = new ArrayList<String>();
	static ArrayList<String> iEnrolL = new ArrayList<String>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner s = new Scanner(System.in);
		int op;
		String contd = new String();
		do{
			System.out.println("----------------------------------------------------");
			System.out.println("Create your objects ");
			System.out.println("1. Create a graduate Student ");
			System.out.println("2. Create a Undergraduate Student ");
			System.out.println("3. Create an Instructor ");
			System.out.println("4. Create a Course ");
			System.out.println("5. Create a Class ");
			System.out.println("----------------------------------------------------");
			System.out.println("Complete your Enrollment");
			System.out.println("6. Students enroll in classes");
			System.out.println("7. Instructors teach classes");
			System.out.println("----------------------------------------------------");
			System.out.println("Output functions");
			System.out.println("8. A List of students");
			System.out.println("9. A List of instructors");
			System.out.println("10. A List of classes");
			System.out.println("11. A List of clasees given by a students");
			System.out.println("12. A List of clasees given by an instructor");
			System.out.println("----------------------------------------------------");
			System.out.println(" -1 to exit program ");
			System.out.println("Enter your option ");
			op = s.nextInt();
			switch(op){
			case 1 :
				Graduate g = new Graduate();
				gradStud = g.gradinfo();
				break;
			case 2 :
				UnderGraduate u = new UnderGraduate();
				underStud = u.underinfo();		
				break;
			case 3 :
				Instructor i = new Instructor();
				inst = i.instructinfo();
				break;
			case 4 :
				Course c = new Course();
				courseA = c.courseinfo();
				break;
			case 5 :
				Class cl = new Class();
				classA = cl.classDetails();
				break;
			case 6 :
				std.addAll(gradStud);
				std.addAll(underStud);
				for (int m = 0; m <= (std.size()/2); m++) {
					System.out.println("Index: " + m + ", " + std.get(m));
				}
				System.out.println("Select one of the above student by Index: ");
				Scanner in = new Scanner(System.in);
				int n = in.nextInt();
				for (int m = 0; m <= (classA.size()-1); m++) {
					System.out.println("Index: " + m + ", " + classA.get(m));
				}
				System.out.println("Select class or classes this student will enroll in by index:  ");
				Scanner a = new Scanner(System.in);
				String[] b = a.next().split(",");
				String d = " ";
				for (String f : b) {
					d = classA.get(Integer.parseInt(f)) + " @";
				}
				
				sEnroll.add(std.get(n) + "@ " + d);
				System.out.println("Congratulations!!!  ");
				System.out.println("You have enrolled the course successfully for the above mentioned student");
				break;
				
			case 7 :
				for (int x = 0; x <= (inst.size() - 1); x++) {
					System.out.println("Index: " + x + ", " + inst.get(x));
				}
				System.out.println("Select one of the above instructor by Index: ");
				Scanner z = new Scanner(System.in);
				int y = z.nextInt();
				for (int h = 0; h <= (courseA.size() - 1); h++) {
					System.out.println("Index: " + h + ", " + courseA.get(h));
				}
				System.out.println("Select class or classes this instructor will enroll in by index");
				Scanner j = new Scanner(System.in);
				String[] k = j.next().split(",");
				String str2 = " ";
				for (String str3 : k) {
					str2 = courseA.get(Integer.parseInt(str3)) + " @";
				}
				iEnrolL.add(inst.get(y) + "@ " + str2);
				System.out.println("Congratulations!!!! ");
				System.out.println("You have enrolled the course successfully for the above mentioned instructor");
				break;
				
			case 8 :
				std.addAll(gradStud);
				std.addAll(underStud);
				for (int l = 0; l <= (std.size() - 1); l++) {
					System.out.println("Index: " + l + ", " + std.get(l));
				}
				break;
			case 9 :
				
				for (int o = 0; o <= (inst.size() - 1); o++) {
					System.out.println("Index: " + o + ", " + inst.get(o));
				}
				break;
			case 10 :
				for (int p = 0; p <= (classA.size() - 1); p++) {
					System.out.println("Index: " + p + ", " + classA.get(p));
				}
				break;
			case 11 :
				for (int q = 0; q <= (std.size()/2 ); q++) {
					System.out.println("Index: " + q + ", " + std.get(q));
				}
				System.out.println("Select one of the above student by Index: ");
				Scanner r = new Scanner(System.in);
				int t = r.nextInt();
				String w = std.get(t);
				for (String v : sEnroll) {
					if (v.matches("(?i)(" + w + ").*")) {
						String[] str4 = v.trim().split("@");
						for (String str5 : str4)
							System.out.println(str5);
					}
				}
				break;
			case 12 :
				for (int mp = 0; mp <= (inst.size() - 1); mp++) {
					System.out.println("Index: " + mp + ", " + inst.get(mp));
				}
				System.out.println("Select one of the above instructor by Index: ");
				Scanner insta = new Scanner(System.in);
				int instb = insta.nextInt();
				String ind = inst.get(instb);
				for (String v : iEnrolL) {
					if (v.matches("(?i)(" + ind + ").*")) {
						String[] str6 = v.trim().split("@");
						for (String str7 : str6)
							System.out.println(str7);
					}
				}
				
				break;
			case -1 :
				System.out.println("You have selected to exit  ");
				break;
				
			default : 
				System.out.println("Invalid input :( ");
					
			}
			System.out.println("Do you wish to continue : Type Yes or NO");
			 contd = s.next();
			}
			while(contd.equalsIgnoreCase("yes") );
		
	}
			
		

}