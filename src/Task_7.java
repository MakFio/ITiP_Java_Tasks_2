public class Task_7 {
    public static void main(String[] args) {
        System.out.println(isValid("59001"));// true
        System.out.println(isValid("853a7"));// false
        System.out.println(isValid("732 32"));// false
        System.out.println(isValid("393939"));// false
    }

    static boolean isValid(String s) {
        for (int i = 0; i < s.length(); i++) {
            char g = s.charAt(i);   //поочередно приравниваем каждый символ строки s пременной g типа char
            if (Character.isLetter(g))  //проверяем, является ли g буквой, если да, то возвращаем false
                return false;
        }
        if (s.length()!=5)   //если кол-во букв не равно 5, то тоже возвращаем false
            return false;
        return true;  //если оба предыдущих условия не выполнились, то возвращаем true
    }
}