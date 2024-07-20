package com.ntdat.gradle.jacoco;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AddServiceTest {

    @Test
    void testAdd() {
        int a = 1;
        int b = 2;
        AddService addService = new AddService();
        assertEquals(3, addService.execute(a, b));
    }
}
