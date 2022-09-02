package trofimova.java1.lesson3;

import java.util.Arrays;

public class HomeWorkApp3 {
    public static void main (String[] args){
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
        int[] sameValuesArr = createArray (8, 5);
        System.out.println(Arrays.toString(sameValuesArr));
        findMinAndMaxValues ();
        System.out.println(findArrWithEqualParts(new int[]{2,2,2,3,3}));
    }

    public static void invertArray() {
        int[] arr = {1,1,0,0,1,0,1,1,0,0};
        for(int i = 0; i < arr.length; i++){
            if (arr[i] == 1){
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void fillArray(){
        int[] arr = new int[100];
        for(int i = 0; i < arr.length; i++){
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void changeArray(){
        int[] arr = {1,5,3,2,11,4,5,2,4,8,9,1};
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void fillDiagonal(){
        int[][] arr = new int[4][4];
        int colsNumber = arr[0].length;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < colsNumber; j++){
                if (i == j || (colsNumber - 1 - i == j)){
                    arr[i][j] = 1;
                }
            }
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < colsNumber; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] createArray (int len, int initialValue){
        int[] arr = new int[len];
        for (int i = 0; i < len; i++){
            arr[i] = initialValue;
        }
        return arr;
    }

    public static void findMinAndMaxValues (){
        int[] arr = {5,7,2,12,16,73,36,24};
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++){
                if (arr[i] < min){
                    min = arr[i];
            }

        }
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Минимальный элемент равен " + min + ", максимальный элемент равен " + max);
    }

    public static boolean findArrWithEqualParts(int[] arr){
        int sumRight = 0;
        int sumLeft = 0;
        for (int i = 0; i < arr.length; i++){
            sumRight += arr[i];
        }
        for (int i = 0; i < arr.length; i++){
            if ((sumLeft + arr[i]) != (sumRight - arr[i])){
                sumRight -= arr[i];
                sumLeft += arr[i];
            }
            else {
                return true;
            }
        }
        return false;
    }
}
