public class Main2 {

    static void quickSort(int[] a, int l, int r){
        if(a.length <= 1) return;
        if(r <= l) return;

        int mid = (r + l) / 2;
        int midValue = a[mid];
        int R = r, L = l;

        while(R >= L){
            while(a[L] > midValue) L++;
            while(a[R] < midValue) R--;

            if(R >= L) {
                int bf = a[L];
                a[L] = a[R];
                a[R] = bf;
                R--;
                L++;
            }
        }

        if(l < R)
            quickSort(a, l, R);
        if(r > L)
            quickSort(a, L, r);

    }

    public static void main(String[] args) {
        int[] arr = new int[]{7, 2, 4, 5, 1, -10, 6};

        quickSort(arr, 0, arr.length - 1);


        for(int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
    }
}
