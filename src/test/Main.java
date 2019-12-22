package test;

import model.Member;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input count of members:");
        Scanner sc = new Scanner(System.in);
        int membersCount = sc.nextInt();
        Member[] membersArray = new Member[membersCount];
        for (int i = 0; i < membersCount; ++i) {
            membersArray[i] = new Member();
            membersArray[i].setName("member" + (i + 1));
        }

        List<Member> activeMembersList = new ArrayList<Member>();
        System.out.print("activeMembers: ");
        for (int i = 0; i < membersCount; ++i) {
            if (Math.random() >= 0.5) {
                activeMembersList.add(membersArray[i]);
                System.out.print(i+1 + " ");
            }
        }
        int amlSize = activeMembersList.size();
        System.out.println();
        System.out.println("activeMembersList size: " + amlSize);

        while (amlSize != 0) {
            int index = (int)(Math.random() * amlSize);
            activeMembersList.get(index).driver();
            activeMembersList.remove(index);
            --amlSize;
        }
    }
}
