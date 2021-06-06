import java.io.*;
import java.util.*;

public class OnlineLec extends Lecture{
    String link;
    String platform;
    int id;

    public OnlineLec(String link, String platform, int id, String name, String classroom, String les, int participants, int id) {
        super(name, classroom, les, participants, id);
        this.link = link;
        this.platform = platform;
        this.id = id;
    }

    
    
    public String getLink() {
        return link;
    }

    public String getPlatform() {
        return platform;
    }

    public int getId() {
        return id;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
}
