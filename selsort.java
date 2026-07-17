public class selsort {
    public static void main(String[] args) {
        int[] arr = {20,12,10,15,2};
        sort(arr);
    for (Integer i:arr){
        System.out.print(i +" ");
    }
    }
    static void sort(int[] arr){
        for(int i=0; i<arr.length;i++){
            int minIn=i;
            for(int j = i;j<arr.length;j++){
                if(arr[j] < arr[minIn]){
                    minIn=j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIn];
            arr[minIn] = temp;

        }
    }
}
// output: 2 10 12 15 20 
