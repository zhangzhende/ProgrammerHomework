package findIn2DArray;


/**
 * ###二维数组中查找
 * 在一个二维数组中，每行数字从左到右递增，每列从上到下递增，完成一个函数，输入一个数组和
 * 和一个数判断这个数是否在这个数组里
 *
 * 1   3    5
 * 2   4    6
 * 3   6    9
 * @Description
 * @ClassName FindNumIn2DArray
 * @Author zzd
 * @Create 2019/7/15 10:34
 * @Version 1.0
 **/
public class FindNumIn2DArray {

    public static void main(String[] args) {
        int[][] arr = getArray();
        boolean flag = findIn2DArray(arr, 35);
        System.out.print(flag);
    }

    /**
     * 从右上开始查找，数组内数据小了就往下，数据大了就往左，知道左下
     *
     * @param arr
     * @param k
     * @return
     */
    public static boolean findIn2DArray(int[][] arr, int k) {
        boolean flag = false;
        int sumhang = arr.length;
        int sumlie = arr[0].length;
        int hang = 0;
        int lie = sumlie - 1;
//
//当游标到左下还没找到的时候就表示数据中没有这个数据
        while (hang <= sumhang - 1 && lie >= 0 && !flag) {
            if (arr[hang][lie] < k) {
                hang++;
            } else if (arr[hang][lie] > k) {
                lie--;

            } else {
                System.out.println("index start from 0,hang:{" + hang + "},lie:{" + lie + "}");
                flag = true;
            }
        }
        return flag;

    }

    private static int[][] getArray() {
        int[][] arr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {12, 13, 14, 15, 17}, {35, 36, 38, 39, 43}};
        return arr;
    }
}
