package org.suhun;

public class Main {
    public static void main(String[] args) {
        LinkedListImplement linkedListImplement = new LinkedListImplement();
        linkedListImplement.addNode(10);
        linkedListImplement.addNode(20);
        linkedListImplement.addNode(30);
        linkedListImplement.addNode(40);
        linkedListImplement.addNode(50);
        linkedListImplement.delete( 50);

        linkedListImplement.outputNode();
//        linkedListImplement.search(40);

    }
}