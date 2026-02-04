package collectionFramework.list.linkedList;


public class CustomSinglyLinkedList<T> {

    private Node head;
    private int size;


    //Node for storing data and next element address
    private class Node {
        T data;
        Node next;

        Node(T data){
            this.data = data;
            this.next = null;
        }
    }

    //method to add element at first position (0 index)
    public void addAtFirst(T data){
        Node newNode = new Node(data);

        if (head == null){
            head = newNode;
            size++;
            return;
        }

        newNode.next = head;
        head = newNode;
        size++;
    }


    //method to add element
    public void add(T data){
        addAtLast(data);
    }


    //method add element at last
    public void addAtLast(T data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            size++;
            return;
        }

        Node currentNode = head;
        while (currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
        size++;
    }

    //method to get element at a index
    public T get(int index){
        Node currentNode = head;
        if (index >= 0 && index < size){
            for (int i = 0; i < index; i++) {
                currentNode = currentNode.next;
            }
        } else {
            throw new IllegalArgumentException("Index : " + index + " is out of Range" + " since Size is " + size());
        }

        return currentNode.data;
    }

    //method to check wether a element is available or not in the LinkedList
    public boolean searchElement(T element){
        Node currentNode = head;
        while (currentNode.next != null){
            if (currentNode.data.equals(element)){
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    //method to remove element at particular index
    public void removeAtIndex(int index){


    }


    //method to return the size of LinkedList
    public int size(){
        return size;
    }



    //method to print all elements in the collections
    @Override
    public String toString() {
        if (head == null){
            return "[]";
        }

        StringBuilder builder = new StringBuilder("[");

        Node currentNode = head;
        while (currentNode != null){
            builder.append(currentNode.data).append(", ");
            currentNode = currentNode.next;
        }
        builder.append("\b\b").append("]");
        return builder.toString();
    }


    public static void main(String[] args) {
        CustomSinglyLinkedList<String> list = new CustomSinglyLinkedList<>();

        list.addAtFirst("Arjun");
        list.addAtFirst("Sameer");
        list.addAtFirst("Arjun");
        list.addAtFirst("Sameer");

        System.out.println(list);
        //System.out.println(list.size());
        //System.out.println(list.get(3));
        //System.out.println(list.searchElement("Arjun"));
        list.removeAtIndex(1);
        System.out.println(list);

    }
}
