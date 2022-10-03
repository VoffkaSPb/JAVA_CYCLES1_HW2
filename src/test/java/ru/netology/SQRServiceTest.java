package ru.netology;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.api.Assertions;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = {"/testdata.csv"})
    public void test(int leftLimit, int rightLimit, int expected) {

        SQRService number = new SQRService();
        int actual = number.limits(leftLimit, rightLimit);

        Assertions.assertEquals(expected, actual);
    }
}
