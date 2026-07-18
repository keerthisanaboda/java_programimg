import java.util.Arrays;

public class binary {
 public static void main(String[] args) {
   int[] arr = {3,5,2,1,8,7,6,4,10};
     Arrays.sort(arr);
    System.out.println(" Sorted array :" + Arrays.toString(arr)); 
    int k = 8;
    int ind = search(arr,k);
    System.out.println("Index of given number :" + ind);
 }
 static int search(int[] arr,int k){
      int mid,low=0,high=arr.length;
    while(low<=high){
      mid = (low+high)/2;
      if(arr[mid]==k){
        return mid;
      }else if(arr[mid]<k){
        low = mid;
      }else if (arr[mid]>k){
        high = mid;
      }
    }
    return -1;
 }
}
/* output:
Sorted array :[1, 2, 3, 4, 5, 6, 7, 8, 10]
Index of given number :7
  */
