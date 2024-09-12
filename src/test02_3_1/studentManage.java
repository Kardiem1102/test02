package test02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class studentManage implements manage
{
    private Map<String, Integer> table = new HashMap<>();
    private int sum_score;
    
    studentManage(HashMap<String, Integer> table){
        this.table = table;
        sum_score = 0;
    }
    
    @Override
    public int addStudent(String name, int score)
    {
        table.put(name, score);
        sum_score += score;
        return 1;
    }

    @Override
    public int getStudentScore(String name)
    {
        return table.get(name);
    }

    @Override
    public ArrayList<String[]> showStudents()
    {   
        ArrayList<String[]> ret = new ArrayList<>();
        Iterator<String> it = table.keySet().iterator();
        
        while(it.hasNext()){
            String tmp = it.next();
            String[] elem = {tmp,Integer.toString(table.get(tmp))};
            ret.add(elem);
        }
        
        return ret;
    }

    @Override
    public ArrayList<String> showAvgStu()
    {   
        int avg = sum_score/table.size();
        ArrayList<String> ret = new ArrayList<>();
        Iterator<String> it = table.keySet().iterator();
        
        while(it.hasNext()){
            String tmp = it.next();
            if(avg <= table.get(tmp)){
                ret.add(tmp);
            }
        }
        
        return ret;
    }

    @Override
    public String[] showStored()
    {   
        String[] ret = table.keySet().toArray(new String[table.size()]);
        Arrays.sort(ret);
        return ret;
    }

    @Override
    public String[] showTop()
    {   
        
        Integer[] scores = table.values().toArray(new Integer[table.size()]);
        
        Arrays.sort(scores, Collections.reverseOrder());
        
        String[] ret = new String[3];
        
        for(int i = 0; i < 3; i++){
            Iterator<String> it = table.keySet().iterator();
            
            while(it.hasNext()){
                String tmp_n = it.next();
                int tmp_s = table.get(tmp_n);
                if(tmp_s == scores[i]){
                    ret[i] = tmp_n;
                }
            }
        }
        
        return ret;
    }
    
}
