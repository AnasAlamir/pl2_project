/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package courses_management_system;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
/**
 *
 * @author USER
 */
public class Courses_Management_System {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    //String room ="R1";
    //String branch ="CS";
    //String price = "199$";
    //String parent_course ="PL2";
    //Date start_date = new Date(2023, 12, 15);
    //int days_of_course= 16;
    //Date end_date= new Date(2023, 12, 30);
//    Scanner input = new Scanner(System.in);
//    System.out.print("Enter value for room (String): ");
//    String room = input.nextLine();
//    System.out.print("Enter value for branch (String): ");
//    String branch = input.nextLine();
//    System.out.print("Enter value for price (String): ");
//    String price = input.nextLine();
//    System.out.print("Enter value for course_name (String): ");
//    String course_name = input.nextLine();
//    
//    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//    System.out.println("Enter value for start_date (Date) in (format: yyyy-MM-dd) : ");
//    String start_date1 = input.next();
//    Date start_date = null;
//    try {
//        start_date = dateFormat.parse(start_date1);
//    }
//    catch (ParseException ex) {
//            System.out.println("Error: Invalid date format. Please enter a date in the format yyyy-MM-dd.");
//        }
//    
//    System.out.print("Enter value for days_of_course (int): ");
//    int days_of_course = input.nextInt();
    
    Courses course = new Courses();
    course.add();
        System.out.println(course.getBranch());
    }
    
}
