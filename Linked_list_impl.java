public class Linked_list_impl {

    int size ;
    Node head;

  class Node {

      int item;
      Node next;

      Node (int item){
          this.item = item;
          this.next = null;
      }



  }

   public void insertAfter(int data ){

     Node temp = head;
     while(head.next != null){
         head = head.next;
     }
     Node l1 = new Node(data);
     head.next = l1;
     head = temp;
     size +=1;

  }


  void addBefore (int item){

      Node  n = new Node(item);
      n.next = head;
      head = n;
      size++;

  }

 void  deleteItem(int data){

      Node temp = head;
      Node temp2 = temp;

      while (head.item != data){
          temp2 = head;
          head = head.next;
      }

     if(head.item == data) {
       head = temp2;
       head.next = head.next.next;
         size--;
     }
      head = temp;
    }


    void printList( ){

      Node temp = head;
      while(temp != null){
          System.out.print(temp.item + " ");
          temp = temp.next;

      }
        System.out.println();
  }

  public static void main (String[] args){

      Linked_list_impl list1 = new Linked_list_impl();

      list1.addBefore(5);
      list1.addBefore(6);
      list1.addBefore(7);
      list1.insertAfter(4);
      list1.addBefore(8);
      list1.addBefore(9);
      list1.insertAfter(3);

      System.out.println("Size: "+ list1.size);
      list1.printList();


      list1.deleteItem(4);
      System.out.println("After Delete item: ");
      System.out.println("Size: "+ list1.size);
      list1.printList();

  }



}
