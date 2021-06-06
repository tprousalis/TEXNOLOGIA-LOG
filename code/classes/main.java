import java.io.*;
import java.util.*;


public class main {
  public static void defaultData(){
       
       Student Student1 = new Student("Tasos Prousalis","prousalis@ceid.com",1,"2015",1);
       Student Student2 = new Student("Nikos Giakoumidakis","giakoumidakis@ceid.com",2,"2014",2);
       Student Student3 = new Student("Konstantikos Vlassis","magklaras@ceid.com",3,"2014",3);
       Student Student4 = new Student("Konstantinos Papoulias","john@ceid.com",4,"2014",4);
       Student Student5 = new Student("Jack","jack@ceid.com",5,"2014",5);
       Student Student6 = new Student("George","george@ceid.com",6,"2014",6);
  
        lesson lesson1 = new lesson("Texnologia",1,4); 
        lesson lesson2 = new lesson("Logiki sxediasi",2,1); 
        lesson lesson3 = new lesson("Arxes",3,4); 
        lesson lesson4 = new lesson("Mikro",4,4); 
        lesson lesson5 = new lesson("ontokentrikos",5,4); 
       
       (Student1.getLessons()).add(lesson1);
        (Student1.getLessons()).add(lesson2);
         (Student1.getLessons()).add(lesson3);
         
         
       (Student2.getLessons()).add(lesson2);
       (Student2.getLessons()).add(lesson3);
       (Student2.getLessons()).add(lesson4);
       
       (Student3.getLessons()).add(lesson1);
       (Student3.getLessons()).add(lesson4);
       
       Lecture lec1 = new Lecture("a",1,1);
       Lecture lec2 = new Lecture("ab",1,2);
       Lecture lec3 = new Lecture("a",1,3);
       Lecture lec4 = new Lecture("a",2,4);
       Lecture lec5 = new Lecture("a",2,5);
       Lecture lec6 = new Lecture("a",3,6);
       Lecture lec7 = new Lecture("a",3,7);
       Lecture lec8 = new Lecture("a",4,8);
       Lecture lec9 = new Lecture("a",5,9);
       Lecture lec10 = new Lecture("a",5,10);
   }
  
  
}
