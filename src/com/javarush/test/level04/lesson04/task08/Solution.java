package com.javarush.test.level04.lesson04.task08;

/* Треугольник
Ввести с клавиатуры три числа а, b, c – стороны предполагаемого треугольника.
Определить возможность существования треугольника по сторонам. Результат вывести на экран в следующем виде:
"Треугольник существует." - если треугольник с такими сторонами существует.
"Треугольник не существует." - если треугольник с такими сторонами не существует.
Подсказка: Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей.
Требуется сравнить каждую сторону с суммой двух других.
Если хотя бы в одном случае сторона окажется больше суммы двух других, то треугольника с такими сторонами не существует.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sa1 = reader.readLine();
        int na1 = Integer.parseInt(sa1);
        String sa2 = reader.readLine();
        int na2 = Integer.parseInt(sa2);
        String sa3 = reader.readLine();
        int na3 = Integer.parseInt(sa3);

        if ((na1 + na2) > na3 && (na1 + na3) > na2 && (na2 + na3) > na1)
        System.out.println("Треугольник существует.");
        else
        System.out.println("Треугольник не существует." );
    }
}