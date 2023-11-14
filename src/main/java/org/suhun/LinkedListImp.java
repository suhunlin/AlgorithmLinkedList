package org.suhun;

public class LinkedListImp {
    public class Node{
        Integer val;
        Node next;
        public Node(int val){
            this.val = val;
        }
    }
    private Node start;
    private Node end;

    public void add(int val){
        if(start == null){
            start = new Node(val);
            end = start;
        }else{
            end.next = new Node(val);
            end = end.next;
        }
    }

    public void printNode(){
        if(start==null){
            System.out.println("Node is empty!!!");
            return;
        }else{
            System.out.println(start.val);
            Node haveNext = start.next;
            while(haveNext!=null){
                System.out.println(haveNext.val);
                haveNext = haveNext.next;
            }
        }
    }

    public Integer search(int val){
        //solution 1 suhun
//        int count = 1;
//        if(start == null){
//            System.out.println("Node is empty!!!");
//            return null;
//        }
//        if(start.val == val){
//            System.out.println("Found " + start.val + ",total find "+count+" times!");
//            return start.val;
//        }else{
//            Node haveNext = start.next;
//            while(haveNext!=null){
//                count++;
//                if(haveNext.val == val){
//                    System.out.println("Found "+ haveNext.val+", total find "+ count + " times!!!");
//                    return haveNext.val;
//                }else{
//                    haveNext = haveNext.next;
//                }
//            }
//        }
//        System.out.println("Nothing Found !!!Total find "+ count + " times!!!");
//        return null;
        //solution 2 teacher
        if(start == null){
            System.out.println("Node is empty!!!");
            return null;
        }else{
            Node node = this.start;
            while(true){
                if(node == null) break;
                if(node.val == val){
                    System.out.println("Find value " + node.val);
                    return node.val;
                }else{
                    node = node.next;
                }
            }
        }
        System.out.println(val + ":value not found " );
        return null;
    }
}
