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

## 2.Insertion sort


배열을 정렬된 부분(앞부분)과 정렬 안 된 부분(뒷부분)으로 나누고, 정렬 안 된 부분의 가장 왼쪽 원소를 정렬된 부분의 적절한 위치에 삽입하는 과정을 반복하여 정렬하는 알고리즘


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

## 3.Selection sort

입력 배열 전체에서 최소값을 ‘선택’하여 배열의 0번 원소와 자리를 바꾸고, 다음엔 0번 원소를 제외한 나머지 원소에서 최솟값을 선택하여, 배열의 1번 원소와 자리를 바꾸는 과정을 반복하고 2개의 원소가 남으면 그 중에 최소값을 선택하여 자리를 바꾸어 정렬하는 알고리즘


<img width="409" alt="스크린샷 2021-05-05 오후 3 39 59" src="https://user-images.githubusercontent.com/81538527/117106576-118ee880-adbb-11eb-9699-b2607a9d4f53.png">

```java


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
                
                
```
## 4.Shell sort


삽입 정렬을 이용하여 배열 뒷부분의 크기가 작은 숫자를 앞부분으로 빠르게 이동시키는 동시에 앞부분의 크기가 큰 숫자는 뒷부분으로 이동시키는 과정을 반복하고 마지막에는 삽입 정렬을 수행하여 정렬하는 알고리즘



<img width="579" alt="스크린샷 2021-05-05 오후 3 42 34" src="https://user-images.githubusercontent.com/81538527/117107113-05eff180-adbc-11eb-821c-148731f2e4e9.png">
<img width="454" alt="스크린샷 2021-05-05 오후 3 42 42" src="https://user-images.githubusercontent.com/81538527/117107124-09837880-adbc-11eb-8258-be8fd528e0dc.png">


```java


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
                        

```



### 메인코드
