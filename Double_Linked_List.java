public class Double_Linked_List {

    Dnode head;

    class Dnode {

        String val;
        Dnode next;
        Dnode prev;

        Dnode (String val){
            this.val = val;
            this.next = null;
            this.prev = null;
        }

    }

    public void insertAtFront(String str1){

        Dnode d1 = new Dnode(str1);

        if (head == null) {
            head = d1;
            return;
        }

        head.prev = d1;
        d1.next = head;
        head = d1;


    }

    public void insertAfter(String str2){

        Dnode temp = head;
        Dnode d1 = new Dnode(str2);

        if (head == null) {
            head = d1;
            return;
        }

        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = d1;
        d1.prev = temp;


    }

    public void  find(String data){

        System.out.println();
        Dnode temp = head;

        loop : while (temp != null ){
            if ( temp.val.equalsIgnoreCase(data)) {
                System.out.println("Value found is :" + temp.val);
                break loop;
            }
               temp = temp.next;
        }

        if (temp == null)
            System.out.println("No such value found");

    }

    public void printDl(){
        Dnode temp = head;

        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();

    }



    public static void main(String[] args){

        Double_Linked_List D1 = new Double_Linked_List();

        D1.insertAtFront("Ashutoshanand");


        D1.insertAfter("Sinha");
        D1.insertAfter("Rajput");
        D1.insertAfter("Chandan");
        D1.insertAfter("Parth");
        D1.insertAfter("Jadvani");


        D1.printDl();

        D1.find("RajPt");


    }

}
