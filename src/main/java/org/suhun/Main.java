package org.suhun;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        LinkedListImp linkedListImp = new LinkedListImp();
        linkedListImp.add(10);
        linkedListImp.add(20);
        linkedListImp.add(30);
        linkedListImp.add(40);
        linkedListImp.printNode();
        linkedListImp.search(20);
    }
}