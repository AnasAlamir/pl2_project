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
import java.text.SimpleDateFormat;


/**
 *
 * @author USER
 */
public class Courses {
    private String room;
    private String branch;
    private String price;
    private String parent_course;
    private Date start_date;
    private int days_of_course;
    private Date end_date;
//    private Student student;
//    private Instructor instructor;
//    private Grades grades;

    public Courses() {
    }

    public Courses(String room, String branch, String price, String parent_course, Date start_date, int days_of_course, Date end_date) {
        this.room = room;
        this.branch = branch;
        this.price = price;
        this.parent_course = parent_course;
        this.start_date = start_date;
        this.days_of_course = days_of_course;
        this.end_date = end_date;
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

    public String getParent_course() {
        return parent_course;
    }

    public void setParent_course(String parent_course) {
        this.parent_course = parent_course;
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

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }
    
    ///
    
    public void createPage(){
        File file = new File("Courses.txt");
        try{

            if(file.createNewFile())
            {
                System.out.println("File created: " + file.getName());
            }
            else
                System.out.println("File already exists.");       
        }
        catch(IOException ex){
            System.out.println("Exception : " + ex.getMessage());
        }
        try{
            FileWriter fr = new FileWriter(file,true);
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String start_date = dateFormat.format(this.start_date);
            String end_date = dateFormat.format(this.end_date);
            String data = parent_course+", "+room+", "+branch+", "+price+", "+start_date+", "+days_of_course+", "+end_date+"\n";
            fr.append(data);
            fr.close();
            System.out.println("Successfully wrote to the file.");
        }
        catch(IOException ex){
            System.out.println("Exception : " + ex.getMessage()); 
        }
    }
    
}