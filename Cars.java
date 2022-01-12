package javamethods;

public class Cars {
    int size;
    String color;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;

    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        Cars mycarone=new Cars();
        Cars mycartwo=new Cars();
        Cars mycarthree=new Cars();


        mycarone.setColor("Red");
        mycarone.setSize(7);

        System.out.println("My first car colour is "+mycarone.getColor()+"and size is "+mycarone.getSize());

        mycartwo.setColor("Red");
        mycartwo.setSize(5);

        String sValue=mycartwo.getColor();
        int cValue=mycartwo.getSize();
        System.out.println("For the second car,The color is "+sValue+" and the size is "+cValue);
    }




    }

