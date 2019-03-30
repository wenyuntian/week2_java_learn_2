package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        List<Integer> result = new ArrayList<>();
        if (left < right) {
            for (int i = left; i <= right; i++) {
                result.add(i);
            }
        } else {
            for (int i = left; i >= right; i--) {
                result.add(i);
            }
        }
        return result;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        List<Integer> result = new ArrayList<>();
        if (left < right) {
            for (int i = left; i <= right; i++) {
                if (i % 2 == 0) {
                    result.add(i);
                }

            }
        } else {
            for (int i = left; i >= right; i--) {
                if (i % 2 == 0) {
                    result.add(i);
                }
            }
        }
        return result;
    }

    public List<Integer> popEvenElments(int[] array) {
        List<Integer> result = new ArrayList<>();
        for (int item : array) {
            if (item % 2 == 0) {
                result.add(item);
            }
        }
        return result;
    }

    public int popLastElment(int[] array) {
        return array[array.length - 1];
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        List result = new ArrayList();
        Arrays.sort(secondArray);
        for(int item : firstArray) {
            if(Arrays.binarySearch(secondArray, item) >= 0) {
                result.add(item);
            }
        }
        return result;
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        Set tempSet = new LinkedHashSet();
        for(int item : firstArray) {
            tempSet.add(item);
        }
        for(int item : secondArray) {
            tempSet.add(item);
        }
        return new ArrayList<>(tempSet);
    }
}
