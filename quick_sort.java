public class quick_sort {
    static void sort_array(int[] a, int low, int high){
        if(low >= high){
            return ;
        }

        int mid = return_index(a, low, high);
        sort_array(a, low, mid-1);
        sort_array(a, mid+1, high);
    }
    static int return_index(int[] a, int low, int high){
        int pi = low;
        int i = high;

        for(int j = high; j >=low; j-- ){
            if(a[pi] <= a[j]){
                swap(a, i, j);
                i--;
            }
        }
        return i+1;
    }

    static void swap(int []a, int b, int c){
        int temp = a[b];
        a[b] = a[c];
        a[c] = temp;
    }
    public static void main(String[] args) {
        int []a = {2, 1, 3, 52, 2, 42, 23, 4, 6 };
        // System.out.println(a.toString());
        for(int i:a){
            System.out.print(i+" ");
        }
        System.out.println();
        sort_array(a, 0, a.length-1);

        for(int i:a){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
