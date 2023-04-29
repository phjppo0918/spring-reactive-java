package com.example.springreactivejava.chap05;

import reactor.core.publisher.Flux;

public class Example5_1 {
    public static void main(String[] args) {
        Flux<String> seq = Flux.just("Hello", "Reactor");
        seq.map(String::toLowerCase).subscribe(System.out::println);
    }
}
