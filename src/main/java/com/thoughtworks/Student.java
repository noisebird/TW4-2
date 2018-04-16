package com.thoughtworks;

/**
 * Created by wangjie on 2018/4/10.
 */
public class Student {
    private int id;

    public Student() {
    }

    public Student(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String sayContent(int firstNum) {

        String content = "";
        if ((id+"").indexOf(firstNum + "") != -1) {
            return "Fizz";
        }
        if (id % 3 == 0) {
            content += "Fizz";
        }
        if (id % 5 == 0) {
            content += "Buzz";
        }
        if (id % 7 == 0) {
            content += "Whizz";
        }
        if (content.equals("")) {
            content=id+"";
        }
        return content;

    }
}
