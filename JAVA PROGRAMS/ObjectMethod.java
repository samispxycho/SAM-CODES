public class ObjectMethod {

    int add(int x,int y)
    {
        int z=x+y;
        return z;
    }
    public static void main(String[] args) {
        int a=10,b=20,num1=30,num2=70;
        int sum1,sum2;

        ObjectMethod obj=new ObjectMethod();

        sum1=obj.add(a, b);
        System.out.println(sum1);

        sum2=obj.add(num1, num2);
        System.out.println(sum2);
    }
}
