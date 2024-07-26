package org.example;

import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {

        String greeting = "Hello Docker!";
        //System.out.println(greeting.toUpperCase());
        System.out.println(StringUtils.upperCase(greeting));
    }
}