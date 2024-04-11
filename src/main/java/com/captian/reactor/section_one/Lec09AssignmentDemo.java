package com.captian.reactor.section_one;

import com.captian.reactor.section_one.assignment.FileService;
import com.captian.reactor.util.Util;

public class Lec09AssignmentDemo {

    public static void main(String[] args) {

        FileService.read("file01.txt")
                .subscribe(Util.onNext(), Util.onError(), Util.onComplete());

//        FileService.write("file03.txt", "This is file03")
//                .subscribe(Util.onNext(), Util.onError(), Util.onComplete());

        FileService.delete("file03.txt")
                .subscribe(Util.onNext(), Util.onError(), Util.onComplete());

    }
}
