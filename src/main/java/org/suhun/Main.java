package org.suhun;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        LinkedListImp linkedListImp = new LinkedListImp();
        linkedListImp.add(10);
        linkedListImp.add(20);
        linkedListImp.add(30);
        linkedListImp.add(40);

//        linkedListImp.search(20);
//        linkedListImp.delete(30);
        linkedListImp.add(50);
        linkedListImp.add(60);
        linkedListImp.delete(90);
//        linkedListImp.delete(60);
        linkedListImp.printNode();
    }
}