package contains;

import java.util.ArrayList;
import java.util.Scanner;

public class MainContains {
    public static void main(String[] args) {
        ListContains containsTest = new ListContains();
        ArrayList<Integer> list = new ArrayList<>();

        Scanner in = new Scanner(System.in);
        System.out.println("Enter list args:");
        for(int i = 0; i<10; i++) {
            int num = in.nextInt();
            list.add(num);
        }

        System.out.println("Enter int to check");
        int num = in.nextInt();

        if(containsTest.contains(list, num))
            System.out.println("Contains");
        else
            System.out.println("Not contains");
    }
}
