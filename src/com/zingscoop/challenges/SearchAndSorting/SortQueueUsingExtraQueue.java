package com.zingscoop.challenges.SearchAndSorting;

import java.util.ArrayDeque;
import java.util.Queue;

public class SortQueueUsingExtraQueue {

    static void sort(Queue<Integer> queue) {

        // Additional Queue
        Queue<Integer> extraQueue = new ArrayDeque<>();

        int sizeTracker = 0;

        int queueSize = queue.size();
        int lastElement = queue.peek();

        boolean isSorted = false;

        while(!isSorted) {

            if(lastElement <= queue.peek()) {
                //Step 1
                lastElement = queue.poll();
                extraQueue.add(lastElement);
            } else {
                // step 2 
                queue.add(queue.poll());
            }
            
            System.out.println("Sorted queue so far: " + extraQueue);

            ++sizeTracker;

            //Keep repeating step 1 and step 2 until all elements are processed
            if(sizeTracker != queueSize) continue;

            // we are done, if we simply have all the elements in the extra queue (already sorted)
            if(queueSize == extraQueue.size()) isSorted = true;

            System.out.println("Enquing all sorted element into original queue");

            //Step 3
            while(extraQueue.size() > 0) {
                queue.add(extraQueue.poll());
                lastElement = queue.peek();
            }

            //Step 4 - Reset and start from step 1
            sizeTracker = 0;
        }

    }
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();

        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(1);
        queue.add(5);
 
        System.out.println("Queue before sorting : " + queue);
        sort(queue);
        System.out.println("Queue after sorting  " + queue);
    }
}
