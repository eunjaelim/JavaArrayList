package ArrayListExample;

public class ex1 {public static void main(String[] args) {
        int[] arr = new int[10];

        for(int i=0;i< arr.length;i++){
            arr[i] =i+1;
        }

        for(int i : arr){
            System.out.print(i +" ");
        }
    }}

