package oop.inner;

class OuterClass{
    int num=10;

    class InnerClassExmpl{
        int num = 5;
    }
}
public class InnerClass {
    public static void main(String[] args) {

        OuterClass outerClass = new OuterClass();
        System.out.println("OutrClass value: "+outerClass.num);
        OuterClass.InnerClassExmpl innerClassExmpl = outerClass.new InnerClassExmpl();
        System.out.println("InnerClass value: "+innerClassExmpl.num );
    }
}
