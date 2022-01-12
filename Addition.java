package javamethods;

public class Addition {
    int sum=0;
    public int addNumbers(int a,int b,int c){
        sum=a+b+c;
        return sum;
    }

    public static void main(String[] args) {

        Addition sales=new Addition();

     int ans= sales.addNumbers(45,48,50);
        System.out.println("The  sales sum is "+ans);

    }
}
