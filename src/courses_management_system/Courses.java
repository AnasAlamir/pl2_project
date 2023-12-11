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


/**
 *
 * @author USER
 */
public class Courses implements Operations{
    private String room;
    private String branch;
    private String price;
    private String course_name;
    private Date start_date;
    private int days_of_course;
    private Date end_date;
//    private Student student;
//    private Instructor instructor;
//    private Grades grades;

    public Courses() {
    }

    public Courses(String room, String branch, String price, String parent_course, Date start_date, int days_of_course) {
        this.room = room;
        this.branch = branch;
        this.price = price;
        this.course_name = parent_course;
        this.start_date = start_date;
        this.days_of_course = days_of_course;
        long daysInMillis = days_of_course * 24L * 60 * 60 * 1000;
        Date e = new Date(start_date.getTime() + daysInMillis);
        this.end_date = e;     
    }
///
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
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

    @Override
    public void add() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void delete() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    public void createPage(){
        FileHandler file = new FileHandler();
        StringBuilder str = new StringBuilder();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String start_date = dateFormat.format(this.start_date);
        String end_date = dateFormat.format(this.end_date);
        str.append(course_name+","+room+","+branch+","+price+","+start_date+","+days_of_course+","+end_date+"\n__________________________________\n");
        file.storeFile("course1.txt", str.toString());
    }
    
}