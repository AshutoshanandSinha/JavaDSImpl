package dsa.btree;

import java.util.LinkedList;
import java.util.Queue;

public class BTree {

    Node root;

    class Node {

        Node leftChild;
        Node rightChild;
        int data;

        Node(int val) {
            this.data = val;
        }

        public String toString(){
            return " "+ data;
        }

    }

    void insertNode(int dat) {

        Node nNode = new Node(dat);

        if (root == null)
            root = nNode;

        else {
            Node temp = root;
            Node prevNode;

            while (true) {
                prevNode = temp;

                if (dat < temp.data) {
                    temp = temp.leftChild;
                    if (temp == null) {
                        prevNode.leftChild = nNode;
                        return;
                    }
                } else {
                    temp = temp.rightChild;
                    if (temp == null) {
                        prevNode.rightChild = nNode;
                        return;
                    }
                }

            }
        }
    }


    void LevelOrderTraverse(Node head){

        if(head == null)
            return ;

        Queue<Node> queue = new LinkedList<>();

        queue.add(head);

        while(!queue.isEmpty()){

            Node cnode = queue.peek();

            System.out.println(cnode);

            if(cnode.leftChild != null)
                queue.add(cnode.leftChild);
            if (cnode.rightChild != null)
                queue.add(cnode.rightChild);

            queue.remove();

        }

    }
    void Traverse(Node ref){

        if (ref != null) {
            Traverse(ref.leftChild);
            System.out.println(ref);
            Traverse(ref.rightChild);
        }

    }

    public static void main(String[] args) {

        BTree BT = new BTree();


        BT.insertNode(4);
        BT.insertNode(6);
        BT.insertNode(5);
        BT.insertNode(8);
        BT.insertNode(2);
        BT.insertNode(9);
        BT.insertNode(1);
        BT.insertNode(3);


         BT.Traverse(BT.root);

        System.out.println();

        BT.LevelOrderTraverse(BT.root);
    }


}



