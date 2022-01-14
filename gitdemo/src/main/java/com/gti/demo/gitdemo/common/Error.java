package com.gti.demo.gitdemo.common;

/**
 * @author sujuntao
 */
public class Error {

    static String reason;

    public static String fallBack() {
        System.out.println("process error...");
        System.out.println("juntao_code");
        return "404";
    }

    public static String fallBack1() {
        System.out.println("process error...");
        return "404";
    }
}
