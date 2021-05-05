import java.util.Scanner;

public class sort {

    public static void main(String[] args) {

        sort s = new sort();
        System.out.print("배열크기 : ");
        Scanner sc = new Scanner(System.in);
        int ArraySize = sc.nextInt();

        int[] num = new int[ArraySize];
        for (int i = 0; i < ArraySize; i++) {
            num[i] = (int) (Math.random() * ArraySize);
        }
        int[] tm1 = num;
        int[] tm2 = num;
        int[] tm3 = num;
        int[] tm4 = num;


        long st1 = System.currentTimeMillis();
        BubbleSort(tm1);
        long ed1 = System.currentTimeMillis();

        System.out.println();
        System.out.println("걸린시간(Bubble): " + (ed1 - st1) + "ms");


        long st2 = System.currentTimeMillis();
        InsertionSort(tm2);
        long ed2 = System.currentTimeMillis();


        System.out.println();
        System.out.println("걸린시간(Insertion): " + (ed2 - st2) + "ms");

        long st3 = System.currentTimeMillis();
        SelectionSort(tm3);
        long ed3 = System.currentTimeMillis();

        System.out.println();
        System.out.println("걸린시간(Selection): " + (ed3 - st3) + "ms");

        long st4 = System.currentTimeMillis();
        ShellSort(tm4);
        long ed4 = System.currentTimeMillis();

        System.out.println();
        System.out.println("걸린시간(Shell): " + (ed4 - st4) + "ms");


    }

    public static void BubbleSort(int num[]) {
        int temp = 0;
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = 0; j < num.length - 1; j++) {
                if (num[j] > num[j + 1]) {
                    temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }
    }


    public static void InsertionSort(int[] num) {
        for (int i = 1; i < num.length; i++) {
            int target = num[i];
            int j = i - 1;

            while (j >= 0 && target < num[j]) {
                num[j + 1] = num[j];
                j--;
            }
            num[j + 1] = target;
        }

    }

    public static void SelectionSort(int[] num) {

        for (int idx = 1; idx < num.length; idx++) {
            int temp = num[idx];
            int aux = idx - 1;
            while ((aux >= 0) && (num[aux] > temp)) {
                num[aux + 1] = num[aux];
                aux--;
            }
            num[aux + 1] = temp;
        }

    }

    public static void ShellSort(int[] num) {
        int temp = 0;
        int gap = num.length;
        for (; gap > 1; ) {
            gap = (gap / 3) + 1;

            for (int i = 0; i < gap; i++) {
                for (int j = i + gap; j < num.length; j += gap) {

                    for (int x = i; x < j; x += gap) {

                        if (num[x] > num[j]) {
                            temp = num[x];
                            num[x] = num[j];
                            num[j] = temp;
                        }
                    }
                }
            }
        }

    }

}






