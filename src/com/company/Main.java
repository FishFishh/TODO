package com.company;

import com.company.ORDER.Order;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("1-新建待办：");
        System.out.println("2-查看待办");
        System.out.println("3-删除待办");
        System.out.println("请选择功能:");
        Scanner in = new Scanner(System.in);
        Integer cmd = in.nextInt();
        Order order = null;
        switch (cmd) {
            case 1:
                order = new Newly();
                order.execute();
                break;
        }
    }
}
