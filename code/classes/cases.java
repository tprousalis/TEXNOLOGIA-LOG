import java.io.*;
import java.util.*;


public class cases {
	private int number_of_cases; 
	private List<User> CasesList;
	
	 //constructor
  public cases(){
     number_of_cases=0;
	 List<User> CasesList = new ArrayList();
    }
	
	 //setters,getters
  public void setNumberOfCases(int n){
     number_of_cases=n; 
  }
  public int getNumberOfCases(){
     return number_of_cases;
  }
  public List<User> getCasesList(){
      if(CasesList == null){
        CasesList = new ArrayList<User>();  
      }    
      return CasesList;   
  }
  
  //methods
  public void add_new_case( User new_case){
	  CasesList.add(new_case);
	  
  }
	
	
}