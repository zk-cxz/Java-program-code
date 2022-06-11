/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-06-11
 * Time: 14:30
 */
public class Test {
    public static void main(String[] args) {
        TestHeap testHeap=new TestHeap();
        int[] array={27,15,19,18,28,34,65,49,25,37};
        testHeap.creatHeap(array);
        for (int i = 0; i < testHeap.usedSize; i++) {
            System.out.print(testHeap.elem[i]+" ");
        }
        System.out.println();
        testHeap.push(66);
        for (int i = 0; i < testHeap.usedSize; i++) {
            System.out.print(testHeap.elem[i]+" ");
        }
        System.out.println();
        testHeap.poll();
        for (int i = 0; i < testHeap.usedSize; i++) {
            System.out.print(testHeap.elem[i]+" ");
        }
    }
}
