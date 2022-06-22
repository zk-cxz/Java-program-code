import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-06-21
 * Time: 16:56
 */
public class MyArraylist {
    public int[] elem;
    public int usedSize;
    private static final int DEFAULT_size=2;

    public MyArraylist(){
        this.elem=new int[DEFAULT_size];
    }

    /**
     * 打印顺序表
     */
    public void display(){
        for (int i = 0; i < this.elem.length; i++) {
            System.out.print(this.elem[i]+" ");
        }
        System.out.println();
    }

    /**
     * 判断该顺序表是否为满
     * @return
     */
    private boolean isFull(){
        return this.usedSize==this.elem.length;
    }

    /**
     * 在顺序表中的最后位置添加数据
     * @param data
     */
    public void add(int data){
        if(isFull()){
            this.elem= Arrays.copyOf(this.elem,2*this.elem.length);
        }
        this.elem[this.usedSize]=data;
        this.usedSize++;
    }

    /**
     * 判断输入下标的有效性
     * @param pos
     * @return
     */
    private boolean checkPosInAdd(int pos){
        if(pos<0||pos>this.usedSize){
            return false;
        }
        return true;
    }

    /**
     * 在顺序表指定位置处添加数据
     * @param pos
     * @param data
     */
    public void add(int pos, int data){
        if(!checkPosInAdd(pos)){
            throw new MyArrayListIndexOutException("输入下标不合法");
        }
        if(isFull()){
            this.elem= Arrays.copyOf(this.elem,2*this.elem.length);
        }
        for (int i = this.usedSize-1; i >= pos; i--) {
            this.elem[i+1]=this.elem[i];
        }
        this.elem[pos]=data;
        this.usedSize++;
    }

    /**
     * 查找顺序表中的某个元素返回其下标
     * @param toFind
     * @return
     */
    public int indexOf(int toFind){
        for (int i = 0; i < this.usedSize; i++) {
            if(this.elem[i]==toFind){
                return i;
            }
        }
        return -1;
    }

    /**
     * 判断顺序表时候为空
     * @return
     */
    private boolean isEmpty(){
        return this.usedSize==0;
    }

    /**
     * 获取pos位置上的元素
     * @param pos
     * @return
     */
    public int get(int pos){
        if(!checkPosInAdd(pos)){
            throw new MyArrayListIndexOutException("输入下标不合法");
        }
        if(isEmpty()){
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
        if(!checkPosInAdd(pos)){
            throw new MyArrayListIndexOutException("输入下标不合法");
        }
        if(isEmpty()){
            throw new MyArrayListEmptyException("顺序表为空");
        }
        this.elem[pos]=value;
    }

    /**
     * 删除顺序表中的某个数据
     * @param key
     */
    public void remove(int key){
        if(isEmpty()){
            throw new MyArrayListEmptyException("顺序表为空");
        }
        int index=indexOf(key);
        if(index==-1){
            System.out.println("顺序表中不存在这个数据");
            return;
        }
        for (int i = index; i < this.usedSize-1; i++) {
            this.elem[i]=this.elem[i+1];
        }
        this.usedSize--;
    }

    /**
     * 显示顺序表的长度
     * @return
     */
    public int size(){
        return this.usedSize;
    }

    /**
     * 清空顺序表
     */
    public void clear(){
        this.usedSize=0;
    }
}
