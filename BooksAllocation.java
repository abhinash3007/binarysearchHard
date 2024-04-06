package BINARYSEARCH_PART2;

public class BooksAllocation {
    public static int student(int[]arr,int page){
        int student=1;
        int totalPages=0;
        for (int i = 0; i < arr.length; i++) {
            if(totalPages+arr[i]<=page){
                totalPages+=arr[i];
            }else{
                student++;
                totalPages=arr[i];
            }
        }return student;
    }public static void booksAllocation(int[]arr,int start,int end,int k){
        while (start<=end) {
            int mid=start+(end-start)/2;
            if(student(arr, mid)<=k){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }System.out.println(start);
    }public static void main(String[] args) {
        int[]arr={7,2,5,10,8};
        booksAllocation(arr, 0, Integer.MAX_VALUE, 2);
    }
}
