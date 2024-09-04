package secondProject;
public class ArrayTriangle {

  public static void formTriangle(int[] arr) {
      // Base case: If the array has only one element, print it and return
      if (arr.length == 1) {
          System.out.println(arr[0]);
          return;
      }

      // Print the current row
      printArray(arr);

      // Create a new array for the next row
      int[] nextRow = new int[arr.length - 1];

      // Populate the next row with sums of adjacent elements from the current row
      for (int i = 0; i < nextRow.length; i++) {
          nextRow[i] = arr[i] + arr[i + 1];
      }

      // Recursively form the triangle with the next row
      formTriangle(nextRow);
  }

  // Helper method to print an array
  private static void printArray(int[] arr) {
      for (int i : arr) {
          System.out.print(i + " ");
      }
      System.out.println();
  }

  public static void main(String[] args) {
      int[] arr = {6, 4, 7, 3, 7};
      formTriangle(arr);
  }
}
