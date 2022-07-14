package com.zingscoop.favorComposition;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CounterHashSetAppTest {
    public static void main(String[] args) {
        /* CounterHashSet<String> chs = new CounterHashSet<>();
        chs.addAll(Arrays.asList("Zing", "Scoop"));
        System.out.println("Display Size: " + chs.size());
        System.out.println("Display Counter: " + chs.getCounter());*/


        System.out.println(" Making Use of the ForwardingSet class");

        Set<String> hs = new HashSet<>(Arrays.asList("Zing", "Scoop"));
        CounterHashSet<String> chs = new CounterHashSet<>(hs);
        System.out.println("Display Size: " + chs.size());
        System.out.println("Display Counter: " + chs.getCounter());

        hs.clear();
        chs.addAll(Arrays.asList("Zing", "Scoop"));
        System.out.println("Display Size: " + chs.size());
        System.out.println("Display Counter: " + chs.getCounter());

        

    }
}
