package com.tw;

import java.util.ArrayList;

public class StringCalculator {
    public int add(String string) {
        if (string.isEmpty()) return 0;
        int result = 0;
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            if (Character.isDigit(string.charAt(i))) nums.add(Character.getNumericValue(string.charAt(i)));
        }
        for (int num : nums) {
            result += num;
        }
        return result;
    }
}
