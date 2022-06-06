package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {
    @Test
    public void sqrMaxSqrMin() {
        SQRService service = new SQRService();
        int expected = 3;
        int actual = service.squareCount(300, 200);
        Assertions.assertEquals(expected, actual);
    }

}
