package ru.mirea.it.java.work23.task1;

public class ArrayQueueADTTest {
    public static void main(String[] args) {
        ArrayQueueADT queue = new ArrayQueueADT();
        ArrayQueueADT.enqueue(queue,0xff);
        ArrayQueueADT.enqueue(queue,0b1011);
        ArrayQueueADT.enqueue(queue,0xDEADBEEF);
        System.out.println(ArrayQueueADT.element(queue));
        System.out.println(ArrayQueueADT.dequeue(queue));
        System.out.println(ArrayQueueADT.size(queue));
        System.out.println(ArrayQueueADT.element(queue));
        ArrayQueueADT.clear(queue);
        System.out.println(ArrayQueueADT.isEmpty(queue));
    }
}
