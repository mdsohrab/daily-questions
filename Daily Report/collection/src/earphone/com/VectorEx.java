package earphone.com;
import java.util.*;
public class VectorEx {
    public static void main(String[] args) {
        Vector<String> al= new Vector<String>();
        al.add("sam");
        al.add("sohrab");
        al.add("zain");
        al.add("md");
        al.add("parmod");
        System.out.println(al);
        Iterator<String>itr= al.iterator();
                while(itr.hasNext())
                {
                    System.out.println(itr.next());
                }


    }
}
