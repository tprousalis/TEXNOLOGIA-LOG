import java.io.*;
import java.util.*;

public class Rating {
    String prof_name;
    int num_of_ratings;
    int overall_rethymno;
    String comments;

    public Rating(String prof_name, int num_of_ratings, int overall_rethymno, String comments) {
        this.prof_name = prof_name;
        this.num_of_ratings = num_of_ratings;
        this.overall_rethymno = overall_rethymno;
        this.comments = comments;
    }

    public String getProf_name() {
        return prof_name;
    }

    public int getNum_of_ratings() {
        return num_of_ratings;
    }

    public int getOverall_rethymno() {
        return overall_rethymno;
    }

    public String getComments() {
        return comments;
    }

    public void setProf_name(String prof_name) {
        this.prof_name = prof_name;
    }

    public void setNum_of_ratings(int num_of_ratings) {
        this.num_of_ratings = num_of_ratings;
    }

    public void setOverall_rethymno(int overall_rethymno) {
        this.overall_rethymno = overall_rethymno;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
    
    
}
