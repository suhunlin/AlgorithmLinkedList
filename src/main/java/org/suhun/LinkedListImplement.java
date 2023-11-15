package org.suhun;

public class LinkedListImplement {
    class Node{
        Integer val;
        Node next;

        public Node(int val){
            this.val = val;
        }
    }
    private Node start;
    private Node end;

    public void addNode(int value){
        if (start == null) {
            start = new Node(value);
            end = start;
        }else{
            end.next = new Node(value);
            end = end.next;
        }
    }

    public void outputNode(){
        Node node = start;
        if(node!=null){
            int count = 1;
            while(true){
                if(node==null) break;

                System.out.println(count + ".Node value is "+ node.val);
                node = node.next;
                count++;
            }

        }else{
            System.out.println("No Node to output!!!");
        }
    }

    public Integer search(int value){
        Node node = start;
        if(node != null){
            while(true){
                if(node == null){
                    System.out.println("已經搜尋到最後一個節點了，跳出迴圈!!!");
                    break;
                }

                if(node.val == value){
                    System.out.println("搜尋到"+node.val);
                    return node.val;
                }else{
                    node = node.next;
                }
            }

        }else{
            System.out.println("一個節點都沒有，無法搜尋!!!");
            return null;
        }
        System.out.println("沒有搜尋到任何節點有"+value+"的值!!!");
        return null;
    }

    public void delete(int value){
        //第一個步驟，搜尋每一個Node，如果搜尋到，紀錄搜尋到的Node跟他的前一個Node
        Node node = start;
        Node nodeTarget = null;
        Node nodePre = null;

        if(node!=null){
            while(true){
                if(node == null){
                    System.out.println("已經搜尋到最後一個節點了，跳出迴圈!!!");
                    break;
                }

                if(node.val == value){
                    System.out.println("搜尋到"+node.val);
                    nodeTarget = node; //紀錄搜尋到的Node
                    break;
                }else{
                    nodePre = node; //紀錄前一個Node
                    node = node.next;
                }
            }
            //如果有搜尋到value，nodeTarget會有值，此時把nodeTarget的前一個節點指向nodeTarget的下一個節點
            if(nodeTarget!=null){
                if(nodeTarget == start){//如果搜尋到的為第一個節點
                    start = start.next; //把第一個節點的下一個給start
                }else{
                    nodePre.next = nodeTarget.next;
                }
                System.out.println("成功刪除值為"+nodeTarget.val+"的節點！！！");
            }else{
                System.out.println("沒有搜尋到節點有"+value+"的值");
            }
        }else{
            System.out.println("一個節點都沒有，無法搜尋!!!");
        }
    }
}
