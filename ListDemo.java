import java.util.LinkedList;

public class ListDemo {

    public static void main (String[] args){

        //New linked list

        LinkedList l1 = new LinkedList ();

        l1.add("Ashu");
        l1.add("Chandu");
        l1.add(26);
        l1.add(27);
        l1.add('K');
        l1.add(true);

        System.out.println(l1);
    }
}
