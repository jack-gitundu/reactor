package com.captian.reactor.section_one;

import com.github.javafaker.Faker;

public class FakerDemo {
    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            System.out.println(Faker.instance().name().fullName());
        }
    }
}
