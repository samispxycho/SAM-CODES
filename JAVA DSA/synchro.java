
/*
//Synchronized method
class BookTheaterSeat{
    int total_seats = 10;
    synchronized void bookseat(int seats){
        if(total_seats >= seats){
            System.out.println("Seats booked successfully");
            total_seats = total_seats - seats;
            System.out.println("Seats left: "+total_seats);
        }else{
            System.out.println("Seats cant be booked");
            System.out.println("Seats left: "+total_seats);
        }
    }
}

public class synchro extends Thread{

    static BookTheaterSeat b;
    int seats;

    public void run(){
        b.bookseat(seats);
    }
    public static void main(String[] args) {
        b = new BookTheaterSeat();
        synchro sameer = new synchro();
        sameer.seats = 7;
        sameer.start();

        synchro gem = new synchro();
        gem.seats = 6;
        gem.start();
    }
}
*/

//synchronized block
class BookTheaterSeat{
    int total_seats = 10;
    void bookseat(int seats){
        //1000 lines of code
        synchronized(this){
            if(total_seats >= seats){
                System.out.println("Seats booked successfully");
                total_seats = total_seats - seats;
                System.out.println("Seats left: "+total_seats);
            }else{
                System.out.println("Seats cant be booked");
                System.out.println("Seats left: "+total_seats);
            }
        }
        //1000 lines of code
    }
}

public class synchro extends Thread{

    static BookTheaterSeat b;
    int seats;

    public void run(){
        b.bookseat(seats);
    }
    public static void main(String[] args) {
        b = new BookTheaterSeat();
        synchro sameer = new synchro();
        sameer.seats = 7;
        sameer.start();

        synchro gem = new synchro();
        gem.seats = 6;
        gem.start();
    }
}

