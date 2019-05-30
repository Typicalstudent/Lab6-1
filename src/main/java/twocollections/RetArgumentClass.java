package twocollections;

import java.util.ArrayList;

public class RetArgumentClass {
    private ArrayList<Long> negativeList;
    private ArrayList<Long> positiveList;

    public RetArgumentClass() {
        negativeList = new ArrayList<>();
        positiveList = new ArrayList<>();
    }

    void addToNegative(long num) {
        negativeList.add(num);
    }
    void addToPositive(long num) {
        positiveList.add(num);
    }

    public ArrayList<Long> retNegativeList() {
        return negativeList;
    }
    public ArrayList<Long> retPositiveList() {
        return positiveList;
    }
}
