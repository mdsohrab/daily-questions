package earphone.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class student implements Comparable <student> {
    private int id;
    private String name;

    public student(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return id + " " + name;
    }

    @Override
    public int compareTo(student that) {
        return Integer.compare(this.id, that.id);
    }


    public static void main(String[] args) {
        List<student> students = List.of(new student(1,"anand"),
        new student(100,"adam"),
        new student(3,"eve"));
        List<student>StudentsAL = new ArrayList<>(students);
        System.out.println(StudentsAL);
      //  Collections.sort(students);
        Collections.sort(StudentsAL);
        System.out.println(StudentsAL);
    }


}
