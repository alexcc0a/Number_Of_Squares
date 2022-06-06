package ru.netology.sqr;

public class SQRService {
    public int squareCount(int sqrMax, int sqrMin) {
        int count = 0;
        for (int i = 10; i < 99; i++) {
            if ((i * i) >= sqrMin) {
                if ((i * i) <= sqrMax) {
                    count++;
                }
            }
        }
        return count;
    }
}
