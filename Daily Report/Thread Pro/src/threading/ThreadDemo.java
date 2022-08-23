package threading;

class MyThread extends Thread {
    @Override
    synchronized public void run() {
        try {
            int i = 0;
            while (i < 10) {
                Thread.sleep(2000);
                System.out.println("Good Morning");
                Thread.sleep(200);
                System.out.println("Welcome");

                i++;
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}



public class ThreadDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
        MyThread t2= new MyThread();
        MyThread t3= new MyThread();
        t2.start();
        t2.setPriority(2);
        t3.setPriority(1);
        System.out.println( "t2 thread priority is :"+ t2.getPriority());
        System.out.println( "t3 thread priority is :"+ t3.getPriority());


    }
}