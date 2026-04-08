package com.oops.com;
class BubbleSort {  
    void bubbleSort(int arr[])
    {
       int n=arr.length;
       for(int i=0;i<n-1;i++) {
    	   for(int j=0;j<n-i-1;j++) {
    		   if(arr[j]>arr[j+1]) {
    			   int temp=arr[j];
    			   arr[j+1]=arr[j];
    			   arr[j+1]=temp;
    		   }
    	   }
       }
    }
    public static void main(String args[])
    {
        BubbleSort ob = new BubbleSort();
        int a[] = { 64, 34, 25, 12 };
        ob.bubbleSort(a);
      	int n = a.length;
        for (int i = 0; i < n; ++i)
            System.out.print(a[i] + " ");
        System.out.println();
    }
}