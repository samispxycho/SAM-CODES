public class VarArgs {
    public static int sum(int ... arr)
    {
        int add=0;
        for(int element:arr)
        {
            add+=element;
        }
        return add;
    }
    public static void main(String[] args) {
        System.out.println("The sum of 5 and 5 is "+sum(5,5));
        System.out.println("The sum of 5,10,15 is "+sum(5,10,15));
        System.out.println("The sum of 5,5,10,175 is "+sum(5,5,10,175));
    }
}
