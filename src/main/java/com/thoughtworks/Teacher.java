package com.thoughtworks;

/**
 * Created by wangjie on 2018/4/10.
 */
public class Teacher {
    private int number1;
    private int number2;
    private int number3;

    public Teacher() {
    }

    public Teacher(int number1, int number2, int number3) {
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
    }

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public int getNumber3() {
        return number3;
    }

    public void setNumber3(int number3) {
        this.number3 = number3;
    }

    public boolean isReasonableNum() {
        boolean flag = (number1 != number2 && number1 != number3 && number2 != number3) ? true : false;
        boolean flag1 = (0 < number1 && number1 < 10) ? true : false;
        boolean flag2 = (0 < number2 && number2 < 10) ? true : false;
        boolean flag3 = (0 < number3 && number3 < 10) ? true : false;
        if (flag && flag1 && flag2 && flag3) {
            return true;
        }
        return false;

    }
}
