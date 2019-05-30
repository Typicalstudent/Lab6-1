package twocollections;

import java.util.ArrayList;

public class SplitCollectionsClass {

    public RetArgumentClass SplitCollection(ArrayList<Long> startList) {
        RetArgumentClass retArg = new RetArgumentClass();
        for(long i:startList) {
            if(i<0)
                retArg.addToNegative(i);
            else
                retArg.addToPositive(i);
        }
        return retArg;
    }

}

