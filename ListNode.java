public class ListNode {

    Node head;
    int  size;

       class Node {
            int item;
            Node next;

        Node (){
           this.next =null;
       }

    }
    ListNode(){
           size = 0;
    }

    void pushElement(int item){

           Node new_node = new Node();

           new_node.item  = item ;

    }
    public static void main(String[] args) {

        ListNode l1 =  new ListNode();
        System.out.println(l1.size);

    }

}
