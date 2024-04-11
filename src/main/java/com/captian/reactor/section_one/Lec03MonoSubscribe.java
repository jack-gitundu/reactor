package com.captian.reactor.section_one;

import reactor.core.publisher.Mono;

import java.util.Arrays;

public class Lec03MonoSubscribe {

    public static void main(String[] args) {

        // publisher
//        Mono<String> mono = Mono.just("ball");
        Mono<Integer> mono = Mono.just("ball")
                .map(String::length)
                .map(l -> l / 0);

        mono.subscribe(
                item -> System.out.println(item),
                err -> System.out.println(err.getMessage()),
                () -> System.out.println("Completed")
        );
    }
}
