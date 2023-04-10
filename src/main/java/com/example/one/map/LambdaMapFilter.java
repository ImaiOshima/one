package com.example.one.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Classname LambdaMapFilter
 * @Description TODO
 * @Author Imai
 * @Date 2023/4/10 23:54
 * @Created by 61635
 */
public class LambdaMapFilter {
    public static void main(String[] args) {
        Map<Integer,String> a = new HashMap<>();
        Map<Integer,String> b = new HashMap<>();
        Map<Integer,String> c = new HashMap<>();
        Map<Integer,String> d = new HashMap<>();
        a.put(1,"a");
        b.put(2,"b");
        c.put(3,"c");
        d.put(1,"d");
        List<Map<Integer,String>> list = Arrays.asList(a,b,c,d);
        filter(list,1);
    }

    public static List<Map<Integer,String>>  filter(List<Map<Integer,String>> list,Integer key){
        List<Map<Integer, String>> res = list.stream()
                .filter(x-> !x.containsKey(key))
                .collect(Collectors.toList());
        res.forEach(System.out::println);
        return res;
    }
}
