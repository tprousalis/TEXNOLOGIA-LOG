import java.io.*;
import java.util.*;

public class Classroom {
    String name;
    Date date_of_last_use;
    Date date_of_last_decon;
    int capacity;
    int id;

    public Classroom(String name, Date date_of_last_use, Date date_of_last_decon, int capacity, int id) {
        this.name = name;
        this.date_of_last_use = date_of_last_use;
        this.date_of_last_decon = date_of_last_decon;
        this.capacity = capacity;
        this.id = id;
    }

    
    
    public String getName() {
        return name;
    }

    public Date getDate_of_last_use() {
        return date_of_last_use;
    }

    public Date getDate_of_last_decon() {
        return date_of_last_decon;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate_of_last_use(Date date_of_last_use) {
        this.date_of_last_use = date_of_last_use;
    }

    public void setDate_of_last_decon(Date date_of_last_decon) {
        this.date_of_last_decon = date_of_last_decon;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public int calc_overflow(Classroom classroom, int students ) {
        int calc = classroom.capacity - students;
        return calc;
    }
    
    
    
}