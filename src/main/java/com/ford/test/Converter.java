package com.ford.test;

public interface Converter {

    String convertIntToRoman(int num) throws IllegalArgumentException;

    int convertRomanToInt(String roman) throws IllegalArgumentException;
}
