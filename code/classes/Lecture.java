import java.io.*;
import java.util.*;

public class Lecture {
   
   String classroom;
   int les_id;
   int participants;
   int id;
   

    public Lecture( String classroom, int les_id, int id) {
        
        this.classroom = classroom;
        this.les_id = les_id;
        participants = 0;
        this.id = id;
    }

   
    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public void setLesId(int les_id) {
        this.les_id = les_id;
    }

    public void setParticipants(int participants) {
        this.participants = participants;
    }

    public void setId(int id) {
        this.id = id;
    }

  

    public String getClassroom() {
        return classroom;
    }

    public int getLesId() {
        return les_id;
    }

    public int getParticipants() {
        return participants;
    }

    public int getId() {
        return id;
    }

    
            

   
   
   
   
}
