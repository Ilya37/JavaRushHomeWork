package com.javarush.test.level03.lesson06.task02;

/* Таблица умножения
Выведи на экран таблицу умножения 10 на 10 в следующем виде:
1 2 3 …
2 4 6 …
3 6 9 …
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        //Напишите тут ваш код
        int nGor[] = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < 10; i++)
        {
            System.out.print(Integer.toString(nGor[i]) + " ");
        }
        System.out.println();
        for(int w = 1; w <= 10; w++)
        {
            for (int q = 0; q < 10; q++)
            {
                System.out.print(nGor[q] * nGor[w] + " ");
            }
            System.out.println();
        }
    }
}