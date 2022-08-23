package earphone.com;

import java.util.ArrayList;
import java.util.Iterator;

public class list {
    public static void main(String[] args) {
        ArrayList<String>name=new ArrayList<>();
        name.add("sohrab");
        name.add("zain");
        name.add("md");
        name.add("parmod");

        System.out.println(name);
        Iterator itr= name.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
