package com.example.demo;

import reactor.core.publisher.Flux;

public class ReactiveOperatorsDemo {
    public static void main(String[] args) {
        Flux<Integer> numbers = Flux.range(1, 5);

        numbers
            .map(n -> n * 2)
            .filter(n -> n > 5)
            .flatMap(n -> Flux.just(n, n + 1))
            .reduce(0, (a, b) -> a + b)
            .subscribe(result -> System.out.println("Sum = " + result));
    }
}

