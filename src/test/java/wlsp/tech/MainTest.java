package wlsp.tech;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    //@INFO MIN_LENGTH: 8 Characters
    static String password = "MIN_8_CHARACTERS_i!";

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

    //AT_LEAST_ONE_NUMBER
    @Test
    void hasNumber_shouldReturnTrue_whenStringHasNumber() {
        boolean actual = Main.hasNumber(password);

        assertTrue(actual);
    }

    //NOT_ONLY_NUMBERS
    @Test
    void isNotOnlyNumber_shouldReturnFalse_whenStringIsNotOnlyNumber() {
        boolean actual = Main.isOnlyNumbers(password);

        assertFalse(actual);
    }

    //HAS_UPPER_AND_LOWER_CASE_CHARACTER
    @Test
    void hasUpperCaseAndLowerCase_shouldReturnTrue_whenStringHasUpperCaseAndLowerCase() {
        boolean actual = Main.hasLowercaseAndUppercase(password);

        assertTrue(actual);
    }

    //HAS_AT_LEAST_ONE_SPECIAL_CHARACTER
    @Test
    void hasAtLeastOneSpecialCharacter_shouldReturnTrue_whenStringHasAtLeastOneSpecialCharacter() {
        boolean actual = Main.hasAtLeastOneSpecialCharacter(password);

        assertTrue(actual);
    }
}