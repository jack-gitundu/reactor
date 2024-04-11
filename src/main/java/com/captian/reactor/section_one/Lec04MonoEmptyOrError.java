package com.captian.reactor.section_one;

import com.captian.reactor.util.Util;
import reactor.core.publisher.Mono;

public class Lec04MonoEmptyOrError {

    public static void main(String[] args) {
        userRepository(2)
                .subscribe(
                        Util.onNext(),
                        Util.onError(),
                        Util.onComplete()
                );
    }

    private static Mono<String> userRepository(int userId) {

        // 1
        if (userId == 1) {
            return Mono.just(Util.faker().name().firstName());
        } else if (userId == 20) {
            return Mono.empty(); //null
        } else {
           return Mono.error(new RuntimeException("Not in the allowed range"));
        }
    }
}
