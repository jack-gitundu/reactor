package com.captian.reactor.section_one;

import com.captian.reactor.util.Util;
import reactor.core.publisher.Mono;

import java.util.concurrent.CompletableFuture;

public class Lec07MonoFromFuture {

    public static void main(String[] args) {

        Mono.fromFuture(getName())
                .subscribe(Util.onNext());

        Util.sleepSeconds(1);
    }

    public static CompletableFuture<String> getName() {
        return CompletableFuture.supplyAsync(() -> Util.faker().name().fullName());
    }
}
