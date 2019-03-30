package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;

public class Add {

    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int result = 0;
        if(leftBorder > rightBorder) {
            leftBorder += rightBorder;
            rightBorder = leftBorder - rightBorder;
            leftBorder = leftBorder -rightBorder;
        }
        for(int i=leftBorder; i<=rightBorder; i++) {
            if(i % 2 == 0) {
                result += i;
            }
        }

        return result;
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        int result = 0;
        if(leftBorder > rightBorder) {
            leftBorder += rightBorder;
            rightBorder = leftBorder - rightBorder;
            leftBorder = leftBorder -rightBorder;
        }
        for(int i=leftBorder; i<=rightBorder; i++) {
            if(i % 2 == 1) {
                result += i;
            }
        }

        return result;
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        Integer result = 0;
        for(Integer item : arrayList) {
            result += item * 3 + 2;
        }
        return result;
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        for(int i = 0; i < arrayList.size(); i++) {
            Integer value = arrayList.get(i);
            if(value % 2 == 1) {
                arrayList.set(i, value * 3 + 2);
            }
        }
        return arrayList;
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        int result = 0;

        for(int i = 0; i < arrayList.size(); i++) {
            Integer value = arrayList.get(i);
            if(value % 2 == 1) {
                result += value * 3 + 5;
            }
        }
        return result;
    }



    public double getMedianOfEven(List<Integer> arrayList) {
        List<Integer> newList = new ArrayList<>();
        for (Integer i : arrayList) {
            if ((i % 2) == 0) {
                newList.add(i);
            }
        }
        Collections.sort(newList);
        int size = newList.size();
        return (double) (newList.get((size - 1) / 2) + newList.get(size / 2)) / 2;
    }

    public double getAverageOfEven(List<Integer> arrayList) {
        int count = 0;
        int total = 0;
        for(int item : arrayList) {
            if(item % 2 == 0) {
                count ++;
                total += item;
            }
        }

        return (double) (total / count);
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        List<Integer> newList = new ArrayList<>();
        for(int item : arrayList) {
            if(item % 2 == 0) {
                newList.add(item);
            }
        }
        return newList.contains(specialElment);
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        Map tempMap = new HashMap();
        int size = arrayList.size();
        for(int i = 0; i < size; i++) {
            Integer value = arrayList.get(i);
            if(value % 2 == 0) {
                tempMap.put(value, value);
            }
        }
        Collection<Integer> valueCollection = tempMap.values();
        List<Integer> result = new ArrayList<Integer>(valueCollection);
        return result;
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        for(int i = 0; i < arrayList.size() - 1; i++) {
            Integer prevValue = arrayList.get(i);
            Integer next_Value = arrayList.get(i + 1);
            arrayList.set(i, (prevValue + next_Value) * 3);
        }
        return arrayList;
    }
}
