public class Recursion {

    static int index = 0, count=0;
    public static void main(String[] args){

        int[]  arr = new int[] { 1,2,3,4,5,6,7,8,9,10};

        System.out.println("Before reversing array:");
        for (int len = 0 ; len < arr.length; len++)
            System.out.print(arr[len] + " ");

        Traverse_array_reverse(arr);


        System.out.println();

        System.out.println("After reversing array:");
        for (int len = 0 ; len < arr.length; len++)
            System.out.print(arr[len] + " ");
    }

   static void Traverse_array_reverse (int[] array){

        int temp;

        if ( index >= array.length)
            return;
        else {

            temp = array[index];
            index++;

            Traverse_array_reverse(array);

            array[count] = temp;
            count++;

        }
    }
}
