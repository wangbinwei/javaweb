package com.kuang.servlet;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wbw
 * @date 2021/8/7 10:58
 */
public class test {
    public static void main(String[] args) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        List<Integer> path1 = new ArrayList<>();
        path.add(12);
        path1.add(1);
        List<Integer> path2 = new ArrayList<>(path1); //可以这样子直接复用
        ans.add(path);
        ans.add(path1);

        for (List<Integer> an : ans) {
            System.out.println(an.toString());
        }
    }
}
