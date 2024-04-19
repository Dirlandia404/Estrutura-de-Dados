/*O Selection Sort é um algoritmo de ordenação que divide a lista em duas partes:
uma parte ordenada e uma parte não ordenada. Ele busca repetidamente o elemento mínimo
da parte não ordenada e o coloca no início da parte ordenada. Esse processo é repetido
até que toda a lista esteja ordenada. Ao contrário do Insertion Sort, que constrói a lista ordenada um elemento
de cada vez, o Selection Sort seleciona o menor elemento da lista não ordenada e o coloca na posição correta em uma passagem.
*/
public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

            System.out.print("Iteração " + (i+1) + ": ");
            for (int k = 0; k < n; k++) {
                System.out.print(arr[k] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 6, 1 };
        System.out.println("Array original:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        selectionSort(arr);

        System.out.println("Array ordenado usando Selection Sort:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

