package dsa.linkedlist;

public class Linked_list {

    private Node head;
    private int count;

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

        void PrintList() {
            Node temp = head;
            if (head == null)
                System.out.println("OOPS!!! No Element in List!!!");
            else {
                System.out.println("Elements of List are as follows: ");
                while (temp != null) {
                    System.out.print(" " + temp.data);
                    temp = temp.next;
                }

                System.out.println();
            }
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

        // Delete an element from list

       void DeleteElement(int val){

        boolean ElementFound = false;
        Node temp = head;

           if (head.data == val){
               head = head.next;
               return;
           }


        Node previous_node ;
        if (head == null)
            System.out.println("OOPS!!! No Element in List!!!");
        else{
         loop: while(head != null){
                previous_node = head;
                if (head.data == val){
                    System.out.println("Element removed is " + head.data);
                    previous_node.prev.next= head.next;
                    ElementFound = true;
                    break loop;
                }
                else
                    head = head.next;
            }
            if(!ElementFound)
                System.out.println("No Such Element found in list.");
        }

        head = temp;

       }


       // Count number of elements in the list

      void CountNoOfItems(){

        Node temp = head;

        System.out.println("Number of elements in list are : "+ lengthOfList(temp));

      }

      int lengthOfList(Node ref){

        if(ref == null)
            return 0;

        return 1 + lengthOfList(ref.next);
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


        list1.DeleteElement(20);

        list1.PrintList();

        list1.DeleteElement(11);

        list1.PrintList();

        list1.CountNoOfItems();

    }
}
