public class Main {
    public static void main(String[] args) {
    //Создаем массив с именем line и присваиваем ему переменные типа int
    int[] line = {0, 5, 10, 15, 20, 25, 30};
    //с помощью цикла for перебираем все значения из массива от последнего элемента к первому
    //и выводим их в консоль
    for ( int i = line.length - 1; i >= 0; i--) {
        System.out.print(line[i]);
        //если значение не первое, то после него ставим запятую
            if (i != 0) {
                System.out.print(", ");
            }
        }
    }
}