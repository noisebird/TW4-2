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

    }

    public void init(AquireReader reader) {
        start(reader.read());

    }

    public List<String> getResults() {
        return results;
    }
}


