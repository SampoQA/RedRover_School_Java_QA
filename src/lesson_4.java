/*public class lesson_4 {
}
// цикл while
void main () {

    int counter = 0;
    //while (true) { - условие правда блок кода будет выполнятся
    while(counter < 10) { // пока 10 раз не напечатает
        System.out.println("Hello World");
        counter = counter + 1; // счётчик переменной
    }
    System.out.println("Done");
}*/
// цикл do while
void main() {

    int counter = 0;
    do {
        System.out.println("Hello World");
        counter = counter + 1; // счётчик переменной
    } while (counter < 3);// пока 3 раза не напечатает
    System.out.println("Done");
}