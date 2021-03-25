package algorithm;

public class Select {


    public static void main(String[] args) {

        int[] a = {8,6,19,18,45,1,2,3,0,18,34};

        selectSort(a);
    }


    /**
     * 选择排序算法
     */
    public static void selectSort(int[] a){

        int index;
        int temp;

        for (int i = 0; i < a.length - 1 ; i++) {

            index = i;

            for(int j = i+1; j < a.length; j++){

                if(a[j] < a[index]){
                    index = j;
                }
            }
            //交换两个数
            if(index != i){
                temp = a[i];
                a[i] = a[index];
                a[index] = temp;
            }

            System.out.print("第" +i+ "步排序结果");
            for (int h = 0; h < a.length; h++) {

                System.out.print(" "+a[h]);

            }
            System.out.print("\n");

        }





    }
}
