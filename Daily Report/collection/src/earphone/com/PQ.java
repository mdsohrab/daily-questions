package earphone.com;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class StringLengthComparator implements Comparator<String> {
    @Override
    public int compare(String value1,String value2){
        //using -operator to sort the oder in the descending
        return -Integer.compare(value1.length(), value2.length());

    }
}


public class PQ {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>(new StringLengthComparator());
        queue.poll();
        queue.offer("Apple");
        queue.addAll(List.of("Zebra","Monkey","cat"));
        queue.remove();
        queue.remove("Monkey");
        queue.poll();
        queue.poll();
        queue.addAll(List.of("sammm","da","tapp","jugjug"));
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue);
    }
}
