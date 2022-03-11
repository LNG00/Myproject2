package com.lin;

public class GraduateStudent extends Student {
    int thesis;
    public GraduateStudent(String name, int Chinese, int English, int thesis) {
        super(name, Chinese, English);
        this.thesis=thesis;


    }
    public GraduateStudent(String name) {
            super(name);

    }
    public void print(){
        int ave = (Chinese+English)/2;
        System.out.println(name + "\t" + Chinese + "\t" + English + "\t"
                + ave +thesis);
    }
}