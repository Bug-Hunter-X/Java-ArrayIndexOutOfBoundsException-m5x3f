public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        if (arr.length > 0 && 0 <= 4) {
            System.out.println(arr[4]); // Accessing valid index
        } else {
            System.out.println("Array is empty or index is out of bounds");
        }
    }
}