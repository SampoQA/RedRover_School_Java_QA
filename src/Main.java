//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    int a;
    a = 501;
    int b = 10;

    System.out.println(a + b); // сложение
    System.out.println(b - a); // вычитание
    System.out.println(a * b); // умножение
    System.out.println(a % b); // остаток от деления
    System.out.println(a / b); // деление без остатка
}
/* Проверка на чётность */

void main(String[] args) {
    int number; // создали коробочку под целочисленное значение
    number = 10; // положили в коробочку число
    if (number % 2 == 0) {
        System.out.println(number + " - чётное");
    } else {
        System.out.println(number + " - нечётное");
    }
}

