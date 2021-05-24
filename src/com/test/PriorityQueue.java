package com.test;

import java.util.Random;

public class PriorityQueue {
    public static void main(String[] args) {
        java.util.PriorityQueue<Integer> q = new java.util.PriorityQueue<>();
        for (int i = 0; i <= 10; i++) {
            q.offer(i+new Random().nextInt(20)); //добавление в очереди рандомных цифр
        }
        System.out.println(q); // полный список без сортировки
        while (!q.isEmpty()) //если не пустой
            System.out.println(q.poll()); //выводить по одному, с удалением этого элемента из очереди

    }
}
/*

        OUTPUT:
        [3, 8, 10, 8, 8, 15, 25, 22, 14, 10, 20]
        3
        8
        8
        8
        10
        10
        14
        15
        20
        22
        25


*/


/*

offer() - вставляет элемент в конец очереди, или возвращает false
peek() - возвращает первый элемент в очереди без извлечения, если очередь пустая, то возвращает null
element() - возвращает первый элемент в очереди без извлечения, если очередь пустая, то выдает NoSuchElementException
poll() - извлекает и возвращает первый элемент в очереди, если очередь пустая, то возвращает null
remove - извлекает и возвращает первый элемент в очереди, если очередь пустая, NoSuchElementException
    */
