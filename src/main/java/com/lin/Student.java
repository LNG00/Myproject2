package com.lin;

public class Student {
        String name;
        int Chinese;
        int English;

        public Student(String name){
            this.name = name;
        }
        public Student (String name, int Chinese, int English){
            this(name) ;
            this.Chinese = Chinese;
            this.English = English;
        }
        public void print(){
            int ave = (Chinese+English)/2;
            System.out.print(name + "\t" + Chinese + "\t" + English + "\t"
            + ave);
            if (ave <60){
                System.out.println("\t"+"*");
            }
    }

}
