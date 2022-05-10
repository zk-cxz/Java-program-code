import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-05-10
 * Time: 23:01
 */
public class MyStack<E> {
    public E[] elem;
    public int usedSize;

    public MyStack(){
        this.elem=(E[])new Object[5];
    }

    /**
     * 入栈
     * @param val
     */
    public void push(E val){
        if(isFull()){
            this.elem= Arrays.copyOf(this.elem,2*this.elem.length);
        }
        this.elem[this.usedSize]=val;
        this.usedSize++;
    }

    /**
     * 判断当前栈是否为满
     * @return
     */
    public boolean isFull(){
        return this.usedSize== this.elem.length;
    }

    /**
     * 出栈
     * @return
     */
    public E pop(){
        if(empty()){
            throw new RuntimeException("当前栈为空");
        }
        E ret=this.elem[this.usedSize-1];
        this.elem[this.usedSize-1]=null;
        this.usedSize--;
        return ret;
    }

    /**
     * 判断栈是否为空
     * @return
     */
    public boolean empty(){
        return this.usedSize==0;
    }

    /**
     * 获取栈顶元素，不删除
     * @return
     */
    public E peek(){
        if(empty()){
            throw new RuntimeException("当前栈为空");
        }
        return this.elem[this.usedSize-1];
    }

    /**
     * 获取栈空间大小
     * @return
     */
    public int getUsedSize(){
        return this.usedSize;
    }
}
