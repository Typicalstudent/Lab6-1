package twocollections;

import java.util.ArrayList;
import java.util.Scanner;

import twocollections.*;

public class MainSplit {
    public static void main(String[] args) {
        ArrayList<Long> startList = new ArrayList<>();
        SplitCollectionsClass split = new SplitCollectionsClass();

        Scanner in = new Scanner(System.in);
        System.out.println("Enter arguments: ");
        for(int i = 0; i<10; i++) {
            long num = in.nextLong();
            startList.add(num);
        }

        RetArgumentClass retArg = split.SplitCollection(startList);
        System.out.print("Negative collection: ");
        for(long i:retArg.retNegativeList()) {
            System.out.print(i+" ");
        }
        System.out.print("\nPositive collection: ");
        for(long i:retArg.retPositiveList()) {
            System.out.print(i+" ");
        }
    }
}
