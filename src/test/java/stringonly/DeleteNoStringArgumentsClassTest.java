package stringonly;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class DeleteNoStringArgumentsClassTest {

    ArrayList<Object> list;
    ArrayList<Object> testList;
    Someclass obj;

    @Before
    public void init() {
        obj = new Someclass();
        list = new ArrayList<>();
        testList = new ArrayList<>();

        list.add("Hello");
        list.add(-5);
        list.add("my");
        list.add((long)-45.66);
        list.add(22);
        list.add(43);
        list.add("dear");
        list.add("friend");
        list.add(obj);
        list.add(obj);
        list.add(obj);

        testList.add("Hello");
        testList.add("my");
        testList.add("dear");
        testList.add("friend");
    }
    @Test
    public void deleteArgs() {
        DeleteNoStringArgumentsClass.deleteArgs(list);
        Assert.assertEquals(testList, list);
    }
}

class Someclass {
    String name;

    public Someclass() {
        name = "Some Class";
    }
}