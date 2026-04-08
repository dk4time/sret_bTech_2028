package com.greedy.com;

import java.util.*;

class MinimumVertices {

    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {

        int[] indegree = new int[n];

        for(List<Integer> edge : edges){
            int to = edge.get(1);
            indegree[to]++;
        }

        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < n; i++){
            if(indegree[i] == 0){
                result.add(i);
            }
        }

        return result;
    }
}