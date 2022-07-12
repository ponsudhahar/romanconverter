package com.ford.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RomanConverterTest {

    private RomanConverter romanConverter;

    @BeforeEach
    void setUp() {
        romanConverter = new RomanConverter();
    }

    @Test
    void testConvertIntToRoman_One() throws IllegalArgumentException {
        String actualValue = romanConverter.convertIntToRoman(1);
        assertEquals("I", actualValue);
    }

    @Test
    void testConvertIntToRoman_Two() throws IllegalArgumentException {
        String actualValue = romanConverter.convertIntToRoman(2);
        assertEquals("II", actualValue);
    }

    @Test
    void testConvertIntToRoman_Four() throws IllegalArgumentException {
        String actualValue = romanConverter.convertIntToRoman(4);
        assertEquals("IV", actualValue);
    }

    @Test
    void testConvertIntToRoman_Five() throws IllegalArgumentException {
        String actualValue = romanConverter.convertIntToRoman(5);
        assertEquals("V", actualValue);
    }

    @Test
    void testConvertIntToRoman_Six() throws IllegalArgumentException {
        String actualValue = romanConverter.convertIntToRoman(6);
        assertEquals("VI", actualValue);
    }

    @Test
    void testConvertIntToRoman_Nine() throws IllegalArgumentException {
        String actualValue = romanConverter.convertIntToRoman(9);
        assertEquals("IX", actualValue);
    }

    @Test
    void testConvertIntToRoman_Ten() throws IllegalArgumentException {
        String actualValue = romanConverter.convertIntToRoman(10);
        assertEquals("X", actualValue);
    }

    @Test
    void testConvertIntToRoman_TwentySix() throws IllegalArgumentException {
        String actualValue = romanConverter.convertIntToRoman(26);
        assertEquals("XXVI", actualValue);
    }

    @Test
    void testConvertIntToRoman_FortyNine() throws IllegalArgumentException {
        String actualValue = romanConverter.convertIntToRoman(49);
        assertEquals("XLIX", actualValue);
    }

    @Test
    void testConvertIntToRoman_Fifty() throws IllegalArgumentException {
        String actualValue = romanConverter.convertIntToRoman(50);
        assertEquals("L", actualValue);
    }

    @Test
    void testConvertIntToRoman_Sixty() throws IllegalArgumentException {
        String actualValue = romanConverter.convertIntToRoman(60);
        assertEquals("LX", actualValue);
    }

    @Test
    void testConvertIntToRoman_Ninety() throws IllegalArgumentException {
        String actualValue = romanConverter.convertIntToRoman(90);
        assertEquals("XC", actualValue);
    }

    @Test
    void testConvertIntToRoman_OneHundredTen() throws IllegalArgumentException {
        String actualValue = romanConverter.convertIntToRoman(110);
        assertEquals("CX", actualValue);
    }

    @Test
    void testConvertIntToRoman_HundredNinety() throws IllegalArgumentException {
        String actualValue = romanConverter.convertIntToRoman(190);
        assertEquals("CXC", actualValue);
    }

    @Test
    void testConvertIntToRoman_FourHundredNinety() throws IllegalArgumentException {
        String actualValue = romanConverter.convertIntToRoman(490);
        assertEquals("CDXC", actualValue);
    }

    @Test
    void testConvertIntToRoman_SixHundred() throws IllegalArgumentException {
        String actualValue = romanConverter.convertIntToRoman(600);
        assertEquals("DC", actualValue);
    }

    @Test
    void testConvertIntToRoman_NineHundred() throws IllegalArgumentException {
        String actualValue = romanConverter.convertIntToRoman(900);
        assertEquals("CM", actualValue);
    }

    @Test
    void testConvertIntToRoman_TwoThousandNineHundred() throws IllegalArgumentException {
        String actualValue = romanConverter.convertIntToRoman(2900);
        assertEquals("MMCM", actualValue);
    }

    @Test
    void testConvertIntToRoman_TwoThousandNineHundredAndNinetyEight() throws IllegalArgumentException {
        String actualValue = romanConverter.convertIntToRoman(2998);
        assertEquals("MMCMXCVIII", actualValue);
    }

    @Test
    void testConvertIntToRoman_ThreeThousand() throws IllegalArgumentException {
        String actualValue = romanConverter.convertIntToRoman(3000);
        assertEquals("MMM", actualValue);
    }

    @Test
    void testConvertIntToRoman_ThreeThousandHundred() throws IllegalArgumentException {
        String actualValue = romanConverter.convertIntToRoman(3100);
        assertEquals("MMMC", actualValue);
    }

    @Test
    void testConvertIntToRoman_Zero() {
        Throwable thrown = assertThrows(IllegalArgumentException.class, () -> romanConverter.convertIntToRoman(0));
        assertEquals("No roman letter available for 0", thrown.getMessage());
    }

    @Test
    void testConvertRomanToInt_One() {
        int actualValue = romanConverter.convertRomanToInt("I");
        assertEquals(1, actualValue);
    }

    @Test
    void testConvertRomanToInt_Two() {
        int actualValue = romanConverter.convertRomanToInt("II");
        assertEquals(2, actualValue);
    }

    @Test
    void testConvertRomanToInt_Four() {
        int actualValue = romanConverter.convertRomanToInt("IV");
        assertEquals(4, actualValue);
    }

    @Test
    void testConvertRomanToInt_Five() {
        int actualValue = romanConverter.convertRomanToInt("V");
        assertEquals(5, actualValue);
    }

    @Test
    void testConvertRomanToInt_Six() {
        int actualValue = romanConverter.convertRomanToInt("VI");
        assertEquals(6, actualValue);
    }

    @Test
    void testConvertRomanToInt_Nine() {
        int actualValue = romanConverter.convertRomanToInt("IX");
        assertEquals(9, actualValue);
    }

    @Test
    void testConvertRomanToInt_Ten() {
        int actualValue = romanConverter.convertRomanToInt("X");
        assertEquals(10, actualValue);
    }

    @Test
    void testConvertRomanToInt_TwentySix() {
        int actualValue = romanConverter.convertRomanToInt("XXVI");
        assertEquals(26, actualValue);
    }

    @Test
    void testConvertRomanToInt_FortyNine() {
        int actualValue = romanConverter.convertRomanToInt("XLIX");
        assertEquals(49, actualValue);
    }

    @Test
    void testConvertRomanToInt_Fifty() {
        int actualValue = romanConverter.convertRomanToInt("L");
        assertEquals(50, actualValue);
    }

    @Test
    void testConvertRomanToInt_Sixty() {
        int actualValue = romanConverter.convertRomanToInt("LX");
        assertEquals(60, actualValue);
    }

    @Test
    void testConvertRomanToInt_Ninety() {
        int actualValue = romanConverter.convertRomanToInt("XC");
        assertEquals(90, actualValue);
    }

    @Test
    void testConvertRomanToInt_OneHundredTen() {
        int actualValue = romanConverter.convertRomanToInt("CX");
        assertEquals(110, actualValue);
    }

    @Test
    void testConvertRomanToInt_OneHundredNinety() {
        int actualValue = romanConverter.convertRomanToInt("CXC");
        assertEquals(190, actualValue);
    }

    @Test
    void testConvertRomanToInt_FourHundredNinety() {
        int actualValue = romanConverter.convertRomanToInt("CDXC");
        assertEquals(490, actualValue);
    }

    @Test
    void testConvertRomanToInt_sixHundred() {
        int actualValue = romanConverter.convertRomanToInt("DC");
        assertEquals(600, actualValue);
    }

    @Test
    void testConvertRomanToInt_NineHundred() {
        int actualValue = romanConverter.convertRomanToInt("CM");
        assertEquals(900, actualValue);
    }

    @Test
    void testConvertRomanToInt_TwoThousandNineHundred() {
        int actualValue = romanConverter.convertRomanToInt("MMCM");
        assertEquals(2900, actualValue);
    }

    @Test
    void testConvertRomanToInt_TwoThousandNinetyEight() {
        int actualValue = romanConverter.convertRomanToInt("MMCMXCVIII");
        assertEquals(2998, actualValue);
    }

    @Test
    void testConvertRomanToInt_TwoThousandSevenHundredSixtyEight() {
        int actualValue = romanConverter.convertRomanToInt("MMDCCLXVIII");
        assertEquals(2768, actualValue);
    }

    @Test
    void testConvertRomanToInt_ThreeThousand() {
        int actualValue = romanConverter.convertRomanToInt("MMM");
        assertEquals(3000, actualValue);
    }


    @Test
    void testConvertRomanToInt_InvalidChars() {
        Throwable thrown = assertThrows(IllegalArgumentException.class, () -> romanConverter.convertRomanToInt("12xIM"));
        assertEquals("Invalid characters not allowed", thrown.getMessage());
    }

    @Test
    void testConvertRomanToInt_InvalidCharNull() {
        Throwable thrown = assertThrows(IllegalArgumentException.class, () -> romanConverter.convertRomanToInt(null));
        assertEquals("Invalid characters not allowed", thrown.getMessage());
    }
}