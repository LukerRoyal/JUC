package com.mashibing;

import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;

public class Tets {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        final String a = "abc";
        final String b = "def";
        Field value = String.class.getDeclaredField("value");
        value.setAccessible(true);
        value.set(a, new char[]{'a', 'b', 'c'});
        System.out.println(a);
        System.out.println(a+b);

    }
}
