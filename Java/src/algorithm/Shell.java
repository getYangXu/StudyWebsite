package algorithm;

/**
 * @author yxgu
 */
public class Shell {


    public static void main(String[] args) {

        int[] a = {8,6,19,18,45,1,2,3,0,18,34};

        shellSort(a);
    }

    /**
     * 希尔排序算法
     */
    public static void shellSort(int[] a){

        int i ,j ,h;
        int r ,temp;
        int x = 0;

        //划组排序
        for(r = a.length/2;r >= 1;r/=2) {

            for (i = r; i < a.length; i++) {
                temp = a[i];
                j = i - r;
                while (j >= 0 && temp < a[j]) {
                    a[j + r] = a[j];
                    j -= r;
                }
                a[j + r] = temp;
            }
            x++;

            System.out.print("第" +x+ "步排序结果");
            for (h = 0; h < a.length; h++) {

                System.out.print(" "+a[h]);

            }
            System.out.print("\n");

        }

    }

}


