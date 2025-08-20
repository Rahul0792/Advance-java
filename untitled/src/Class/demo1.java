package Class;

public class demo1 {
    public static void main(String[] args) {
        System.out.println(demo2.add(100,200));
        System.out.println(demo3.add(1000,2000));
    }


    public class demo2{
    public static int add(int number1 , int number2){
        return number1 + number2;
    }

    }
}
