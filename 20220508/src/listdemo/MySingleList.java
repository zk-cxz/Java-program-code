package listdemo;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-05-08
 * Time: 16:35
 */
public class MySingleList {
    public static class ListNode{
        public int val;
        public ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode head;

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

    public void display(){
        ListNode cur=this.head;
        while(cur!=null){
            System.out.print(cur.val+" ");
            cur=cur.next;
        }
    }

    /**
     * 从制定节点开始打印
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
        node.next=head;
        head=node;
    }

    /**
     * 尾插法
     * @param data
     */
    public void addLast(int data){
        ListNode node=new ListNode(data);
        if(head==null){
            head=node;
        }else{
            ListNode cur=head;
            while(cur.next!=null){
                cur=cur.next;
            }
            cur.next=node;
        }
    }

    /**
     * 任意位置插入节点
     * @param index
     * @param data
     */
    public void addIndex(int index,int data){
        checkIndexAdd(index);
        if(index==0){
            addFirst(data);
            return;
        }
        if(index==size()){
            addLast(data);
            return;
        }
        ListNode node=new ListNode(data);
        ListNode cur = findIndexSubOne(index);
        node.next=cur.next;
        cur.next=node;
    }

    /**
     * 查找指定下标的前一个
     * @param index
     * @return
     */
    public ListNode findIndexSubOne(int index){
        ListNode cur=head;
        while(index-1>0){
            cur=cur.next;
            index--;
        }
        return cur;
    }

    /**
     * 判断查询是否越界
     * @param index
     */
    public void checkIndexAdd(int index){
        if(index<0||index>size()){
            System.out.println("越界访问");
            return;
        }
    }

    /**
     * 查找链表中是否包含key值的节点
     * @param key
     * @return
     */
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

    /**
     * 删除链表中的第一个包含key值的节点
     * @param key
     */
    public void remove(int key){
        if(head==null){
            System.out.println("此链表为空");
            return;
        }
        if(head.val==key){
            head=head.next;
            return;
        }
        ListNode cur=head;
        while(cur.next!=null){
            if(cur.next.val==key){
                cur.next=cur.next.next;
                return;
            }
            cur=cur.next;
        }
    }

    /**
     * 删除链表中所有包含key值的节点
     * @param key
     */
    public void removeAllKey(int key){
        if(head==null){
            System.out.println("此链表为空");
            return;
        }
        ListNode cur=head.next;
        ListNode prev=head;
        while(cur!=null){
            if(cur.val==key){
                prev.next=cur.next;
            }else{
                prev=cur;
            }
            cur=cur.next;
        }
        if(head.val==key){
            head=head.next;
        }
    }

    /**
     * 得到链表的长度
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
     * 清理链表中的所有节点
     */
    public void clear(){
        //this.head=null;   //这种方法会比较暴力
        ListNode cur=head;
        while(cur!=null){
            ListNode curNext=cur.next;
            cur.next=null;
            cur=curNext;
        }
        head=null;
    }

    /**
     * 反转链表
     * @return
     */
    public ListNode reverseList(){
        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }
        ListNode cur=head.next;
        head.next=null;
        while(cur!=null){
            ListNode curNext=cur.next;
            cur.next=head;
            head=cur;
            cur=curNext;
        }
        return head;
    }

    /**
     * 查找链表之间节点
     * @return
     */
    public ListNode middleNode(){
        if(head==null){
            return null;
        }
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }

    /**
     *查找倒数第k个节点
     * @param k
     * @return
     */
    public ListNode findKthToTail(int k){
        if(k<=0){
            return null;
        }
        if(head==null){
            return null;
        }
        ListNode fast=head;
        ListNode slow=head;
        while(k-1>0){
            fast=fast.next;
            k--;
        }
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }

    /**
     * 判断链表是否是回文数
     * @return
     */
    public boolean chkPalindrome(){
        if(head==null){
            return false;
        }
        if(head.next==null){
            return true;
        }
        //1.找中间节点
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        //2.反转
        ListNode cur=slow.next;
        while(cur!=null){
            ListNode curNext=cur.next;
            cur.next=slow;
            slow=cur;
            cur=curNext;
        }
        //3.前后向中间找
        while(head!=slow){
            if(head.val!=slow.val){
                return false;
            }
            if(head.next==slow){
                return true;
            }
            head=head.next;
            slow=slow.next;
        }
        return true;
    }

    /**
     * 根据x值大小来分隔成两部分链表
     * @param x
     * @return
     */
    /*public ListNode partition(int x){

    }*/
}
