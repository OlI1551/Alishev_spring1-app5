package ru.alishev.springcourse;

import org.springframework.stereotype.Component;


public class JazzMusic implements Music {
    @Override
    public String getSong() {
        return "Let My People Go";
    }
}
