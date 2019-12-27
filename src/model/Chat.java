package model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Chat {
    private int membersCount;
    private List<Member> membersList = new ArrayList<Member>();
    private static final SimpleDateFormat FORMATTER = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

    public Chat() {
        System.out.println("Input count of members:");
        Scanner sc = new Scanner(System.in);
        int membersCount = sc.nextInt();
        this.membersCount = membersCount;
        for (int i = 0; i < membersCount; ++i) {
            membersList.add(new Member().name("member" + (i + 1)));
        }
        startChat();
    }

    public void startChat() {
        Scanner scan = new Scanner(System.in);
        while (membersCount != 0) {
            int index = (int)(Math.random() * membersCount);
            String currentMemberName = membersList.get(index).getName();
            System.out.println();
            System.out.println(currentMemberName);
            System.out.println("Press Number for Action\n1. Send message\n2. Exit chat");
            int action = scan.nextInt();
            switch (action) {
                case 1:
                    Date date = new Date(System.currentTimeMillis());
                    System.out.println(FORMATTER.format(date) + " " + currentMemberName + " " + "name: text");
                    break;
                case 2:
                    membersList.remove(index);
                    --membersCount;
                    System.out.println("Member " + currentMemberName + " left chat.");
                    break;
                default:
                    System.out.println("Not a valid input. Please choose one of the options below.");
            }
        }
        System.out.println("Chat is closed.");
    }
}