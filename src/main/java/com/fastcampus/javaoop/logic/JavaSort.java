package com.fastcampus.javaoop.logic;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JavaSort <T extends Comparable<T>>{

    public List<T> sort(List<T> list){
        List<T> output = new ArrayList<>(list);
        Collections.sort(output);

        return output;
    }
}
