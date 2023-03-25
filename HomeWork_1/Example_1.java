package HomeWork_1;

/*
 * Вычислить n-ое треугольного число (сумма чисел от 1 до n)
 */

public class Example_1 {

    public static void main(String[] args) {
        System.out.println(tNumber(1));
        System.out.println(tNumber(2));
        System.out.println(tNumber(3));
        System.out.println(tNumber(4));
    }
    static int tNumber(int x){
        if (x < 0) {
            System.out.print("Error!");
            return -1;            
        }
        int result = 0;
        for (int i = 1; i <= x; i++) {
            result += i;
        }
        return result;
    }
}