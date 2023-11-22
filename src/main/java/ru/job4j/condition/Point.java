package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {

        double rsl = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + " = " + result);
    }
}
/*     ЗАДАЧА: вызов метода distance с различными аргументами
         формула расчёта расстояния между точками
         в прямоугольной системе координат:  d = √((х2 – х1)2 + (у2 – у1)2)

шаг 1. Вычесть аргументы x2 и x1.
шаг 2. Вычесть аргументы y2 и y1.
шаг 3. Возвести в степень 2 результат операции 1. double first = Math.pow(x, 2);
шаг 4. Возвести в степень 2 результат операции 2.
шаг 5. Сложить результаты операций 3 и 4.
шаг 6. Вычислить корень квадратный из результата операции 5. ...  = Math.sqrt(a)
 */