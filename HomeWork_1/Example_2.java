package HomeWork_1;
/*
 * Вычислить n! (произведение чисел от 1 до n)
 */
public class Example_2 {
    public static void main(String[] args) {
        System.out.println(fact(0));
        System.out.println(fact(1));
        System.out.println(fact(3));
        System.out.println(fact(-5));
        
    }
 
    static int fact(int x){
        if (x < 0) {
            System.out.print("Error!");
            return -1;            
        }
        int result = 1;
        for (int i = 1; i <= x; i++) {
            result *= i;
        }
        return result;
    }
}
