package ProblemD;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] conditions = scanner.nextLine().split(" ");
        int n = Integer.parseInt(conditions[0]); // Students
        int m = Integer.parseInt(conditions[1]); // Amount of times someone is scanned
        String studentName = "";
        TreeSet<String> cheaters = new TreeSet<>();
//        ArrayList<String> cheaters = new ArrayList<>();
        String[] names = scanner.nextLine().split(" "); // Names of students
        Map<String, Student> studentMap = new HashMap<>(); // to ensure quick access i will use a map
        //Student[] students = new Student[n];

        // I do not want to waste comparions on an if statement for the first name
        studentMap.put(names[0], new Student(names[0], true));
        for(int i = 1 ; i < n ; i++){
            studentName = names[i];
            studentMap.put(studentName, new Student(studentName,false));
        }

        for(int i = 0; i < m ; i++) {
            String[] input = scanner.nextLine().split(" ");
            Student student1 = studentMap.get(input[0]);
            Student student2 = studentMap.get(input[2]);

            if(!(student1.getIsTagged())){
                student2.TagStudent();
                if(!(cheaters.contains(student1.getName()))){
                    cheaters.add(student1.getName());
                }
            } else {
                student1.notTagged();
                student2.TagStudent();
            }
        }
        System.out.println(cheaters.size());
        for(String sName : cheaters){
            System.out.print(sName + " ");
        }
    }
}