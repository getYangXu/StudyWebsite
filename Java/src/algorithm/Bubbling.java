package algorithm;

/**
 * @author yxgu
 */
public class Bubbling {


    public static void main(String[] args) {

        int[] a = {8,6,19,18,45,1,2,3,0,18,34};

        bubbleSort(a);
    }


    /**
     * 冒泡排序方法
     */
    static void bubbleSort(int[] a){

        int temp;

        for (int i = 1; i < a.length ; i++) {
            for (int j = 0; j < a.length - i ; j++) {

                if (a[j] > a[j+1]){
                    //交换相邻两个数
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
            System.out.print("第"+ i + "步排序结果");

            for (int k = 0; k < a.length; k++) {

                System.out.print(" " + a[k]);
            }

            System.out.print("\n");
        }
    }
}
