package com.greedy.com;

	import java.util.Arrays;
	class Item {
	    int value;
	    int weight;
	    Item(int value, int weight) {
	        this.value = value;
	        this.weight = weight;
	    }
	}
	public class FractionalKnapsack {
	    static double getMaxValue(int capacity, Item[] items) {
	        // Sort items based on value/weight ratio (descending)
	        Arrays.sort(items, (a, b) ->
	                Double.compare(
	                        (double) b.value / b.weight, (double) a.value / a.weight));
	        double totalValue = 0.0;
	        for (Item item : items) {
	            if (capacity >= item.weight) {
	                capacity = capacity - item.weight;
	                totalValue = totalValue + item.value;
	            } else {
	                double fraction = (double) capacity / item.weight;
	                totalValue = totalValue + item.value * fraction;
	                break;
	            }
	        }
	        return totalValue;
	    }
	    public static void main(String[] args) {
	        Item[] items = {
	                new Item(60, 10),
	                new Item(100, 20),
	                new Item(120, 30)
	        };
	        int capacity = 50;
	        System.out.println("Maximum value = " +
	                getMaxValue(capacity, items));
	    }
	}



