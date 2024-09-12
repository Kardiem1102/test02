package test02;

import java.util.ArrayList;


public interface manage
{       
    int addStudent(String name, int score);
    
    int getStudentScore(String name);
    
    ArrayList<String[]> showStudents();
    
    ArrayList<String> showAvgStu();
    
    String[] showStored();
    
    String[] showTop();

    
}
