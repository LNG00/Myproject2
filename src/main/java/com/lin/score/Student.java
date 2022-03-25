package com.lin.score;


public class Student {
    String name;
    int Chinese;
    int English;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int Chinese, int English) {
        this(name);
        this.Chinese = Chinese;
        this.English = English;
    }

    public void print (){
        System.out.print(name + "\t" + Chinese + "\t" + English + "\t" + getave());
            if (getave() < 60) {
                System.out.println("\t" + "*");
            }
        System.out.println();
    }

    public int getave() {
        return (Chinese +English)/2;
    }
}
