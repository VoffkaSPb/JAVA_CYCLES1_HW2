package ru.netology;

public class SQRService {

    public int limits(int leftLimit, int rightLimit) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (leftLimit <= (i * i) && (i * i) <= rightLimit) {
                count++;
            }
        }
        return count;

    }

}