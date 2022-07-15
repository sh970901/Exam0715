package org.example;
class ArrayList{
    int[] arr;
    int lastIndex=-1;
    ArrayList(){
        arr = new int[2];
    }
    int size(){
        return lastIndex+1;
    }
    void add(int num){
        lastIndex++;
        if(arr.length<=lastIndex){
            int arr2[] = new int[arr.length * 2];
            for(int i=0; i<arr.length; i++){
                arr2[i] = arr[i];
            }
            arr = arr2;
        }
        arr[lastIndex] = num;
    }
    void add(int data, int index){
        lastIndex++;
        if(arr.length<=lastIndex){
            int arr2[] = new int[arr.length * 2];
            for(int i=0; i<arr.length; i++){
                arr2[i] = arr[i];
            }
            arr = arr2;
        }
        for(int i=lastIndex; i>=index; i--){
            arr[lastIndex+1]=arr[lastIndex];
        }
        arr[index] = data;
    }
    int get(int index){
        return arr[index];
    }

    public void removeAt(int index) {
        for(int i = index; i<=lastIndex; i++){
            arr[index] = arr[index+1];
        }
        lastIndex--;
    }

    public int getArrayLength() {
        return arr.length;
    }

    public void showAllValues() {
        System.out.println("== 전체 데이터 출력 ==");
        for(int i=0; i<=lastIndex; i++){
            System.out.println(i+" : "+ arr[i]);
        }
    }
}
class Main{
    public static void main(String[] args) {

    }
}