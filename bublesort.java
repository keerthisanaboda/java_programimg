public class bublesort {
public static void main(String[] args) {  
int[] arr = {5,4,3,2,1};
sort(arr);
for(Integer i: arr) {
System.out.print(i+" ");
}
}
static void sort (int[] arr) {
int n = arr.length; for (int j = 0; j<n; j++){
for (int i=0;i<n-1;i++) {
int curr = arr[i];
int next = arr[i+1];
if (curr> next) {
swap (i, arr);
}
}
}
}

static void swap(int i, int []arr) { 

int temp = arr[i];
arr[i] = arr[i+1];
arr[i+1] = temp;
}
}
// output:1 2 3 4 5
