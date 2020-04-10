import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList();//angle bracket specify that this stores strings
        myList.add("A");
        myList.add("B");
        myList.add(1,"C");
        System.out.println(myList);
        myList.remove("B");
        System.out.println(myList);//insert or remove choose linkedlist, if i want to get elements,arraylist is faster
        //正常情况下 arraylist最常用 如果有太多insert或者remove 选择linkedlist
    }
}
