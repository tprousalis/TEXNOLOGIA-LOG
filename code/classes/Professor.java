import java.io.*;
import java.util.*;



public class Professor extends User{
	private int number_of_lessons;
	private int prof_id; 
	private List<lesson> prof_lessons;
	
	 //constructor
  public Professor(String n,String e,int i,int a){
     super(n,e,i);   
     prof_id=a;   
     number_of_lessons=0;
	 List<lesson> prof_lessons = new ArrayList();
    }
   
   //setters,getters
  public void setNumberOfLessons(int n){
     number_of_lessons=n; 
  }
  public int getNumberOfLessons(){
     return number_of_lessons;
  }
  public void setProfId(int a){
    prof_id=a;
  }
  public int getProfId(){
    return prof_id;   
  }
	
  public List<lesson> getProfLessons(){
      if(prof_lessons == null){
        prof_lessons = new ArrayList<lesson>();  
      }    
      return prof_lessons;   
    }
	
	
	//methods
}