package BINARYSEARCH_PART2;

public class KokoEatingBanana {
    public static int hours(int[]arr,int mid){
        int totalHours=0;
        for(int i=0;i<arr.length;i++){
            totalHours+=(int) Math.ceil((double) arr[i]/mid);
        }return totalHours;
    }public static void kokoEating(int[]arr,int start,int end,int h){
        while (start<=end) {
            int mid=start+(end-start)/2;
            int hour=hours(arr, mid);
            if(hour<=h){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }System.out.println(start);
     }public static void main(String[] args) {
        int[]arr={3,6,7,11};
        kokoEating(arr, 1, Integer.MAX_VALUE,8);
    }
}
