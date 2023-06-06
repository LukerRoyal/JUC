package com.mashibing.jmhTest;

import java.util.ArrayList;
import java.util.Random;

public class PS {
    static ArrayList<Integer> nums = new ArrayList<>();
    static {
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            nums.add(1000000 + random.nextInt(100));
        }
    }

    static void foreach(){nums.forEach(v -> isPrime(v));}
    static void parallel(){nums.parallelStream().forEach(PS::isPrime);}


    static boolean isPrime(int num){
        for (int i = 2; i < num/2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
