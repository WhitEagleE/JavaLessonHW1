package lesson1.HomeWork;

public class HomeWorkLesson1 {
    public static void main(String[] args) {
        ex2();
        ex3(10,5,12,4);
        ex4(12,5); ex4(15, 17);
        ex5(5); ex5(-1); ex5(0);
        ex6(5); ex6(-1); ex6(0);
        ex7("Дима"); ex7("Никита");
        ex8(1184); ex8(100); ex8(16000); ex8(400);
    }


    public static void ex2() {
        byte b = 15;
        float f = 5.0f;
        double d = 3.0;
        int i = 19384;
        boolean bool = true;
        char a = 5943;
        short s = 32767;
        long l = 435632334;

        System.out.println(b + "; " + f + "; " + d + "; " + i + "; " + bool + "; " + a + "; " + s + "; " + l);

    }


    public static float ex3(float a, float b, float c, float d) {
        System.out.println(a * (b + (c / d)));
        return (float)(a * (b + (c / d)));
    }

    public static boolean ex4(int a, int b) {
        if( a + b >= 10 & a + b <= 20){
            System.out.println(true);
            return true;
        }
        else{
            System.out.println(false);
            return false;
        }
    }

    public static void ex5(int a) {
        if(a >= 0){
            System.out.println("Число " + a + " положительное");
        } else {
            System.out.println("Число " + a + " отрицательное");
        }
    }

    public static boolean ex6(int a) {
        if(a >= 0){
            System.out.println(true);
            return true;
        } else {
            System.out.println(false);
            return false;
        }
    }
    public static void ex7(String name) {
            System.out.println("Привет, " + name);
        }

    public static void ex8(int a) {
        if((a % 4 == 0) && !(a % 100 == 0) || (a % 400 == 0)){
            System.out.println("Год " + a + " явлется Високосным");
        } else{
            System.out.println("Год " + a + " не явлется Високосным");
        }

    }

}
