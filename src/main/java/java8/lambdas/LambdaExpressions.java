package java8.lambdas;

import java.util.stream.Stream;

@FunctionalInterface
interface Demo {
    public void greet(String greet);  //Single Abstract Method
}


// 1 st way to implement a interface
class MyDemoClass implements Demo {
    String name;

    MyDemoClass(String name){
        this.name = name;
    }

    @Override
    public void greet(String greet) {
        System.out.println(greet + " " + this.name );
    }

    public static void main(String[] args) {
        MyDemoClass myDemoClass = new MyDemoClass("Arjun");
        myDemoClass.greet("Good morning");
    }
}


public class LambdaExpressions {



    public static void main(String[] args) {


//2nd way to implement interface using Anonymous InnerClass
        Demo demo = new Demo() {
            @Override
            public void greet(String greet) {
                System.out.println("Hi InnerClass " + greet);
            }
        };

        demo.greet("Good Morning");
//-------------------------------------------------------

//3rd way to implement an Functional interface using Lambda Expression
// (this is applicable only for Functional Interface)

       Demo mydemo = greet -> System.out.println("Hi Lambda " + greet);
       mydemo.greet("Good Evening");

    }

}
