package com.lin.score;

import com.lin.score.Student;

public class GraduateStudent extends Student {
    int thesis;
    public GraduateStudent(String name, int Chinese, int English, int thesis) {
        super(name, Chinese, English);
        this.thesis=thesis;


    }
    public GraduateStudent(String name) {
            super(name);

    }
    @Override
    public void print(){
       System.out.println(name + "\t" + Chinese + "\t" + English + "\t"
                + getave() + "\t" + thesis);
    }
}