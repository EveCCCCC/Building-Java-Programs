package Chapter7;

public class CountingInversions {    
    public static void main(String[] args) {
    	int[] list = {5,4,3,2,1};
    	System.out.println(mergeSort(list, 0, list.length));
    }

    private static int mergeSort (int[] a, int low, int high) {
        if (low == high - 1) return 0;
        int mid = (low + high)/2;
        return mergeSort (a, low, mid) + mergeSort (a, mid, high) + merge (a, low, mid, high);
    }

    private static int merge (int[] a, int low, int mid, int high) {
        int count = 0;
        int[] temp = new int[a.length];

       for (int i = low, lb = low, hb = mid; i < high; i++) {
            if (hb >= high || lb < mid && a[lb] <= a[hb]) {
                temp[i]  = a[lb++];
            } else {
                count = count + (mid - lb); 
                temp[i]  = a[hb++];
            } 
       }

       System.arraycopy(temp, low, a, low, high - low);
       return count;
    }
}