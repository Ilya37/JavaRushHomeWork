package com.javarush.test.level01.lesson08.task03;

/* Решаем задачи
Напиши программу, которая выводит на экран надпись: «Хочешь - решай задачи, не хочешь - решай нехотя» 16 раз.
*/
public class Solution
{
    public static void main(String[] args)
    {
        String s = "Хочешь - решай задачи, не хочешь - решай нехотя";
        print16Times(s);//напишите тут ваш код
    }

    public static void print16Times(String s)
    {
        int i=0;
        while(i < 16)
        {
            System.out.println(s);
            i++;
        }
    }
}
