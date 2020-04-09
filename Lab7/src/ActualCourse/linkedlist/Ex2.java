package ActualCourse.linkedlist;

import java.util.LinkedList;

/*
head --- tail

 */


public class Ex2 {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.offer("c");
        list.offerFirst("rr");

        System.out.println(list.element()); //NoSuchElementExceprion if list is empty
        //new LinkedList<>().element();

        System.out.println(list.peek()); //returneaza primul element
        System.out.println(list.poll()); //returneaza primul element si face remove
        System.out.println(list);

        // from deque
        list.pop(); // removeFirst()
        System.out.println(list);
    }
}
