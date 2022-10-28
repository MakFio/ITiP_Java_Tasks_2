import java.util.*;

public class Task_4 {
    public static void main (String args[]){    //вводим значения параметров-массивов
        cumulativeSum(new int[]{1, 2, 3});//[1, 3, 6]
        cumulativeSum(new int[]{1, -2, 3});//[1, -1, 2]
        cumulativeSum(new int[]{3, 3, -2, 408, 3, 3});//[3, 6, 4, 412, 415, 418]
    }

    static void cumulativeSum(int[] a){
        int sum = a[0];
        for (int i = 1; i < a.length; i++) {
            int sum_copy = sum;   //приравниваем sum другой переменной, как бы дублируя его
            sum += a[i];  //прибавляем к sum элемент массива
            a[i]+=sum_copy; //прибавляем к элементу массива sum 
        }
        System.out.println(Arrays.toString(a));
    }
}