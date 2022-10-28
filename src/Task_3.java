public class Task_3 {
    public static void main (String args[]){    //вводим значения параметров-массивов
        isAvgWhole(new int[]{1, 3});//t
        isAvgWhole(new int[]{1, 2, 3, 4});//f
        isAvgWhole(new int[]{1, 5, 6});//t
        isAvgWhole(new int[]{1, 1, 1});//t
        isAvgWhole(new int[]{9, 2, 2, 5});//f
    }

    static void isAvgWhole(int[] a){
        double sum = 0;
        for (int i = 0; i < a.length; i++)
            sum+=a[i];   //суммируем элементы массива
        System.out.println((sum/a.length)%1==0);  //делим sum на кол-во элементов массива и сравниваем с нулем остаток от деления на 1
    }
}