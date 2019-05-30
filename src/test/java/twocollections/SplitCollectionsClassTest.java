package twocollections;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SplitCollectionsClassTest {
    SplitCollectionsClass split;
    ArrayList<Long> initList = new ArrayList<>();
    ArrayList<Long> testNeg = new ArrayList<>();
    ArrayList<Long> testPos = new ArrayList<>();

    @Before
    public void init() {
        split = new SplitCollectionsClass();

        initList.add((long)-5);
        initList.add((long)5);
        initList.add((long)4);
        initList.add((long)0);
        initList.add((long)17);
        initList.add((long)-3);

        testNeg.add((long)-5);
        testNeg.add((long)-3);

        testPos.add((long)5);
        testPos.add((long)4);
        testPos.add((long)0);
        testPos.add((long)17);
    }

    @Test
    public void splitCollectionNeg() {
        RetArgumentClass retArg = split.SplitCollection(initList);
        Assert.assertEquals(testNeg, retArg.retNegativeList());
    }

    @Test
    public void splitCollectionPos() {
        RetArgumentClass retArg = split.SplitCollection(initList);
        Assert.assertEquals(testPos, retArg.retPositiveList());
    }
}