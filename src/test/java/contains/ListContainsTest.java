package contains;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ListContainsTest {

    ListContains cont;
    ArrayList<Integer> initList;

    @Before
    public void init() {
        cont = new ListContains();
        initList = new ArrayList<>();
        initList.add(-6);
        initList.add(12);
        initList.add(4);
        initList.add(-35);
        initList.add(0);
        initList.add(13);
    }

    @Test
    public void containsYes() {
        int num = 13;
        Assert.assertEquals(true, cont.contains(initList, num));
    }

    @Test
    public void containsNo() {
        int num = 14;
        Assert.assertEquals(false, cont.contains(initList, num));
    }
}