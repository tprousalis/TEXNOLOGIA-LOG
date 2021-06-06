import java.io.*;
import java.util.*;

public class Notes {
    int les_id;
    String student_name;

    public Notes(int les_id, String student_name) {
        this.les_id = les_id;
        this.student_name = student_name;
    }
    
    

    public int getLes_id() {
        return les_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setLes_id(int les_id) {
        this.les_id = les_id;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }
    
    
}
