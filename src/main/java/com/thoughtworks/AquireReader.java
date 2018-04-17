package com.thoughtworks;

import java.util.Scanner;

/**
 * Created by wangjie on 2018/4/10.
 */
public class AquireReader {

    public int read(){
        System.out.println("请输入学生的个数：");
        int num= 0;
        while (true) {
            try {
                Scanner scanner =new Scanner(System.in);
                num = scanner.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("请输入正确的数字！");
            }
        }
        return num;
    }
}
