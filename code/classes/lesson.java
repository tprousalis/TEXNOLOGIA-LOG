import java.io.*;
import java.util.*;


public class lesson {
	private String name; 
	private int lessonId;
	private int year;
	private int professorId;

    public lesson(String name, int lessonId, int year) {
        this.name = name;
        this.lessonId = lessonId;
        this.year = year;
        professorId = 0;
    }
//setters,getters
  public void setName(String n){
     name=n; 
  }
  public String getName(){
     return name;
  }
  
  public void setLessonId(int i){
     lessonId=i; 
  }
  public int getLessonId(){
     return lessonId;
  }
  
  public void setYear(int y){
     year=y; 
  }
  public int getYear(){
     return year;
  }
 
  //methods
  public void linkProfessor(Professor p, lesson L){
    L.professorId=p.getProfId();

    p.setNumberOfLessons((p.getNumberOfLessons())+1);
    p.getProfLessons().add(L);
  }
	
	