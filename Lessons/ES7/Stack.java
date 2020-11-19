package Lessons.ES7;

import java.util.ArrayList;

public class Stack{
    private ArrayList<Integer> list;

    public Stack(){
        list = new ArrayList<>();
    }

    public void push(int value){
        list.add(value);
    }

    public int pop(){
        int value=0;
        value=list.get((list.size()-1));
        list.remove((list.size()-1));
        return value;
    }

    public void print(){
        String str="[";
        for(Integer i:list){
            str+=i+ ", ";
        }
        str=str.substring(0, (str.length()-2))+"]";
        System.out.println(str);

    }
}
