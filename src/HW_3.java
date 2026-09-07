public class HW_3 {

    public static void main(String[] args) {
        int a = 5;

        if (a > 10) {
            System.out.println("больше 10");
        } else {
            if (a > 100) {
                System.out.println("больше 100");
            } else {
                if (a / 2 < 20) {
                    System.out.println("результат деления на 2 больше 20");
                }
                if (a < 40 && a > 5) {
                    // Это условие не выполнится, потому что a=5 (a > 5 ложно)
                } else {
                    System.out.println("значение переменной между 5 и 40 включительно");
                }
            }
        }
    }   // ← закрываем метод main
}       // ← закрываем класс HW_3