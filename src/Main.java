public class Main {

    public static void bubbleSort(int[] arr){

        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - 1 - i; j++){
                if(arr[j] > arr[j+1]){
                    int bf = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = bf;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{7, 1, 4, 2, 1, -10, 6};

        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - 1 - i; j++){
                if(arr[j] > arr[j+1]){
                    int bf = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = bf;
                }
            }
        }

        for(int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");

    }
}
