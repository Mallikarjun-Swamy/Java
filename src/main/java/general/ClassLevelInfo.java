package general;

import java.lang.reflect.Method;

public class ClassLevelInfo {
    /*
    we Can get all the class level information from a loaded .class (example Student class) via program using class Class Object.
    Which is created in heap during loading phase of jvm process. (but all the class metadata will be loaded in MetaSpace)

    Note:
    Only one class Class object created for each .class files and for each ClassLoader(like bootstrap, Extension,Application)
    which are loaded into metaspace. and it may be possible that jvm can create a different class Class objects for
    combination of different ClassLoaders for the same .class file if present in different ClassLoaders.
     */


    public static void main(String[] args) throws ClassNotFoundException{
        int count = 0;
        Class c1 = Class.forName("general.Student");
        Method[] marray = c1.getDeclaredMethods();

        for(Method method : marray){
            count++;
            System.out.println(method.getName());
        }

        System.out.println("Total declared Methods in Student Class are = " + count);

        Student student1 = new Student("Arjun", 1);
        Class c2 = student1.getClass();
        Student student2 = new Student("Mallikarjun", 1);
        Class c3 = student2.getClass();
        System.out.println("Std Arjun hash code is " + c3.hashCode());
        System.out.println("Std Mallikarjun hash code is " + c3.hashCode());
        System.out.println(c2 == c3);

    }
}

class Student {
    String name;
    int rollNo;

    Student(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName(){
        return name;
    }

    public int getRollNo(){
        return rollNo;
    }
}