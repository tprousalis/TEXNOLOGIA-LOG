import java.io.*;
import java.util.*;

public class User {
  private String email;
  private String name;
  private int id;
  
  //constructor
  public User(String n,String e,int i){
     name=n;
     email=e;
     id=i;
     
  }
  //setters,getters
  public void setName(String n){
     name=n; 
  }
  public String getName(){
     return name;
  }
  public void setEmail(String e){
    email=e;
  }
  public String getEmail(){
    return email;   
  }

  //methods
  
}