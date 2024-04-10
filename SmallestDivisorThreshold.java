package BINARYSEARCH_PART2;

public class SmallestDivisorThreshold {
    public static int total(int[]arr,int val){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=(int)Math.ceil((double)arr[i]/(double)val);
        }return sum;
    }public static void threshold(int[]arr,int start,int end,int tresh){
        while (start<=end) {
            int mid=start+(end-start)/2;
            if(total(arr, mid)<=tresh){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }System.out.println(start);
    } public static void main(String[] args) {
        int[]arr={1,2,5,9};
        threshold(arr, 0, Integer.MAX_VALUE, 6);
    }
}
