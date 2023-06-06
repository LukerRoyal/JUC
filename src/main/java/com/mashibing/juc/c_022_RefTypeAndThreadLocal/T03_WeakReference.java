/**
 * 弱引用遭到gc就会回收
 *
 */
package com.mashibing.juc.c_022_RefTypeAndThreadLocal;

import java.lang.ref.WeakReference;

public class T03_WeakReference {

    //只要GC就会被回收，当有强引用的时候,就会不会被回收
    //当强引用消失之后，一旦GC就立马被回收
    //适用场景，容器，ThreadLocal
    public static void main(String[] args) {
        WeakReference<M> m = new WeakReference<>(new M());

        System.out.println(m.get());
        System.gc();
        System.out.println(m.get());


        ThreadLocal<M> tl = new ThreadLocal<>();
        tl.set(new M());
        tl.remove();

    }
}

