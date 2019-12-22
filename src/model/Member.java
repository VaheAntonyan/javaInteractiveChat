package model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Member {

    private String name;

    public Member() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void driver() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println();
            System.out.println(name);
            System.out.println("Press Number for Action\n1. Send message\n2. Exit chat");
            String st = scan.nextLine();
            if (st.equals("1")) {
                SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
                Date date = new Date(System.currentTimeMillis());
                System.out.println(formatter.format(date) + " " + this.name + " " + "name: text");
            } else {
                if (st.equals("2")) {
                    System.out.println("Member " + this.name + " left chat.");
                    break;
                } else {
                    System.out.println("Not a valid input. Please choose one of the options below.");
                }
            }
        }
    }
}