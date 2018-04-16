package com.thoughtworks;

import java.util.Scanner;

/**
 * Created by wangjie on 2018/4/10.
 */
public class AquireReader {

    public int read(){
        System.out.println("请输入学生的个数：");
        Scanner scanner =new Scanner(System.in);
        int num=scanner.nextInt();
        return num;
    }
}
