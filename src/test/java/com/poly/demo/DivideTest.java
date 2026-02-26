package com.poly.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivideTest {

    private Divide div;

    @BeforeEach
    public void setUp() {

        div = new Divide();

    }

    @Test
    public void kiemTraChiaHopLe_giatrila0() {


        int reslut = div.chia(0,1);

        int expected = 0;
        assertEquals(expected, reslut);
    }
    @Test
    public void kiemTraChiaHopLe_giatrila1() {


        int reslut = div.chia(1,1);

        int expected = 1;
        assertEquals(expected, reslut);
    }
    @Test
    public void kiemTraChiaHopLe_giatrila1000() {


        int reslut = div.chia(1000,1);

        int expected = 1000;
        assertEquals(expected, reslut);
    }
    @Test
    public void kiemTraChiaHopLe_giatrila999() {


        int reslut = div.chia(999,1);

        int expected = 999;
        assertEquals(expected, reslut);
    }

    @Test
    public void chiaKhongHopLe_giatrila0() {

        assertThrows(ArithmeticException.class, () -> div.chia(1,0));
    }

    // kiểm tra với trường hợp giá trị âm và giá trị lơn hơn 1000

    @Test
    public void chiaKhongHopLe_giatrilaAm() {

        assertThrows(IllegalArgumentException.class, () -> div.chia(-1,1));
    }






}