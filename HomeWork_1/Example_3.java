package HomeWork_1;

/*
 * Вывести все простые числа от 1 до 1000 (числа, которые делятся только на 1 и на себя без остатка)
 */

public class Example_3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            if(isPrimeNumber(i)){
                System.out.println(i);
            }
        }
        
    }

    static boolean isPrimeNumber(int number){
        for (int i = 2; i <= number/2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        if (number == 1) {
            return false;
        }
        return true;
    }
}
