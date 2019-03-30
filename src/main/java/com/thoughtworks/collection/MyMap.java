package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        List<Integer> result = new ArrayList<>();
        for (Integer item : array) {
            result.add(item * 3);
        }
        return result;
    }

    public List<String> mapLetter() {
        List<String> result = new ArrayList<>();
        for (int item : array) {
            result.add(letters[item - 1]);
        }
        return result;
    }

    public List<String> mapLetters() {
        List<String> result = new ArrayList<>();
        for(int item : array) {
            int times = (item - 1) / 26;
            int remainder = (item % 26) == 0 ? 26 : (item % 26);
            if(times == 0) {
                result.add(letters[item - 1]);
            } else {
                result.add(letters[times - 1] + letters[remainder - 1]);
            }
        }
        return result;
    }

    public List<Integer> sortFromBig() {
        List<Integer> result = new ArrayList<>();
        for (Integer item : array) {
            result.add(item);
        }
        result.sort((value1, value2) -> value2 - value1);
        return result;
    }

    public List<Integer> sortFromSmall() {
        List<Integer> result = new ArrayList<>();
        for (Integer item : array) {
            result.add(item);
        }
        result.sort((value1, value2) -> value1 - value2);
        return result;
    }
}
