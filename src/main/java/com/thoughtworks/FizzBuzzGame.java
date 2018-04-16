package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;


public class FizzBuzzGame {
    private List<String> results = new ArrayList<String>();
    private Teacher teacher=new Teacher(3,5,7);

    public FizzBuzzGame() {
    }

    public FizzBuzzGame(Teacher teacher) {
        this.teacher=teacher;
    }

    public void start(int count) {
        if(teacher.isReasonableNum()){
            for (int i = 1; i <= count; i++) {
                Student student = new Student(i);
                results.add(student.sayContent(teacher.getNumber1()));
            }
            outputAllcontent();
        }else{
            System.out.println("请重新想三个10以内的不重复数字！");
        }
    }

    public void init(AquireReader reader) {
        start(reader.read());

    }

    public void outputAllcontent(){
        for (String item : results) {
            System.out.println(item);
        }
    }


    public List<String> getResults() {
        return results;
    }
}


