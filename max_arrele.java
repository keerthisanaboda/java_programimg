public class arr {
    public static void main(String[] args) {
       int [] a = {1,10,5,2,5,6,90,1,2,4,8} ;
       int max =0;
       for(int i=0;i<a.length ;i++){
        if(a[i] > max){
            max =  a[i];
        }
    } System.out.println(max);
 }
}

// output : 90
