package algorithm;

/**
 * @author yxgu
 */
public class Insert {

    public static void main(String[] args) {

        int[] a = {8,6,19,18,45,1,2,3,0,18,34};

        insertSort(a);

    }


    /**
     * 当插入的数值比之前的数字大便跳出while
     */
    public static void insertSort(int[] a){

        int i, j, t, h;

        for (i = 1; i < a.length ; i++) {

            t = a[i];

            j = i-1;
            //当插入的数值比之前的数字大便跳出while
            while(j >= 0 && t < a[j]){
                a[j+1] = a[j];
                j--;
            }
            a[j+1]=t;


            System.out.print("第" +i+ "步排序结果");
            for (h = 0; h < a.length; h++) {

                System.out.print(" "+a[h]);

            }
            System.out.print("\n");


        }

    }
}
