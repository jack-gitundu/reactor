package com.captian.reactor.section_two;

import com.captian.reactor.util.Util;
import reactor.core.publisher.Flux;

import java.util.Arrays;
import java.util.List;

public class Lec03FluxFromArrayOrList {

    public static void main(String[] args) {

        // List<String> strings = Arrays.asList("a", "b", "c");

        Integer[] array = {2, 3, 4, 5, 6};

        Flux.fromArray(array)
                .subscribe(Util.onNext());

//        Flux.fromIterable(strings)
//                .subscribe(Util.onNext());

    }
}
