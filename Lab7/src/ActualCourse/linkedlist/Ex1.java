package ActualCourse.linkedlist;

/*
List
Quie
    Deque
        ArrayyDeque
        LinkedList
 */


import java.util.LinkedList;

public class Ex1 {

    public static void main(String[] args) {

        LinkedList<String> list1 = new LinkedList<>();
        list1.add("aa");
        list1.add("aa");
        list1.add(1, "bb");
        list1.add(1, "bb");
        list1.addFirst("fff");
        list1.addFirst("fff");
        list1.addLast("rrr");
        list1.addLast("aa");
        System.out.println(list1);

        //list1.remove("aa"); //By default e primul element
        //list1.remove(1);
        //System.out.println(list1.removeFirst());
        //System.out.println(list1.removeLast());
        //System.out.println(list1);

        list1.removeFirstOccurrence("aa");
        System.out.println(list1);
        list1.removeLastOccurrence("aa");
        System.out.println(list1);
    }
}
