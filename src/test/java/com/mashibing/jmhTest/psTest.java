package com.mashibing.jmhTest;

import org.openjdk.jmh.annotations.*;

public class psTest {
    @Benchmark
    @Warmup(iterations = 1, time = 3)
    @Fork(2)
    @BenchmarkMode(Mode.Throughput)
    @Measurement(iterations = 1, time = 3)
    public void test(){
        PS.foreach();
    }
}
