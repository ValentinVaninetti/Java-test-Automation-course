import java.util.Random;
public class OrderArrayApp {
    public static final int MAX = 10;
    public static final int MAXVALUE = 10;
    public static final int MINVALUE = 1;
    public static void main(String [] args){
        int []  array  = new int[MAX];
        loadArray(array);
        bubbleSorting(array);
        loadArray(array);
        selectionSorting(array);
        loadArray(array);
        insertionSort(array);

    }

    public static void loadArray(int [] array){
        Random r = new Random();
        for (int i = 0; i < MAX; i++){
            array[i] = (r.nextInt(MAXVALUE - MINVALUE+1) +MINVALUE);
        }
    }
    public static void print(String methodType, int [] array, long startTime){
        System.out.print("--"+methodType);
        for(int i = 0; i < MAX;i++){
            System.out.print("|"+array[i]+ "|");
        }
        System.out.print("--");
        long endTime = System.nanoTime();
        System.out.println("that took "+ ((endTime - startTime )/1000000 + " miliseconds"));
    }

    public static void bubbleSorting(int [] array){
        long startTime = System.nanoTime();
        int aux;
        for(int i = 1; i<MAX; i++){
            for (int j = 0; j<MAX; j++){
                if(array[j] >= array[i]){
                    aux = array[j];
                    array[j] = array[i];
                    array[i] = aux;
                }
            }
        }
        print("Bubble Sorting method" , array, startTime);
    }
    public static void selectionSorting(int[]array) {
        int min_pos, tmp;
        long startTime = System.nanoTime();
        for (int i = 0; i < MAX; i++) {
            min_pos = i;
            for (int j = i + 1; j < MAX; j++){
                if (array[j] < array[min_pos]) {
                    min_pos = j;

                }
            }
            if (min_pos != i){
                tmp = array[i];
                array[i] = array[min_pos];
                array[min_pos] = tmp;
            }
        }
        print("Selection sorting method", array, startTime);
    }
    public static void insertionSort(int[]array) {
        int aux, j;
        long startTime = System.nanoTime();
        for (int i = 1; i < MAX; i++) {
            aux = array[i];
            j = i - 1;
            while ((j >= 0) && (array[j] > aux)){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = aux;
        }
        print("Intertion sorting method", array, startTime);
    }

}
