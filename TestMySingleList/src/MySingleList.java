/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-06-23
 * Time: 14:50
 */
public class MySingleList {
    public static class ListNode{
        public int val;
        public ListNode next;

        public ListNode(int val){
            this.val=val;
        }
    }

    public ListNode head;

    /**
     * 先创建一个示例链表（仅为举例）
     */
    public void creatList(){
        ListNode listNode1=new ListNode(12);
        ListNode listNode2=new ListNode(12);
        ListNode listNode3=new ListNode(34);
        ListNode listNode4=new ListNode(12);
        this.head=listNode1;
        listNode1.next=listNode2;
        listNode2.next=listNode3;
        listNode3.next=listNode4;
    }

    /**
     * 打印链表
     */
    public void display(){
        ListNode cur=this.head;
        while(cur!=null){
            System.out.print(cur.val+" ");
            cur=cur.next;
        }
    }

    /**
     * 从指定节点处开始打印
     * @param newHead
     */
    public void display(ListNode newHead){
        ListNode cur=newHead;
        while(cur!=null){
            System.out.print(cur.val+" ");
            cur=cur.next;
        }
    }

    /**
     * 头插法
     * @param data
     */
    public void addFirst(int data){
        ListNode node=new ListNode(data);
        node.next=this.head;
        this.head=node;
    }

    /**
     * 尾插法
     * @param data
     */
    public void addLast(int data){
        ListNode node=new ListNode(data);
        if(this.head==null){
            this.head=node;
        }else{
            ListNode cur=this.head;
            while(cur.next!=null){
                cur=cur.next;
            }
            cur.next=node;
        }
    }

    /**
     * 判断查询是否越界
     * @param index
     */
    private boolean checkIndexAdd(int index){
        return index<0||index>size();
    }

    /**
     * 查找指定下标的前一个
     * @param index
     * @return
     */
    private ListNode findIndexSubOne(int index){
        ListNode cur=this.head;
        while(index-1>0){
            cur=cur.next;
            index--;
        }
        return cur;
    }

    /**
     * 在指定位置处插入节点
     * @param index
     * @param data
     */
    public void addIndex(int index,int data){
        if(checkIndexAdd(index)){
            System.out.println("报错：越界访问");
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
        ListNode node=new ListNode(data);
        ListNode cur=findIndexSubOne(index);
        node.next=cur.next;
        cur.next=node;
    }

    /**
     * 查找链表中是否包含key值的节点
     * @param key
     * @return
     */
    public boolean contains(int key){
        if(this.head==null){
            return false;
        }
        ListNode cur=this.head;
        while(cur!=null){
            if(cur.val==key){
                return true;
            }
            cur=cur.next;
        }
        return false;
    }

    /**
     * 删除链表中的第一个包含key值的节点
     * @param key
     */
    public void remove(int key){
        if(this.head==null){
            System.out.println("链表为空");
            return;
        }
        if(this.head.val==key){
            this.head=this.head.next;
            return;
        }
        ListNode cur=this.head;
        while(cur.next!=null){
            if(cur.next.val==key){
                cur.next=cur.next.next;
                System.out.println("删除节点成功");
                return;
            }
            cur=cur.next;
        }
        System.out.println("链表中无此值");
    }

    /**
     * 删除链表中所有包含key值的节点
     * @param key
     */
    public void removeAllKey(int key){
        if(this.head==null){
            System.out.println("链表为空");
        }
        ListNode prev=this.head;
        ListNode cur=this.head.next;
        while(cur!=null){
            if(cur.val==key){
                prev.next=cur.next;
            }else{
                prev=cur;
            }
            cur=cur.next;
        }
        if(this.head.val==key){
            this.head=this.head.next;
        }
    }

    /**
     * 获取链表的长度
     * @return
     */
    public int size(){
        int count=0;
        ListNode cur=this.head;
        while(cur!=null){
            count++;
            cur=cur.next;
        }
        return count;
    }

    /**
     * 清除链表中的所有节点
     */
    public void clear(){
        //方法一：直接将头结点置为空，但是这样做时属于比较暴力的做法
        //this.head=null;

        //方法二：将链表中头结点后面的节点一个一个置为空，最后再将头结点置为空
        ListNode cur=head;
        while(cur!=null){
            ListNode curNext=cur.next;
            cur.next=null;
            cur=curNext;
        }
        head=null;
    }


}
