import java.io.*;
import java.util.*;

public class Student extends User{
  
  private String etos_eis;
  private int AM;
  private List<lesson> my_lessons;
  private List<Lecture> my_lectures;
  
  //constructor
  public Student(String n,String e,int i, String year, int a){
    super(n,e,i);   
    etos_eis= year;
    AM=a;   
    List<lesson> my_lessons = new ArrayList();
    List<Lecture> my_lectures = new ArrayList();
    }
   
   //setters,getters
  public void setEtos(String n){
    etos_eis=n; 
  }
  public String getYear(){
    return etos_eis;
  }
  public void setAm(int a){
    AM=a;
  }
  public int getAM(){
    return AM;   
  }
  
  public List<lesson> getLessons(){
    if(my_lessons == null){
      my_lessons = new ArrayList<lesson>();  
    }    
    return my_lessons;   
  }
  public List<Lecture> getLectures(){
      if(my_lectures == null){
        my_lectures = new ArrayList<Lecture>();  
      }    
      return my_lectures;   
    }
  //methods












}