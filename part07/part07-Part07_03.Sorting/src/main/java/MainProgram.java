
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        
    }

    public static int smallest(int[] array){
        int smallest=array[0];
        for(int i=1;i<array.length;i++){
            if(array[i]<smallest){
                smallest=array[i];
            }
        }
        return smallest;
    }
    public static int indexOfSmallest(int[] array){
        // write your code here
        int smallest=array[0];
        int smallestInd=0;
        for(int i=1;i<array.length;i++){
            if(array[i]<smallest){
                smallest=array[i];
                smallestInd=i;
            }
        }
        return smallestInd;
    }
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        // write your code here
        int smallest=table[startIndex];
        int smallestInd=startIndex;
        for(int i=startIndex;i<table.length;i++){
            if(table[i]<smallest){
                smallest=table[i];
                smallestInd=i;
            }
        }
        return smallestInd;
    }
    public static void swap(int[] array, int index1, int index2) {
        // write your code here
        for(int i=0;i<array.length;i++){
            if(i==index1){
                for(int j=0;j<array.length;j++){
                    if(j==index2){
                        int swapVar=array[i];
                        array[i]=array[j];
                        array[j]=swapVar;
                    }
                }
            }
            
        }
    }
    public static void sort(int[] array) {
        for(int i=0;i<array.length;i++){
            swap(array,i,indexOfSmallestFrom(array,i));
        }
    }
}
