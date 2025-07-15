package Assignment2;

//Name: Haley Dhaliwal
//Date: July 15, 2025
//Purpose: Calculate even numbers in two integer arrays

class Main {
    //main function declares the arrays and prints the number of even entries
    public static void main(String[] args) {
        //defines the integer arrays 'foo' and 'far'
        int[] foo = {0, 1, 2, 3, 4};

        //refactored variable 'bar' to 'far' for all instances in code
        int[] far = new int[100];
       //For loop fills the array far with numbers 0-99 corresponding to each index, respectively
        for(int i = 0; i < 100; i++){
            far[i] = i;
        }

        //prints the number of even numbers in each array by calling on countEvenNum function taking each array
        //and its size as parameters
        System.out.println("The number of even numbers in foo is:");
        System.out.println(countEvenNum(foo, 5));

        System.out.println("The number of even numbers in far is:");
        System.out.println(countEvenNum(far, 100));

    }

//countEvenNum function takes parameters of an integer array and the size of the array
//gives output of the number of even entries in each array
    private static int countEvenNum(int[] arr, int size){
       //declares the count of even numbers as an integer, setting it to zero
        int count = 0;

        //for loop checks each entry in the array
        for(int i = 0; i < size; i++){
            //if the entry is even, count increases
            if(arr[i] % 2 == 0){
                count++;
            }
        }

        //returns the number of even entries in the array
        return count;
    }
}

