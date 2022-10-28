public class Task_5 {
    public static void main(String[] args) {
        getDecimalPlaces("43.20");// 2
        getDecimalPlaces("400");// 0
        getDecimalPlaces("3.1");// 1
        getDecimalPlaces("308.123940");// 6
    }

    static void getDecimalPlaces(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            String s1 = String.valueOf(s.charAt(i));   //к s1 приравниваем каждый элемент массива
            if (s1.equals("."))   //сравниваем sq с точкой
                for (int j = 1; j < s.length()-i; i++)   //считаем знаки после точки
                    count+=1;
        }
        System.out.println(count);
    }
}