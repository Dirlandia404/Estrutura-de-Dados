import java.util.Arrays;

/*Bubble Sort é um algoritmo de ordenação simples que percorre repetidamente a lista,
comparando elementos adjacentes e os trocando de lugar se estiverem na ordem errada, até que a lista esteja ordenada.
Ele recebe o nome devido à maneira como os elementos maiores "burbulham" para suas posições finais.
*/

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++){
            boolean swap = false;
            System.out.println("Passo " + (i+1) + ":");
            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j]> arr[j+1]){
                    int cont = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = cont;
                    swap = true;
                }
                System.out.println("  Compara " + arr[j] + " e " + arr[j+1] + ": " + Arrays.toString(arr));

            }
            if(!swap){
                System.out.println("Nenhuma troca feita, a lista está ordenada.");
//               break;
            }
            System.out.println("Lista após o passo " + (i+1) + ": " + Arrays.toString(arr));
        }
    }
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        System.out.println("Lista original: " + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("Lista ordenada: " + Arrays.toString(arr));
    }

}
