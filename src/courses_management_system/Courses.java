/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package courses_management_system;

import java.util.Date;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.InputMismatchException;

/**
 *
 * @author USER
 */
public class Courses implements Operations {

    private String room;
    private String branch;
    private int price;
    private String course_name;
    private Date start_date;
    private int days_of_course;
    private Date end_date;
    private ArrayList<String> students;
    private String instructor;
    public static int number_of_courses = 0;

    public Courses() {
        number_of_courses++;
    }

    public static int getNumber_of_courses() {
        return number_of_courses;
    }

    public ArrayList<String> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<String> students) {
        this.students = students;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String parent_course) {
        this.course_name = parent_course;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public int getDays_of_course() {
        return days_of_course;
    }

    public void setDays_of_course(int days_of_course) {
        this.days_of_course = days_of_course;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    @Override
    public void add() {
        Scanner input = new Scanner(System.in);
        String room = null;
        while (room == null) {
            try {
                System.out.print("Enter value for room (String): ");
                room = input.nextLine();
            } catch (Exception ex) {
                System.out.println("ENTER room AS STRING");
            }
        }
        String branch = null;
        while (branch == null) {
            try {
                System.out.print("Enter value for branch (String): ");
                branch = input.nextLine();
            } catch (Exception ex) {
                System.out.println("ENTER branch AS STRING");
            }
        }

        int price = 0;
        while (price <= 0) {
            try {
                System.out.print("Enter value for price (int): ");
                price = input.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("ENTER price AS int");
                input.next();
            } finally {
                input.nextLine();
            }
        }
        String course_name = null;
        while (course_name == null) {
            try {
                System.out.print("Enter value for course_name (String): ");
                course_name = input.nextLine();
            } catch (Exception ex) {
                System.out.println("ENTER course_name AS STRING");
            }
        }

        String instructor = null;
        while (instructor == null) {
            try {
                System.out.print("Enter value for instructor (String): ");
                instructor = input.nextLine();
            } catch (Exception ex) {
                System.out.println("ENTER instructor AS STRING");
            }
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date start_date2 = null;
        while (start_date2 == null) {
            System.out.println("Enter value for start_date (Date) in (format: yyyy-MM-dd) : ");
            String start_date1 = input.next();
            try {
                start_date2 = dateFormat.parse(start_date1);
            } catch (ParseException ex) {
                System.out.println("Error: Invalid date format. Please enter a date in the format yyyy-MM-dd.");
            }
        }
        int days_of_course = 0;
        while (days_of_course <= 0) {
            try {
                System.out.print("Enter value for days_of_course (int): ");
                days_of_course = input.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("ENTER days_of_course AS int");
                input.next();
            }
        }
        ArrayList<String> students = new ArrayList<>();
        int numberOfStudents = 0;
        while (numberOfStudents <= 0) {
            try {
                System.out.println("Enter the number of students to add: ");
                numberOfStudents = input.nextInt();
                for (int i = 0; i < numberOfStudents; i++) {
                    System.out.print("Enter value for student " + (i + 1) + ": ");
                    String student = input.next();
                    students.add(student.toLowerCase());
                }
            } catch (InputMismatchException ex) {
                System.out.println("ENTER numberOfStudents AS int");
                input.next();
            }
        }

        this.room = room.toLowerCase();
        this.branch = branch.toLowerCase();
        this.price = price;
        this.course_name = course_name.toLowerCase();
        this.start_date = start_date2;
        this.days_of_course = days_of_course;
        long daysInMillis = days_of_course * 24L * 60 * 60 * 1000;
        Date e = new Date(start_date.getTime() + daysInMillis);
        this.end_date = e;
        this.instructor = instructor.toLowerCase();
        this.students = students;

        StringBuilder studentsStr = new StringBuilder();
        for (String student : students) {
            studentsStr.append(student).append(",");
        }
        if (studentsStr.length() > 0) {
            studentsStr.setLength(studentsStr.length() - 1);
        }

        FileHandler file = new FileHandler();
        StringBuilder str = new StringBuilder();
        String start_date = dateFormat.format(start_date2);
        String end_date = dateFormat.format(this.end_date);
        str.append(course_name.toLowerCase() + "," + room.toLowerCase() + "," + branch.toLowerCase() + "," + price + "$," + start_date + "," + days_of_course + "," + end_date + "," + instructor.toLowerCase() + "," + studentsStr);//+"\n__________________________________\n"
        file.storeFile("courses.txt", str.toString());
    }

    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void delete() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("E MMM dd HH:mm:ss z yyyy");
        return "Course{"
                + "course_name='" + course_name + '\''
                + ", instructor='" + instructor + '\''
                + ", room='" + room + '\''
                + ", branch='" + branch + '\''
                + ", price='" + price + '\''
                + ", start_date=" + dateFormat.format(start_date)
                + ", days_of_course=" + days_of_course
                + ", end_date=" + dateFormat.format(end_date)
                + ", students=" + students
                + '}';
    }
}
