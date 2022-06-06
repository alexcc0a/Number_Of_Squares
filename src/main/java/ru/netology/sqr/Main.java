package ru.netology.sqr;

public class Main {
    public static void main(String[]args) {
        SQRService service = new SQRService();
        int i = service.squareCount(300, 200);
        System.out.println(i);

    }
}
