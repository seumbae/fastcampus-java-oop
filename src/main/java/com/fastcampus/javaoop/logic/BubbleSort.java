package com.fastcampus.javaoop.logic;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort <T extends Comparable<T>> {

    public List<T> sort(List<T> list){
        List<T> output = new ArrayList<>(list);

        for(int i=output.size() -1; i>0; i--){
            for(int j=0; j<i; j++){
                if(output.get(j).compareTo(output.get(j+1)) > 0 ){
                    T tmp = output.get(j);
                    output.set(j, output.get(j+1));
                    output.set(j+1, tmp);
                }
            }
        }
        return output;
    }
}
