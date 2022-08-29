public class Ques23 {
    public static void main(String[] args) {
        float[] arr={10.1f,20.2f,30.3f,40.4f,50.5f};
        float sum=0;

        for(float element:arr)
        {
            sum=sum+element;
        }

        System.out.println("The sum of the arrray is: "+sum);
    }
}
