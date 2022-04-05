package com.artemvasin;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

//    @org.junit.jupiter.api.Test
//    @DisplayName("Тест")
//    void summaProductov(double expected, double actually) {
//
//         actually= 1000+1200+200;
//         expected=2400;
//        assertArrayEquals(actually, expected);
      //   Вопрос проверяющему, Почему не проходит проверку ?
        

//    }

    @Test
    @DisplayName("Test na proverku category")
    public void checkCategory() {
        Products  products=new Products();
        products.setCategory("soap");
        assertEquals("soap",products.getCategory() );
    }


}