/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package courses_management_system;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class FileHandler {
    private String directory;
    public FileHandler()
    {
        this.directory = "C:\\Users\\USER\\OneDrive\\Documents\\NetBeansProjects\\Courses_Management_System\\";
    }
    public String getDirectory()
    {
        return directory;
    }
    public void setDirectory(String directory)
    {
        this.directory = directory;
    }
    public void storeFile(String filename,String Content)
    {
       try
       {
           FileWriter writer = new FileWriter((directory+File.separator+filename),true);
           writer.append(Content+"\n");
           System.out.println("File saved successfully: "+filename);
           writer.flush();
           writer.close();
       }
       catch (IOException e) {
            System.out.println("Error saving this file: "+filename);
        }
     }
}
