package demo02;

public class Pratcice01 {
    public static void main(String[] args) {
        int[] arr = new int[]{13, 26, -3, 4, 54, 26, 37, 18, 69, -10};
        print(arr);
//        sortArr(arr, false);
//        sortArr(arr);
    }
    public static void print(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[" + i + "]=" + arr[i] + " ");
            count++;
            if (count == 5) {
                System.out.println();
            }
        }
    }

    public static void sortArr(int[] arr, boolean isAsc) {
        if (isAsc == true) {
            for (int i = 0; i < arr.length; i++) {
                // 第一轮循环表示循环的轮数
                for (int j = 0; j < arr.length - 1; j++) {
                    //第二轮循环表示每次的比较次数
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
            }
        } else {
            for (int i = 0; i < arr.length; i++) {
                // 第一轮循环表示循环的轮数
                for (int j = 0; j < arr.length - 1; j++) {
                    //第二轮循环表示每次的比较次数
                    if (arr[j] < arr[j + 1]) {
                        int temp = arr[j + 1];
                        arr[j + 1] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
            }
        }
        System.out.println(" ");
    }

    //重载sortArr方法，将数组进行升序排列(冒泡排序)
//    public static void sortArr(int[] arr){
//        for(int i = 0;i < arr.length; i++){
//            for(int j = 0;j < arr.length - 1; j++){
//                if(arr[j] > arr[j + 1]){
//                    int temp = arr[j + 1];
//                    arr[j + 1] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        for(int i = 0;i < arr.length; i++){
//            System.out.print(arr[i]);
//        }
//
//    }
    //重载sortArr方法，将数组进行升序排列(选择排序)
    public static void sortArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int maxIndex = i;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[maxIndex] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[maxIndex];
                    arr[maxIndex] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
