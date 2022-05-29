import java.util.Arrays;

class SelectionSort{

    public int[] selectionSort(int[] array){
            int aux = 0;
            for(int i = 0; i < array.length; i++){
                for(int j = 0; j < array.length; j++){      
                    if(array[i] < array[j]){
                        aux = array[i];
                        array[i] = array[j];
                        array[j] = aux;
                    }

                }
            }
            return array;
        }
    
    public static void main(String[] agrs){

        SelectionSort ss = new SelectionSort();

        //An unsorted array
        int[] array = new int[]{64, 25, 12, 22, 11};

        //Print the unsorted array
        System.out.println("The unsorted array: " + Arrays.toString(array));

        //Calling the function to sort this array
        System.out.println("The sorted one: " + Arrays.toString(ss.selectionSort(array)));
    }

}