import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-06-11
 * Time: 10:51
 */
public class TestHeap {
    public int[] elem;
    public int usedSize;

    public TestHeap(){
        this.elem=new int[10];
    }

    /**
     * 建堆
     */
    public void creatHeap(int[] array){
        //以下这一步只是为了将数据准备到堆当中（不是真正意义上的堆）
        for (int i = 0; i < array.length; i++) {
            this.elem[i]=array[i];
            this.usedSize++;
        }

        //建成一个真正的堆（优先级队列）
        for (int i = (this.usedSize-1-1)/2; i >=0 ; i--) {
            shiftDown(i,this.usedSize);
        }
    }

    /**
     * 这里是对堆进行向下调整，时间复杂度为：O(logn)
     * @param root 每棵指数的根节点下标
     * @param len 每棵子树调整结束的结束条件
     */
    private void shiftDown(int root,int len){
        int parent=root;
        int chird=2*parent+1;
        //如果能够进入这个循环，说明这棵子树至少有一个孩子
        while(chird<len){
            //如果有孩子，那么找出左右孩子中大的那一个，并将其存在下标为chird处
            if(chird+1<len && this.elem[chird]<this.elem[chird+1]){
                chird=chird+1;
            }
            //到这里，下标chird中的值中存的已经是左右孩子中大的值，接下来就是让下标为chird的值与下标为parent的值
            if(this.elem[chird]>this.elem[parent]){
                //交换两值
                swap(this.elem,chird,parent);
                parent=chird;
                chird=2*parent+1;
            }else{
                break;
            }
        }
    }

    /**
     * 对两值进行交换
     * @param array
     * @param i
     * @param j
     */
    private void swap(int[] array,int i,int j){
        int tmp=array[i];
        array[i]=array[j];
        array[j]=tmp;
    }

    /**
     * 判断数组是否为满
     */
    private boolean isFull(){
        return this.usedSize==this.elem.length;
    }

    /**
     * 入队，但是还是要保持大根堆
     * @param val
     */
    public void push(int val){
        if(isFull()){
            this.elem= Arrays.copyOf(this.elem,2*this.elem.length);
        }
        //将插入数据放在最后
        this.elem[this.usedSize]=val;
        //将堆进行向上调整
        shiftUp(this.usedSize);
        //有效数据+1
        this.usedSize++;
    }

    /**
     * 将堆进行向上调整
     * @param chird
     */
    private void shiftUp(int chird){
        int parent=(chird-1)/2;
        while(chird>0){
            if(this.elem[chird]>this.elem[parent]){
                swap(this.elem,chird,parent);
                chird=parent;
                parent=(chird-1)/2;
            }else{
                break;
            }
        }
    }

    /**
     * 判断数组是否为空
     */
    private boolean isEmpty(){
        return this.usedSize==0;
    }

    /**
     * 出队：每次删除的都是优先级最高的元素，但是任要保持为大根堆
     */
    public void poll(){
        if(isEmpty()){
            System.out.println("优先级队列为空！");
            return;
        }
        this.usedSize--;
        this.elem[0]=this.elem[this.usedSize];
        shiftDown(0,this.usedSize);
    }
}
