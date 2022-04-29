package sqlist;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-04-29
 * Time: 17:44
 */
public class MyArraylist {
    public int[] elem;
    public int size;
    private static final int DEFAULT_SIZE=2;

    public MyArraylist() {
        this.elem = new int[DEFAULT_SIZE];
    }

    /**
     * 打印顺序表
     */
    public void display(){
        for (int i = 0; i < this.size; i++) {
            System.out.print(elem[i]+" ");
        }
        System.out.println();
    }

    /**
     * 判断顺序表最后数据是否已经满了
     */
    public boolean isFull(){
        return this.size==this.elem.length;
    }

    /**
     * 在顺序表中的最后位置添加数据
     * @param data
     */
    public void add(int data){
        //判断顺序表是否满了
        if(isFull()){
            this.elem= Arrays.copyOf(elem,2*elem.length);
        }
        this.elem[this.size]=data;
        this.size++;
    }

    /**
     * 判断add操作中的下标是否是合法的
     */
    private boolean checkPosInAdd(int pos){
        if(pos<0||pos>this.size){
            return false;
        }
        return true;
    }

    /**
     * 在顺序表最后指定位置处添加数据
     * @param pos
     * @param data
     */
    public void add(int pos, int data){
        if(!checkPosInAdd(pos)){
            throw new MyArrayListIndexOutException("输入下标不合法");
        }
        if(isFull()){
            this.elem= Arrays.copyOf(elem,2*elem.length);
        }
        for (int i = this.size-1; i >= pos; i--) {
            this.elem[i+1]=this.elem[i];
        }
        this.elem[pos]=data;
        this.size++;
    }

    /**
     * 查找顺序表最后的某个元素返回其下标
     * @param toFind
     * @return
     */
    public int indexOf(int toFind){
        for (int i = 0; i < this.size; i++) {
            if(this.elem[i]==toFind){
                return i;
            }
        }
        return -1;
    }

    /**
     * 判断get操作中的下标是否合法
     */
    private boolean checkPosIntGet(int pos){
        if(pos<0||pos>=this.size){
            return false;
        }
        return true;
    }

    private boolean isEmpty(){
        return this.size==0;
    }

    /**
     * 获取pos位置上的元素
     * @param pos
     * @return
     */
    public int get(int pos){
        if(!checkPosIntGet(pos)){
            throw new MyArrayListIndexOutException("输入下标不合法");
        }
        if(!isEmpty()){
            throw new MyArrayListEmptyException("顺序表为空");
        }
        return this.elem[pos];
    }

    /**
     * 将pos位置上的元素替换成value值
     * @param pos
     * @param value
     */
    public void set(int pos, int value){
        if(!checkPosIntGet(pos)){
            throw new MyArrayListIndexOutException("输入下标不合法");
        }
        if(!isEmpty()){
            throw new MyArrayListEmptyException("顺序表为空");
        }
        this.elem[pos]=value;
    }

    /**
     * 删除顺序表中的某个数据
     * @param key
     */
    public void remove(int key){
        if(!isEmpty()){
            throw new MyArrayListEmptyException("顺序表为空");
        }
        int index=indexOf(key);
        if(index==-1){
            System.out.println("数序表中不存在这个数据");
            return;
        }
        for (int i = index; i < this.size-1; i++) {
            this.elem[i]=this.elem[i+1];
        }
        this.size--;
    }

    /**
     * 显示顺序表的长度
     * @return
     */
    public int size(){
        return this.size;
    }

    /**
     * 清空顺序表
     */
    public void clear(){
        this.size=0;
    }
}
