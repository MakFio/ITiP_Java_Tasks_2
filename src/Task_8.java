public class Task_8 {
    public static void main(String[] args) {
        isStrangePair("ratio", "orator");// true
        isStrangePair("sparkling", "groups");// true
        isStrangePair("bush", "hubris");// false
        isStrangePair("", "");// true
    }

    static void isStrangePair(String a, String b) {
        boolean ans = false;
        if (a.length()==0 && b.length()==0) {     //если обе строки пустые (""), то возвращаем true
            ans = true;
        }   else if (a.length()!=0 && b.length()!=0) {

            char a1 = a.charAt(0);        //приравниваем 1й символ 1й строки переменной a1 типа char
            char b1 = b.charAt(0);         //приравниваем 1й символ 2й строки переменной b1 типа char
            char a2 = a.charAt(a.length() - 1);  //приравниваем последний символ 1й строки переменной a2 типа char
            char b2 = b.charAt(b.length() - 1);  //приравниваем последний символ 2й строки переменной b2 типа char
            if (a1 == b2 && a2 == b1)   //сравниваем их, и если выполняется условие, то возвращаем true
                ans = true;
        }
        System.out.println(ans);
    }
}