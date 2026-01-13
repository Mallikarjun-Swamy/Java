package collectionFramework.list.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ComparableExample {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(5,"Ramesh"));
        studentList.add(new Student(1,"Ankush"));
        studentList.add(new Student(4,"Sneha"));
        studentList.add(new Student(3,"Ganesh"));
        studentList.add(new Student(2,"Mallikarjun"));

        System.out.println("Before Sorting" + studentList);

        studentList.sort(null);

        System.out.println("After Sorting" + studentList);



    }

}

