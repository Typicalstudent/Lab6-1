package contains;

import java.util.ArrayList;

public class ListContains {
    public boolean contains(ArrayList<Integer> list, int num) {
        for(int i:list) {
            if(i == num)
                return true;
        }
        return false;
    }
}
