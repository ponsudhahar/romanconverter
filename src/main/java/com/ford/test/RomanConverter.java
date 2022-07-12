package com.ford.test;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RomanConverter implements Converter {

    private static Map<Integer, String> intToRomanMap;
    private static Map<Character, Integer> romanToIntMap;

    static {

        intToRomanMap = new HashMap<>();
        intToRomanMap.put(1000, "M");
        intToRomanMap.put(500, "D");
        intToRomanMap.put(100, "C");
        intToRomanMap.put(50, "L");
        intToRomanMap.put(10, "X");
        intToRomanMap.put(5, "V");
        intToRomanMap.put(1, "I");

        romanToIntMap = new HashMap<>();
        romanToIntMap.put('M', 1000);
        romanToIntMap.put('D', 500);
        romanToIntMap.put('C', 100);
        romanToIntMap.put('L', 50);
        romanToIntMap.put('X', 10);
        romanToIntMap.put('V', 5);
        romanToIntMap.put('I', 1);

    }

    @Override
    public String convertIntToRoman(int num) throws IllegalArgumentException {
        String roman = "";
        int tempNum = num;
        List<Integer> list = Arrays.asList(1000, 100, 10, 1);

        if (num == 0) {
            throw new IllegalArgumentException("No roman letter available for 0");
        }

        for (Integer integer : list) {
            tempNum = num / integer;
            if (tempNum < 4) {
                roman += addRepeatedLetters(tempNum, integer);
            } else {
                int digit = String.valueOf(num).length();
                if (digit == 1) {
                    if (intToRomanMap.get(num) != null) {
                        roman += intToRomanMap.get(num);
                    } else {
                        if (tempNum == 4) {
                            roman += intToRomanMap.get(digit) + intToRomanMap.get(num + digit);
                        } else if (tempNum > 5 && tempNum < 9) {
                            roman += intToRomanMap.get(5) + addRepeatedLetters(num % 5, digit);
                        } else {
                            roman += addRepeatedLetters(10 - num, digit) + intToRomanMap.get(10);
                        }
                    }
                } else if (digit == 2) {
                    digit = 10;
                    roman = createRomanLetters(roman, tempNum, digit);
                } else if (digit == 3) {
                    digit = 100;
                    roman = createRomanLetters(roman, tempNum, digit);
                } else if (digit == 4) {
                    digit = 1000;
                    roman = createRomanLetters(roman, tempNum, digit);
                }
            }
            tempNum = num % integer;
            num = tempNum;
        }

        return roman;
    }

    private static String createRomanLetters(String roman, int tempNum, int digit) {

        if (intToRomanMap.get(tempNum * digit) != null) {
            roman += intToRomanMap.get(tempNum * digit);
        } else {
            if (tempNum == 4 || tempNum == 9) {
                roman += intToRomanMap.get(digit) + intToRomanMap.get(tempNum * digit + digit);
            } else {
                roman += intToRomanMap.get(tempNum * digit - digit) + intToRomanMap.get(digit);
            }
        }
        return roman;
    }

    private static String addRepeatedLetters(int num, Integer key) {
        String tempRoman = "";
        for (int i = 0; i < num; i++) {
            tempRoman += intToRomanMap.get(key);
        }
        return tempRoman;
    }

    @Override
    public int convertRomanToInt(String roman) {
        if(roman == null || roman.matches("(\\s)")){
            throw new IllegalArgumentException("Invalid characters not allowed");
        }
        int len = roman.length();
        int sum = romanToIntMap.get(Character.valueOf(roman.charAt(0)));

        if (len == 2) {
            if (romanToIntMap.get(Character.valueOf(roman.charAt(1))) > sum) {
                sum = romanToIntMap.get(Character.valueOf(roman.charAt(1))) - sum;
            } else {
                sum += romanToIntMap.get(Character.valueOf(roman.charAt(1)));
            }
        } else {
            int i = 0;
            sum = 0;

            while (i < len - 1) {
                if (romanToIntMap.get(Character.valueOf(roman.charAt(i))) >= romanToIntMap.get(Character.valueOf(roman.charAt(i + 1)))) {
                    sum += romanToIntMap.get(Character.valueOf(roman.charAt(i)));
                    i++;
                } else {
                    sum += romanToIntMap.get(Character.valueOf(roman.charAt(i + 1))) - romanToIntMap.get(Character.valueOf(roman.charAt(i)));
                    i += 2;
                }
            }
            if (i == len - 1) {
                sum += romanToIntMap.get(Character.valueOf(roman.charAt(i)));
            }
        }
        return sum;
    }
}
