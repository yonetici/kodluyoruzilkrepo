import java.util.Scanner;
public class Main {
public static void main(String[] args) {
    Scanner input =new Scanner(System.in);
    System.out.print("How many number will be ordered:");
    int num =input.nextInt();
    int[] arr= new int [num];
    for(int b=0;b<arr.length;b++){
        System.out.print("Number " + (b+1) +"=");
        arr[b]=input.nextInt();
    }

    for (int i=0; i<arr.length;i++) {
        for (int k=i;k<arr.length;k++) {

            if(arr[i] > arr[k]) {
    
            int temp=arr[k];
            arr[k]=arr[i];
            arr[i]=temp;
            }
        }

    }
    for (int i : arr){
        System.out.println(i);
    }
}
}

