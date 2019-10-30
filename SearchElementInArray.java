//Problem: Given an array arr[] of n elements, write a function to search a given element x in arr[].

//Analysis:
//1. start from leftmost element of an array and compare search element with all element towards element;
//2. If search element found then return index;
//3. If search element not found return -1;


public class SearchElementInArray {
    public static int searchElement(int arr[], int search){ 

        for(int i=0;i<arr.length;i++){
            if(arr == null){
                return 0;
            }

            if(arr[i] == search) {
                return i;
            }            
        }
        return -1;
    }
}
