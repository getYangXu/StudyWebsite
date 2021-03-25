package algorithm;

/**
 * @author XinRui
 */
public class quick {

    public static void main(String[] args) {

        int[] a = {8,6,19,18,45,1,2,3,0,18,34};
        quickSort(a,0,a.length-1);

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }


    }

    /**
     * 快速排序算法
     */
     static void quickSort(int[] arr,int left,int right){

        int f,t;
        int rightTemp,leftTemp;

        leftTemp = left;
        rightTemp = right;
        //分界值
        f=arr[(left+right)/2];

        while(leftTemp < rightTemp) {
            while (arr[leftTemp] < f) {
                ++leftTemp;
            }
            while (arr[rightTemp] > f) {
                --rightTemp;
            }
            if (leftTemp <= rightTemp) {
                t = arr[leftTemp];
                arr[leftTemp] = arr[rightTemp];
                arr[rightTemp] = t;
                --rightTemp;
                ++leftTemp;
            }
        }

        if(leftTemp==rightTemp)
        {
            leftTemp++;
        }

        if(left < rightTemp)
        {
            quickSort(arr, left, leftTemp-1);
        }
        if(leftTemp < right)
        {
            quickSort(arr,rightTemp+1,right);
        }

    }

}
