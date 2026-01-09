import java.util.Scanner;

class Main {
    static int[] tmp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sort(arr);
        for(int num:arr)
            System.out.println(num);
        }
    
    public static void sort(int[] arr){
        tmp = new int[arr.length]; //전역 변수 사용할 것이니 tmp에 변수형 붙히면 안됨
        mergesort(arr,0,arr.length-1);
    }
    
    public static void mergesort(int[] arr, int start, int end){
        if(start<end){
            int mid = (start+end)/2;
            mergesort(arr,start,mid);
            mergesort(arr,mid+1,end);
            merge(arr,start,mid,end);
        }
    }
    
    public static void merge(int[] arr, int start, int mid, int end){
        int part1 = start;
        int part2 = mid+1;
        int index = start;
    
        while(part1<=mid&&part2<=end){
            if(arr[part1]<=arr[part2])
                tmp[index++]=arr[part1++];
            else
                tmp[index++]=arr[part2++];
        }
        while (part1<=mid)
            tmp[index++]=arr[part1++];
        while(part2<=end)
            tmp[index++]=arr[part2++];
        for(int i =start; i<=end; i++){
            arr[i]=tmp[i];
        }
    }
}
