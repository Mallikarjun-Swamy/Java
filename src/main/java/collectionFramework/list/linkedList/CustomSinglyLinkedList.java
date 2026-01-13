package collectionFramework.list.linkedList;


public class CustomSinglyLinkedList<T> {

    private Node headPointer;
    private int nodeCounter;


    //Node for storing data and next element address
    private class Node {
        T data;
        Node nextPointer;

        Node(T data){
            this.data = data;
            this.nextPointer = null;
        }
    }

    //method to add element at first position (0 index)
    public void addAtFirst(T data){
        Node newNode = new Node(data);
        if (headPointer == null){
            headPointer = newNode;
            nodeCounter++;
            return;
        }
        newNode.nextPointer = headPointer;
        headPointer = newNode;
        nodeCounter++;
    }


    //method to add element
    public void add(T data){
        addAtLast(data);
    }


    //method add element at last
    public void addAtLast(T data){
        Node newNode = new Node(data);
        if (headPointer == null){
            headPointer = newNode;
            nodeCounter++;
            return;
        }

        Node currentNode = headPointer;
        while (currentNode.nextPointer != null){
            currentNode = currentNode.nextPointer;
        }
        currentNode.nextPointer = newNode;
        nodeCounter++;
    }

    //method to get element at a index
    public T get(int index){
        Node currentNode = headPointer;
        if (index >= 0 && index < nodeCounter){
            for (int i = 0; i < index; i++) {
                currentNode = currentNode.nextPointer;
            }
        } else {
            throw new IllegalArgumentException("Index : " + index + " is out of Range" + " since Size is " + size());
        }

        return currentNode.data;
    }

    //method to check wether a element is available or not in the LinkedList
    public boolean searchElement(T element){
        Node currentNode = headPointer;
        while (currentNode.nextPointer != null){
            if (currentNode.data.equals(element)){
                return true;
            }
            currentNode = currentNode.nextPointer;
        }
        return false;
    }

    //method to remove element at particular index
    public void removeAtIndex(int index){
        Node nextOfremove = headPointer;
        Node prevOfremove = headPointer;
        if (index >= 0 && index < nodeCounter){
            for (int i = 0; i < index ; i++) {
                nextOfremove = nextOfremove.nextPointer;
                prevOfremove = nextOfremove.nextPointer;
            }
            nextOfremove = nextOfremove.nextPointer;
            prevOfremove = nextOfremove;
        } else {
            throw new IllegalArgumentException("Index : " + index + " is out of Range" + " since Size is " + size());
        }

    }


    //method to return the size of LinkedList
    public int size(){
        return nodeCounter;
    }



    //method to print all elements in the collections
    @Override
    public String toString() {
        if (headPointer == null){
            return "[]";
        }

        StringBuilder builder = new StringBuilder("[");

        Node currentNode = headPointer;
        while (currentNode != null){
            builder.append(currentNode.data).append(", ");
            currentNode = currentNode.nextPointer;
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
