package dsa.linkedlist;

public class Linked_list {

    private Node head;

    class Node {

         private int data;
         private Node next;
         private Node prev;

         Node(int value) {
            this.data = value;
            this.next = null;
            this.prev = null;
        }

    }

    //Insert at starting point

        void InsertAtStart( int val ){

            Node NNode = new Node(val);

            if(head == null)
                head = NNode;
            else {

                NNode.next = head;
                head.prev = NNode;
                head = NNode;
            }

        }

    //Print Elements of List

        void PrintList(){
        Node temp = head;

         System.out.println("Elements of List are as follows: ");
        while(temp != null) {
            System.out.print(" " + temp.data);
            temp = temp.next;
        }

         System.out.println();
    }

    // Insert at End of List

        void InsertAtEnd( int val ){

        Node NNode = new Node(val);
        Node previous_Node = null;

            if(head == null)
            head = NNode;
        else{
            Node temp = head;

            while (temp != null){
                previous_Node =  temp;
                temp = temp.next;
            }

            previous_Node.next = NNode;
            NNode.prev = previous_Node;

        }

        }





    public static void main(String[] args){

        Linked_list list1 = new Linked_list();

        list1.PrintList();

        list1.InsertAtStart(13);
        list1.InsertAtStart(14);
        list1.InsertAtStart(15);
        list1.InsertAtStart(16);

        list1.PrintList();

         list1.InsertAtEnd(20);
        list1.InsertAtEnd(21);
        list1.InsertAtEnd(22);
        list1.InsertAtEnd(23);
        list1.PrintList();

        list1.InsertAtStart(12);
        list1.InsertAtStart(11);

        list1.PrintList();

    }
}
