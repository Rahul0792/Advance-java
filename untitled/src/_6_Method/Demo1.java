package _6_Method;

public class Demo1 {
    public static void main(String[] args) {
                  Demo1 demo1 = new Demo1();
                  B b = demo1.new B();
                  b.print();
    }
    public class A{
        public  void m1(){
            System.out.println("A class Instance  M1");
        }
        public static void m2(){
            System.out.println("A class Static M2");
        }

    }
    public class B{
        public void print(){
            System.out.println("B class Instance Print Method ");
            A a = new A();
            a.m1();
            a.m2();
            A.m2();
        }
    }

}
