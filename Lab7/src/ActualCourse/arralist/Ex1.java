package ActualCourse.arralist;

/*
Iterable
    Colection:
     -List
     -Set
     -Queue
 */

import java.util.ArrayList;
import java.util.List;

public class Ex1 {
    public static void main(String[] args) {

        //without generic
        List bulklist = new ArrayList();
        bulklist.add(1);
        bulklist.add("two");
        bulklist.add(new Object());

        System.out.println(bulklist);

        List<String> list1 = new ArrayList<>();
        System.out.println(list1.isEmpty());
        list1.add("one");
        list1.add("two");
        list1.add(0,"111");
        list1.add(1,"1");

        System.out.println(list1);
        System.out.println(list1.size());

        if(list1.contains("one")){
            System.out.println(list1.remove(0));
            System.out.println(list1.remove("two"));
        }
        System.out.println(list1);
       // list1.remove(2);

        List<Integer> ints = new ArrayList<>();
        ints.add(1);

        List<String> list2 = new ArrayList<>(list1);
        System.out.println("List 2 created: " + list2);
        list2.addAll(list2);
        System.out.println(list2);
        list2.addAll(1,list2);
        System.out.println(list2);
        list2.add("last element");
        System.out.println(list2);
        list2.removeAll(list1);
        System.out.println("After remove all" + list2);

        System.out.println("List1: " + list1);
        list1.clear();
        System.out.println("List1 after clear: " + list1);

    }
}
