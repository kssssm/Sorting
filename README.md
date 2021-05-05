# Sorting
-------


## 1. Bubble sort


이웃하는 숫자를 비교하여 작은수를 앞으로 이동시키는 과정을 반복하여 정렬하는 알고리즘

<img width="612" alt="스크린샷 2021-05-05 오후 3 38 56" src="https://user-images.githubusercontent.com/81538527/117105528-2ec2b780-adb9-11eb-81e6-c7fc2136835a.png">



```java


public static void BubbleSort(int num[]) {
        int temp = 0;
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = 0; j < num.length - 1; j++) {
                if (num[j] > num[j + 1]) {
                    temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
                
                
```
시간복잡도: O(n^2)
## 2.Insertion sort


배열을 정렬된 부분과 정렬 안 된 부분으로 나누고, 정렬 안 된 부분의 가장 왼쪽 원소를 정렬된 부분의 적절한 위치에 삽입하는 과정을 반복하여 정렬하는 알고리즘


<img width="307" alt="스크린샷 2021-05-05 오후 3 40 43" src="https://user-images.githubusercontent.com/81538527/117106149-51090500-adba-11eb-9358-a5784b9a9409.png">

<img width="250" alt="스크린샷 2021-05-05 오후 3 40 54" src="https://user-images.githubusercontent.com/81538527/117106164-57977c80-adba-11eb-8f5e-200dcd2d81be.png">


<img width="302" alt="스크린샷 2021-05-05 오후 3 41 21" src="https://user-images.githubusercontent.com/81538527/117106196-69791f80-adba-11eb-96b1-6d293b070af8.png">




```java


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
                
                
```
