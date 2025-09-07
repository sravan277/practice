class main{
    static int binary_search(int []a, int target){
        int low = 0;
        int high = a.length-1;
        int mid = 0;
        while(low <= high){

            mid = (low+high) /2;

            if(a[mid] == target){
                return mid;
            }
            if(a[mid] > target){
                high = mid -1;
            }
            else{
                low = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int k = binary_search(a, 5);
        System.out.println(k);
    }
}