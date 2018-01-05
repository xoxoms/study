package list;

/**
 * Created by ms on 2018. 1. 2..
 */
public class Main {
    public static void main(String[] args) {
        List<String> linkedList = new LinkedList();
        linkedList.add("1");
        linkedList.add("3");
        linkedList.add("4");
        linkedList.add("5");
        linkedList.addTo("0", 0);
        linkedList.addTo("2", 2);

        System.out.println(linkedList.toString());
        System.out.println(linkedList.size());
        System.out.println(linkedList.get(2));


        linkedList.remove(0);
        linkedList.remove(0);
        linkedList.remove(0);
        linkedList.remove(0);
        linkedList.remove(0);
        linkedList.remove(0);
        linkedList.remove(0);
        System.out.println("toString: " + linkedList.toString());
        System.out.println(linkedList.size());
    }
}
