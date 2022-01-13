package com.gti.demo.gitdemo.controller;

import com.gti.demo.gitdemo.service.GitService;
import com.gti.demo.gitdemo.service.impl.GitServiceImpl;

/**
 * @author sujuntao
 */
public class GitController {

    GitService gitService = new GitServiceImpl();

    public String push() {

        if (gitService == null) {
            return "push fail";
        }else {
            return "push success";
        }
    }

    public String commit() {

        if (gitService == null) {
            return "commit fail";
        }else {
            return "commit success";
        }
    }
}
