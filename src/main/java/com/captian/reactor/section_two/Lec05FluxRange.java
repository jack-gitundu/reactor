package com.captian.reactor.section_two;

import com.captian.reactor.util.Util;
import reactor.core.publisher.Flux;

public class Lec05FluxRange {

    public static void main(String[] args) {

        Flux.range(1, 10)
//                .log()
                .map(i -> Util.faker().name().fullName())
//                .log()
                .subscribe(
                        Util.onNext()
                );
    }
}
