package collectionFramework.list.arrayList;

import java.sql.Array;

public class OwnArrayList<T> {

    static final int DEFAULT_CAPACITY = 10;
    Object[] elementData;
    static int currentIndex = 0;


    public OwnArrayList(){
            this.elementData = new Object[DEFAULT_CAPACITY];
    }

    public OwnArrayList(int initialCapacity){
        this.elementData = new Object[initialCapacity];
    }

    public void  add(T element){
        this.elementData[currentIndex] = element;
        currentIndex++;
    }

    public int size(){
       return elementData.length;
    }

    public T getValueAtIndex(int index){
        if (index>elementData.length){
            throw new IndexOutOfBoundsException();
        }
        return (T) elementData[index];
    }



    public static void main(String[] args) {

        OwnArrayList<String> list = new OwnArrayList<>();
        list.add("Hello");
        list.add("How");
        list.add("Are");
        list.add("Are");
        list.add("Are");
        list.add("Are");
        list.add("Are");
        list.add("Are");
        list.add("Are");
        list.add("Are");

        System.out.println(list.size());

        System.out.println(list.getValueAtIndex(2));

    }


}


