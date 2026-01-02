package collectionFramework.list.arrayList;

import java.util.Arrays;


public class MyCustomArrayList<T> {

    private static final int DEFAULT_CAPACITY = 10;
    private int currentIndex = 0;
    private Object[] elementData;


    // Default Capacity Constructor
    public MyCustomArrayList() {
        this.elementData = new Object[DEFAULT_CAPACITY];
    }


    // Custom Capacity Constructor
    public MyCustomArrayList(int initialSize) {
        if (initialSize >= 0 && initialSize < Integer.MAX_VALUE) {
            this.elementData = new Object[initialSize];
        } else {
            throw new IllegalArgumentException("Argument out of Range");
        }
    }

    // method to add element at last
    public void insert(T element) {
        if (currentIndex == elementData.length) {
            grow();
        }
        elementData[currentIndex] = element;
        currentIndex++;
    }

    // method to add element at a specified index
    public void insertAt(int index, T element) {
        if (index < 0 || index > currentIndex) {
            throw new IllegalArgumentException("Index : " + index + " is out of Range" + "Size : " + size());
        }

        if (currentIndex >= elementData.length) {
            grow();
        }

        for (int i = currentIndex; i > index; i--) {
            elementData[i] = elementData[i - 1];
        }

        elementData[index] = element;
        currentIndex++;
    }

    // method to remove element at a specified index
    public void removeAt(int index) {
        if (index >= 0 && index < currentIndex) {
            for (int i = index; i < currentIndex - 1; i++) {
                elementData[i] = elementData[i + 1];
            }
            elementData[currentIndex - 1] = null;
            currentIndex--;
        } else {
            throw new IllegalArgumentException("Index : " + index + " is out of Range" + "Size : " + size());
        }
    }

    // method to remove specified element
    public boolean removeElement(T element) {
        int index = getIndexOf(element);
        if (index != -1) {
            for (int i = index; i < currentIndex - 1; i++) {
                elementData[i] = elementData[i + 1];
            }
            elementData[currentIndex - 1] = null;
            currentIndex--;
            return true;
        } else {
            return false;
        }
    }

    // method to return specified element index
    public int getIndexOf(T element) {
        for (int i = 0; i < currentIndex; i++) {
            if (elementData[i].equals(element))
                return i;
        }
        return -1;
    }

    // method to return specified element index
    public int getLastIndexOf(T element) {
        for (int i = currentIndex - 1; i >= 0; i--) {
            if (elementData[i].equals(element))
                return i;
        }
        return -1;
    }

    // method to return element from specified index
    public T getElementAt(int index) {
        if (index < 0 || index >= currentIndex) {
            throw new IllegalArgumentException("Index : " + index + " is out of Range" + "Size : " + size());
        }
        T element = (T) elementData[index];
        return element;
    }

    public T replace(int index, T element) {
        if (index < 0 || index >= currentIndex) {
            throw new IllegalArgumentException("Index : " + index + " is out of Range" + "Size : " + size());
        }
        T oldElement = (T) elementData[index];
        elementData[index] = element;
        return oldElement;
    }

    // method to clear Array
    public void clearArray() {
        if (elementData.length > 0) {
            elementData = new Object[DEFAULT_CAPACITY];
            currentIndex = 0;
        }
    }

    //method to return the size of ArrayList
    public int size() {
        return currentIndex;
    }

    //method to return new capacity Array
    private void grow() {
        int oldSize = elementData.length;
        int newSize = oldSize + (oldSize / 2) + 1;
        elementData = Arrays.copyOf(elementData, newSize);

    }

    //method to check wether the ArrayList is Empty or not
    public boolean isEmpty() {
        return currentIndex == 0;
    }

    //method to check wether the element is present or not
    public boolean searchElement(T element) {
        return getIndexOf(element) >= 0;
    }

    @Override
    public String toString() {
        if (currentIndex == 0) {
            return "[]";
        }
        StringBuilder stringBuilder = new StringBuilder("[");
        for (int i = 0; i < currentIndex; i++)
            stringBuilder.append(elementData[i]).append(", ");
        stringBuilder.append("\b\b").append("]");
        return stringBuilder.toString();
    }

}


