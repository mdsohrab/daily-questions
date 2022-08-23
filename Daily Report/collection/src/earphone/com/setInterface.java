package earphone.com;

import com.sun.jdi.IntegerType;

import java.util.*;

public class setInterface {
    public static void main(String[] args) {
        Set<Integer>numbers=new HashSet<Integer>(List.of(12,45,20,75,85,13,41));
        Set<Integer>numbers1=new LinkedHashSet<Integer>(List.of(12,45,20,75,85,13,41));
        Set<Integer>numbers2=new TreeSet<>(List.of(12,45,20,75,85,13,41));
//        numbers.add(34);
//        numbers.add(33);
//        numbers.add(43);
//        numbers1.add(34);
//        numbers1.add(33);
//        numbers2.add(43);
//        numbers2.add(34);
//        numbers2.add(33);
//        numbers1.add(43);
        System.out.println(numbers);
        System.out.println(numbers1);
        System.out.println(numbers2);

        Set<Character>ss=new HashSet<Character>(List.of ('d','m','n','A','V','C','D','E','D','h','j','l'));
        System.out.println("HashSet" + ss);
        Set<Character>ss1=new LinkedHashSet<Character>(List.of ('d','m','n','A','V','C','D','E','D','h','j','l'));
        System.out.println("LinkedHashSET" + ss1);
        Set<Character>ss3=new TreeSet<>(List.of ('d','m','n','A','V','C','D','E','D','h','j','l'));
        System.out.println("TreeSet"+ ss3);

        TreeSet<Integer> num = new TreeSet<>(Set.of(34,23,34,23));
        System.out.println(num);
    }
}

