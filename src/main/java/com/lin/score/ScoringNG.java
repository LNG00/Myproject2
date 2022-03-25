package com.lin.score;

public class ScoringNG {
    public static void main(String[] args) {
        int[] chinese = {90, 85, 80, 92, 75 };
        int[] engish = {80, 85, 90, 78, 95 };
        String[]name = {"Join", "Joanna", "May ", "Nana", "Selina"};
        for (int i = 0; i < 5; i++) {
            System.out.println(name[i]+"\t"+chinese[i]+"\t"+engish[i]+"\t"+(chinese[i]+engish[i])/2);
        }
    }
}
