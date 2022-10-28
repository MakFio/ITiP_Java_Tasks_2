public class Task_6 {
    public static void main(String[] args) {
        Fibonacci(3);// 3
        Fibonacci(7);// 21
        Fibonacci(12);// 233
    }

    static void Fibonacci(int n) {
        int sum = 1;  //для начала сумму приравниваем к 1, а так же вводим еще одну переменную а, она = 0
        int a = 0;
        for (int i = 1; i <= n; i++) {
            int b = sum;   //дублируем переменную sum
            sum+= a;  //складываем sum и a
            a = b;  //приравниваем переменную b (переменная sum до сложения в пред. строке) к а
        }
        System.out.println(sum);
    }
}

