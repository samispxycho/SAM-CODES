package RECURSION;

public class Name5T {

    static void name(int time){
        if(time==0)return;
        else{
            System.out.println("Sameer");
            name(--time);
        }
    }

    public static void main(String[] args) {
        Name5T.name(5);
    }
}
