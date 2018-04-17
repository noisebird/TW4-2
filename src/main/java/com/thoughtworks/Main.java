package com.thoughtworks;

/**
 * Created by wangjie on 2018/4/17.
 */
public class Main {
    public static void main(String[] args) {
        FizzBuzzGame game = new FizzBuzzGame();
        game.init(new AquireReader());
    }
}
