package com.tnsif.task11;
import java.util.*;

public class PriorityqueueEx{
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.add(30);
        pq.add(10);
        pq.add(50);
        pq.add(20);
        System.out.println(pq);
        System.out.println(pq.peek());
        pq.poll();
        pq.poll();
        System.out.println(pq);
        System.out.println( pq.peek());
        }
    }

