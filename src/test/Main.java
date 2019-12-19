package test;

import model.Member;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input count of members:");
        Scanner sc = new Scanner(System.in);
        int countOfMembers = sc.nextInt();
        Member[] memberArray = new Member[countOfMembers];
        for (int i = 0; i < countOfMembers; ++i) {
            memberArray[i] = new Member();
        }
        while (true) {
            System.out.println("Input your name to chat or X to exit");
            String bufName = sc.next();
            if (bufName.equals("X")) {
                break;
            } else {
                for (Member i : memberArray) {
                    if (bufName.equals(i.getName())) {
                        i.driver();
                    }
                }
            }
        }
    }
}