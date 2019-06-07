public class BinaryTree {

     Node head;

    void addNode(int data) {

        Node newNode = new Node(data);

        if (head == null)
            head = newNode;
        else {
            Node currentNode = head;
            Node parentNode;

            while(true){
                parentNode=currentNode;

                if(data < currentNode.data) {
                    currentNode = currentNode.left;
                    if (currentNode == null)
                        parentNode.left = newNode;
                    return;
                }

                else {
                    currentNode = currentNode.right;
                    if (currentNode == null) {
                        parentNode.right = newNode;
                        return;
                    }

                }

            }


        }

    }

    void traverseBT(Node BT){

        if (BT != null){
            traverseBT(BT.left);
            System.out.println(BT);
            traverseBT(BT.right);
        }
    }




    class Node {
        Node left, right;
        int data;

        Node(int item) {

            this.data = item;
        }

        public String toString (){
            return data + " ";
        }


    }


    public static void main(String[] args){

        BinaryTree BT1 = new BinaryTree();

        BT1.addNode(10);
        BT1.addNode(11);
        BT1.addNode(12);
        BT1.addNode(7);

        BT1.traverseBT(BT1.head);

    }


}
