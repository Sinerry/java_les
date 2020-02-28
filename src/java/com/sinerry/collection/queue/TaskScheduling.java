package com.sinerry.collection.queue;

import java.util.PriorityQueue;
import java.util.Random;

public class TaskScheduling {
    public static void main(String[] args) {
        PriorityQueue<Task> queue = new PriorityQueue<>();
        for (int i = 1; i <= 10; i++) {
            int priority = new Random().nextInt(11);
            queue.add(new Task(priority,String.format("%d",i)));
        }

        while (!queue.isEmpty()) {
            Task task = queue.remove();
            System.out.println(String.format("priority = %d",task.priority));
        }
    }

    static class Task implements Comparable<Task>{
        private int priority;
        private String name;

        public Task(int priority,String name) {
            this.priority = priority;
            this.name = name;
        }
        @Override
        public String toString() {
            return String.format("priority = %d\n",priority);
        }

        @Override
        public int compareTo(Task o) {
            return priority - o.priority;
        }
    }
}

