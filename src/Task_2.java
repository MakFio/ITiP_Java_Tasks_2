import java.util.Arrays;   //импортируем модуль Arrays для сортировки массива

public class Task_2 {
    public static void main (String args[]){    //вводим значения параметров-массивов
        differenceMaxMin(new int[]{10, 4, 1, 4, -10, -50, 32, 21});// 82
        differenceMaxMin(new int[]{44, 32, 86, 19});// 67
    }

    static void differenceMaxMin(int[] a){
        int dif = 0;
        Arrays.sort(a);    //сортируем элементы массива по убыванию
        System.out.println(a[a.length-1]-a[0]);     //из большего элемента вычитаем меньший
    }
}