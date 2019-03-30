package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Flaten {

    Integer[][] array;
    public Flaten(Integer[][] array) {
        this.array = array;
    }

    public List<Integer> transformToOneDimesional() {
        List<Integer> result = new ArrayList<>();

        for(Integer[] subArray : array) {
            for(Integer item : subArray) {
                result.add(item);
            }
        }
        return result;
    }

    public List<Integer> transformToUnrepeatedOneDimesional() {
        List<Integer> tempList = transformToOneDimesional();
        List<Integer> result = tempList.stream().distinct().collect(Collectors.toList());
        return result;
    }
}
