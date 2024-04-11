package com.captian.reactor.section_one;

import com.captian.reactor.util.Util;
import reactor.core.publisher.Mono;

import java.util.Arrays;

public class Lec03MonoSubscribe {

    public static void main(String[] args) {

        // publisher
//        Mono<String> mono = Mono.just("ball");
        Mono<Integer> mono = Mono.just("ball")
                .map(String::length)
                .map(l -> l / 1);

        mono.subscribe(
                Util.onNext(),
                Util.onError(),
                Util.onComplete()
        );
    }
}
