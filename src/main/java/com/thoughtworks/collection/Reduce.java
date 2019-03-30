package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
        arrayList.sort((value1, value2) -> value2 - value1);

        Integer result = arrayList.get(0);
        return result;
    }

    public double getMinimum() {
        arrayList.sort((value1, value2) -> value1 - value2);

        Integer result = arrayList.get(0);
        return result;
    }

    public double getAverage() {
        int total = 0;
        for (Integer item : arrayList) {
            total += item;
        }
        return ((double) total / arrayList.size());
    }

    public double getOrderedMedian() {
        int size = arrayList.size();
        arrayList.sort((value1, value2) -> value1 - value2);
        return (double) (arrayList.get((size - 1) / 2) + arrayList.get(size / 2)) / 2;
    }

    public int getFirstEven() {
        for (Integer item : arrayList) {
            if ((item % 2) == 0) {
                return item;
            }
        }
        return 0;
    }

    public int getIndexOfFirstEven() {
        Integer length = arrayList.size();
        for (Integer i = 0; i <= length; i++) {
            if ((arrayList.get(i) % 2) == 0) {
                return i;
            }
        }
        return 0;
    }

    public boolean isEqual(List<Integer> arrayList) {
        if (arrayList.size() != this.arrayList.size()) {
            return false;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (this.arrayList.get(i).intValue() != arrayList.get(i).intValue()) {
                return false;
            }
        }
        return true;
    }

    public Double getMedianInLinkList(SingleLink singleLink) {
        int size = arrayList.size();
        return (double) (arrayList.get((size - 1) / 2) + arrayList.get(size / 2)) / 2;
    }

    public int getLastOdd() {
        Integer length = arrayList.size();
        for (int i = length - 1; i >= 0; i--) {
            Integer value = arrayList.get(i);
            if ((value % 2) != 0) {
                return value;
            }
        }
        return 1;
    }

    public int getIndexOfLastOdd() {
        Integer length = arrayList.size();
        for (int i = length - 1; i >= 0; i--) {
            Integer value = arrayList.get(i);
            if ((value % 2) != 0) {
                return i;
            }
        }
        return 1;
    }
}
