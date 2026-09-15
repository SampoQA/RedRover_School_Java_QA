/*public class lesson_4 {
}
// цикл while
void main () {

    int counter = 0; // если counter больше 10, то он не войдёт в цикл
    //while (true) { - условие правда блок кода будет выполнятся
    while(counter < 10) { // пока 10 раз не напечатает
        System.out.println("Hello World");
        counter = counter + 1; // счётчик переменной
    }
    System.out.println("Done");
}*/
// цикл do while
/*
void main() {

    int counter = 0; // если counter больше 3, то сначала выполнит, а потом уже проверит условие
    do {
        System.out.println("Hello World");
        counter = counter + 1; // счётчик переменной
    } while (counter < 3);// пока 3 раза не напечатает
    System.out.println("Done");
}*/
// пробуем достучаться до сервиса имея ограниченное количество попыток
/*
void main() {

    int remainingAttemps = 10;
    do {
        System.out.println("trying...");
        remainingAttemps = remainingAttemps - 1;
    } while (remainingAttemps > 0);

    System.out.println("Done");
}*/

//Кидаем кубик пока не выпадет конкретное число
//import java.util.Random;
void main() {

    Random rand = new Random();
    int sum;
    do {
        int kubik1 = rand.nextInt(6) + 1;
        int kubik2 = rand.nextInt(6) + 1;
        sum = kubik1 + kubik2;
        System.out.print(kubik1);
        System.out.print(" + ");
        System.out.print(kubik2);
        System.out.print(" = ");
        System.out.println(sum);
    } while (sum != 7);

    System.out.println("Done");
}