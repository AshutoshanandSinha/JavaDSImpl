public class Linked_list {


    Node head;


    class Node {

        int item;
        Node next;

        Node (int val ){
            this.item = val;
            this.next = null;
        }



    }

    void Add(int val){

     Node new_node = new Node(val);

     new_node.next = head;

     head = new_node;
    }

    int Count(){

        int count =0;

        Node temp = head;

        while (temp != null){

            count++;

            System.out.println( " The " + count+ " Element is " + temp.item );

            temp = temp.next;
        }

        return count;

    }




    public static void main (String[] args){

        Linked_list l1 = new Linked_list();

        l1.Add(5);
        l1.Add(6);
        l1.Add(7);
        l1.Add(8);
        l1.Add(9);

        System.out.println("Number of Elements in Linked List is " + l1.Count());

        System.out.println(l1);

    }


}
