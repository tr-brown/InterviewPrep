package Day2;
//3. Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer

//input num in parameter
//find out how many digits in the parameter
    //convert to a string
    //split string to make an array
    //convert string array to index array via loop
//sum the first digit with the rest of the digits
    //with index array sum all of the digits via loop

public class Ques3 {
    public static void sumOfDigits(int num) {
        String strOfNum = "" + num;     //convert int to str
        String[]strArrOfNum = strOfNum.split("");   //convert str to array of strs
        int[] numbers = new int[strArrOfNum.length];    //creates an empty int array to fill with converted strs

        //iterate through str array and build int array from the converted value;
        for (int i = 0; i < strArrOfNum.length; i++) {
            numbers[i] = Integer.parseInt(strArrOfNum[i]);
        }

        //iterate through int array and sum all of the values
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }
}
