package wlsp.tech;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    //@INFO MIN_LENGTH: 8 Characters
    static String password = "MIN_8_CHARACTERS";

    //MIN_LENGTH
    @Test
    void minLength_shouldReturnTrue_whenStringIsMinLength() {
        //GIVEN
        //WHEN
        boolean actual = Main.minLength(password);

        //THEN
        assertTrue(actual);

    }

    //MIN_LENGTH_NO_WHITESPACE
    @Test
    void minLengthWithOutWhitespace_shouldReturnTrue_whenStringIsMinLengthWithOutWhitespace() {
        boolean actual = Main.minLengthWithOutWhitespace(password);

        assertTrue(actual);
    }

}