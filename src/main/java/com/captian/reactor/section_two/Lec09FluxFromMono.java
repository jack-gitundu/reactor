package com.captian.reactor.section_two;

import com.captian.reactor.util.Util;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class Lec09FluxFromMono {

    public static void main(String[] args) {

//        Mono<String> mono = Mono.just("a");
//        Flux<String> flux = Flux.from(mono);
//
//        flux.subscribe(Util.onNext());

        Flux.range(1, 10)
                .filter(i -> i > 3)
                .next()// helps convert flux to a mono
                .subscribe(Util.onNext(), Util.onError(), Util.onComplete());
    }

    private static void doSomething(Flux<String> flux) {

    }
}
