package ProblemD;

public class Student {
    private boolean isTagged;
    private String name;
    public Student(String name, boolean isTagged){
        this.name = name;
        this.isTagged = isTagged;
    }
    public void TagStudent(){
        isTagged = true;
    }
    public void notTagged(){
        isTagged = false;
    }

    public String getName() {
        return name;
    }

    public boolean getIsTagged() {
        return isTagged;
    }
}
