import java.util.Arrays;

class InsertionSort{

    public int[] sort(int[] array){
        int aux = 0;

        for(int i = 1; i < array.length; i++){
            for(int j = i - 1; j >= 0; j--){
                if(array[i] < array[j]){
                    aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                    i -= 1;
                }else{
                    break;
                }
            }
        }
        return array;
    }

    public static void main(String[] args){

        int[] array = new int[]{45, 67, 89, 10, 12, 5};

        InsertionSort insertionSort = new InsertionSort();

        System.out.println("Unsorted array: " + Arrays.toString(array));

        System.out.println("Sorted array: " + Arrays.toString(insertionSort.sort(array)));
    }  
}