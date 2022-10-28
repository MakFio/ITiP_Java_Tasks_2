public class Task_10 {
    public static void main(String[] args) {
        boxSeq(0);// 0
        boxSeq(1);// 3
        boxSeq(2);// 2
        boxSeq(6);// 6
    }


    static void boxSeq(int a) {
        if (a % 2 == 0)
            System.out.println(a);
        else
            System.out.println(a+2);
    }

}