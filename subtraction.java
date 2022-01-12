package javamethods;

public class subtraction {
    int sub=0;
    public int subNumbers(int a,int b){
        sub=b-a;
        return sub;
    }

    public static void main(String[] args) {

        subtraction number=new subtraction();

        int ans= number.subNumbers(45,48);
        System.out.println("The  difference is "+ans);

    }
}

