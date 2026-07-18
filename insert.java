public class insert {
    public static void main(String[] args) {
        int[] arr = {12,11,13,5,6};
        sort(arr);
        for(Integer i:arr){
            System.out.print(i+" ");

        }
    }
    static void sort(int[] arr){
        for(int i =1;i<arr.length;i++){
            int c = arr[i];
            int p = i-1;
            while(p>=0 && arr[p]> c){
                arr[p+1] = arr[p];
                p--;
            }arr[p+1] = c;
        }
    }
}
// output : 5 6 11 12 13 
