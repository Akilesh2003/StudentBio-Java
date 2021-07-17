import java.util.ArrayList;

public class StudentBio {
    private ArrayList<String> names;
    private ArrayList<Integer> classes;

    public StudentBio(){
        this.names = new ArrayList<>();
    }

    public void addName(String name){
        this.names.add(name);
    }

    public void addClass(int cl){
        this.classes.add(cl);
    }
    public String getName(){
        return this.name;
    }
}
