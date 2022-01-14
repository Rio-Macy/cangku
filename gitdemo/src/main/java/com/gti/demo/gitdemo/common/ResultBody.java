package com.gti.demo.gitdemo.common;

import lombok.Getter;
import lombok.Setter;

/**
 * @author sujuntao
 */
@Setter
@Getter
public class ResultBody<T> {

    private T t;
    private String msg;
}
