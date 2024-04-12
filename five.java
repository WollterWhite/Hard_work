package lesson_two;

public class five {

    public static void main(String[] args) {
        System.out.println(sain(1200));

    }

    public static boolean sain(int a) {

        return ((a % 4 == 0) && (a % 100 != 0) || (a % 400 == 0));


    }


}

