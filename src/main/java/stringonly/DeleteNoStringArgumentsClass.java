package stringonly;

import java.util.ArrayList;

public class DeleteNoStringArgumentsClass {
    public static void deleteArgs(ArrayList<Object> list) {

        for(int i = 0; i <list.size(); i++) {
            if(!(list.get(i) instanceof String))
            {
                list.remove(i);
                i--;
            }
        }
    }
}
