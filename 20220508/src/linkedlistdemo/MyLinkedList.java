package linkedlistdemo;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-05-08
 * Time: 21:44
 */
public class MyLinkedList {
    static class ListNode{
        public int val;
        public ListNode prev;
        public ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode head;
    public ListNode last;

    public void display(){
        ListNode cur=head;
        while(cur!=null){
            System.out.print(cur.val+" ");
            cur=cur.next;
        }
    }

    //头插法
    public void addFirst(int data){
        ListNode node=new ListNode(data);
        if(head==null){
            head=node;
            last=node;
        }else{
            node.next=head;
            head.prev=node;
            head=node;
        }
    }

    //尾插法
    public void addLast(int data){
        ListNode node=new ListNode(data);
        if(head==null){
            head=node;
            last=node;
        }else{
            last.next=node;
            node.prev=last;
            last=node;
        }
    }

    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data){
        if(index<0||index>size()){
            System.out.println("越界访问");
            return;
        }
        if(index==0){
            addFirst(data);
            return;
        }
        if(index==size()){
            addLast(data);
            return;
        }
        ListNode cur=searchIndex(index);
        ListNode node=new ListNode(data);
        cur.prev.next=node;
        node.prev=cur.prev;
        node.next=cur;
        cur.prev=node;
    }

    public ListNode searchIndex(int index){
        ListNode cur=head;
        while(index>0){
            cur=cur.next;
            index--;
        }
        return cur;
    }

    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key){
        if(head==null){
            return false;
        }
        ListNode cur=head;
        while(cur!=null){
            if(cur.val==key){
                return true;
            }
            cur=cur.next;
        }
        return false;
    }

    //删除第一次出现关键字为key的节点
    public void remove(int key){
        if(head==null){
            System.out.println("此链表为空");
            return;
        }
        ListNode cur=head;
        while(cur!=null){
            if(cur.val==key){
                if(cur==head){
                    head=head.next;
                    if(head!=null){
                        head.prev=null;
                    }
                }else{
                    cur.prev.next=cur.next;
                    if(cur.next!=null){
                        cur.next.prev=cur.prev;
                    }else{
                        last=last.prev;
                        last.next=null;
                    }
                }
                return;
            }else{
                cur=cur.next;
            }
        }
    }

    //删除所有值为key的节点  之遍历链表一遍
    public void removeAllKey(int key){
        if(head==null){
            System.out.println("此链表为空");
            return;
        }
        ListNode cur=head.next;
        while(cur!=null){
            if(cur.val==key){
                cur.prev.next=cur.next;
                if(cur.next!=null){
                    cur.next.prev=cur.prev;
                }else{
                    last=last.prev;
                    last.next=null;
                }
            }
            cur=cur.next;
        }
        if(head.val==key){
            head=head.next;
            head.prev=null;
        }
    }

    //得到单链表的长度
    public int size(){
        int count=0;
        ListNode cur=head;
        while(cur!=null){
            count++;
            cur=cur.next;
        }
        return count;
    }

    public void clear(){
        ListNode cur=head;
        while(cur!=null){
            cur.prev=null;
            cur=cur.next;
            cur.prev.next=null;
        }
    }
}
