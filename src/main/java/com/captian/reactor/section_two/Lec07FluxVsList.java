package com.captian.reactor.section_two;

import com.captian.reactor.section_two.helper.NameGenerator;
import com.captian.reactor.util.Util;

import java.util.List;

public class Lec07FluxVsList {

    public static void main(String[] args) {

//        List<String> names = NameGenerator.getNames(5);
//        System.out.println(names);

        NameGenerator.getName(5)
                .subscribe(Util.onNext());
    }
}
