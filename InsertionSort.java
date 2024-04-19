/*O Insertion Sort é um algoritmo de ordenação que constrói a lista ordenada um elemento de cada vez,
movendo elementos não ordenados para a posição correta na parte ordenada da lista. Ele começa considerando
o segundo elemento e o compara com o primeiro, inserindo-o na posição correta se necessário. Em seguida, ele considera
o terceiro elemento e o insere na posição correta entre os dois primeiros elementos, e assim por diante.
Esse processo continua até que todos os elementos estejam na posição correta.
*/
public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;

             System.out.print("Iteração " + i + ": ");
            for (int k = 0; k < n; k++) {
                System.out.print(arr[k] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        System.out.println("Array original:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        insertionSort(arr);

        System.out.println("Array ordenado usando Insertion Sort:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

