package wlsp.tech;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {


    @Test
    void eighthCharactersOrMore_shouldReturnTrue_whenStringIsEighthCharactersOrMore() {
        //GIVEN
        String password = "HASEIGHTHORMORE";

        //WHEN
        boolean actual = Main.eighthCharactersOrMore(password);

        //THEN
        assertTrue(actual);

    }
}