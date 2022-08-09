package CEO;
import  java.lang.*;
/*public class MotorBike1 {


        public static void main(String[] args) {
            MotorBike1 ducati = new MotorBike1();
            MotorBike1 yamaha = new MotorBike1();

            ducati.start();
            yamaha.start();

            ducati.setSpeed(100);
            yamaha.setSpeed(322);

            ducati.increaseSpeed(302);
            yamaha.increaseSpeed(42);

            ducati.decreaseSpeed(44);
            yamaha.decreaseSpeed(43);

            //int ducatiSpeed = ducati.getSpeed();
            //ducatiSpeed = ducatiSpeed + 100;
            //ducati.setSpeed(ducatiSpeed);

           // int yamahaSpeed = yamaha.getSpeed();
            //yamahaSpeed = yamahaSpeed + 300;
           // yamaha.setSpeed(yamahaSpeed);

            //ducati.speed = 45;
            //yamaha.speed = 40;
            System.out.println(ducati.getSpeed());
            System.out.println(yamaha.getSpeed());

        }



        private int speed;

    public void setSpeed(int speed) {
        if(speed > 0)
        this.speed = speed;
    }

    public int getSpeed() {
            return speed;
        }

        public void increaseSpeed(int howMuch){
        this.speed=this.speed + howMuch;
        }

        public void decreaseSpeed(int howMuch){
        this.speed=this.speed - howMuch;
        //set.Speed(this.speed - howMuch);
        }




        public void decreaseSpeed(int howMuch){
        if(this.speed - howMuch > 0)
        this.speed = this.speed- howMuch;
        }

        void start() {
            System.out.println("bike started please:");
        }
    }
*/


//Example 6 BookStore

public class BookStore {
    public static void main(String[] args) {
        BookStore ArtOfComputerProgramming = new BookStore();
        BookStore EffectiveJava = new BookStore();
        BookStore CleanCode = new BookStore();

        ArtOfComputerProgramming.setNoOfCopies(43);
        System.out.println(ArtOfComputerProgramming.getNoOfCopies());

        EffectiveJava.setNoOfCopies(34);
        CleanCode.setNoOfCopies(33);



    }

    private int noOfCopies;

    public int getNoOfCopies() {
        return noOfCopies;
    }


    public void setNoOfCopies(int noOfCopies){
        this.noOfCopies = noOfCopies;
    }
    public void increaseNoOfCopies(int howMuch)
    {
        setNoOfCopies(this.noOfCopies + howMuch);
    }

    public void decreaseNoOfCopies(int howMuch){
        setNoOfCopies(this.noOfCopies-howMuch);
    }
}
