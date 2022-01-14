package com.gti.demo.gitdemo.controller;

import com.gti.demo.gitdemo.service.GitService;
import com.gti.demo.gitdemo.service.impl.GitServiceImpl;

/**
 * @author sujuntao
 */
public class GitController {

    // Unable to access 'https://github.com/Rio-Macy/cangku.git/': Could not resolve host: github.com

    GitService gitService = new GitServiceImpl();

    public String push() {

        if (gitService == null) {

            System.out.println("push fail");

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
