package com.jiakevin.ccar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * a test controller
 *
 * @author jiakevin
 * @date 2021-04-17 23:00
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public Collection<String> sayHello() {
        return IntStream.range(0, 10).mapToObj(i -> "hello number " + i).collect(Collectors.toList());
    }
}
