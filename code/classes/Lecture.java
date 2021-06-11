import java.io.*;
import java.util.*;

public class Lecture {
   
   String classroom;
   int les_id;
   int participants;
   int id;
   Date date;
   
    public Lecture( String classroom, int les_id, int id, Date date) {
        
        this.classroom = classroom;
        this.les_id = les_id;
        participants = 0;
        this.id = id;
        this.date = date;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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
    
    public boolean check_dates(Date date, String classroom, int les_id, int id, int total_votes, int positive_votes) {
        if ((total_votes-positive_votes) <= positive_votes){
            Lecture new_lecture = new Lecture(classroom, les_id, id, date);
            return true;
        }
        return false;
    }

    
            

   
   
   
   
}