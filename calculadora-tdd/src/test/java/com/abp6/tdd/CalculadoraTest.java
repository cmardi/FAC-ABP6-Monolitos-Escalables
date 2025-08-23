package com.abp6.tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void sumar_debeRetornar5_para2y3() {
        Calculadora calc = new Calculadora();
        int r = calc.sumar(2, 3);
        assertEquals(5, r, "La suma de 2 y 3 debe ser 5");
    }

    @Test
    void restar_debeRetornar1_para4y3() {
        Calculadora calc = new Calculadora();
        int r = calc.restar(4, 3);
        assertEquals(1, r, "La resta de 4 y 3 debe ser 1");
    }

    @Test
    void multiplicar_debeRetornar12_para3y4() {
        Calculadora calc = new Calculadora();
        int r = calc.multiplicar(3, 4);
        assertEquals(12, r, "La multiplicación de 3 por 4 debe ser 12");
    }

    @Test
    void dividir_debeRetornar2_para10y5() {
        Calculadora calc = new Calculadora();
        int r = calc.dividir(10, 5);
        assertEquals(2, r, "La división de 10 por 5 debe ser 2");
    }
}
