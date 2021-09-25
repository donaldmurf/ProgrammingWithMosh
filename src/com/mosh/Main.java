package com.mosh;

import java.awt.*;
import java.lang.reflect.Array;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;





public class Main {
    public static void Header(String headerName){
        //This is a String to print out 20 forward slashes
        String forwardSlashes = "////////////////////";
        System.out.println(forwardSlashes + headerName + forwardSlashes );



    }
    public static void Footer(String footerName){
        String forwardSlashes = "////////////////////";
        System.out.printf(forwardSlashes + footerName + forwardSlashes );
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();




    }
    public static void main(String[] args) {
        //////////////////////PRIMITIVE TYPES START/////////////////////////
        Header("Primitive Type Section");



        //4 bytes
        int myIntAge = 30;
        //1 byte
        byte myByteAge = 30;

        //example of youtube video view count. //you can use underscore "_" as commas to make it easier to read.
        int viewsCountInt = 123_456_789;

        //long example
        long viewsCountLong = 3_123_456_789L; //if number is too large you can put a L at the end and it works

        //double example
        float priceFloat = 10.99F; //java sees 10.99 as a double by default so we put a F

        //char example //chars use single quotes ' '
        char myLetter = 'A';
        //bool example
        boolean isEligible = false;


        //note that you can press sout and then tab and it will auto fill "System.out.println();

        // System.out.println(forwardSlashes + "Primitive Types Section" + forwardSlashes);
        System.out.println("Hello Don! You are age " + myIntAge + ".");
        System.out.println("viewsCountInt = " + viewsCountInt);
        System.out.println("viewsCountLong = " + viewsCountLong);
        System.out.println("priceFloat = " + priceFloat);
        System.out.println("myLetter = " + myLetter);
        System.out.println("isEligible is set false and = " + isEligible);

        Footer("End Primitive Section");
        ///////////////////////////PRIMITIVE TYPES END/////////////////////////


        /////////////////////////REFERENCE TYPES START/////////////////////////
        Header("Reference section");
        //if you type "Date" and press tab it automatically adds "import java.util.Date;" at the top to import library
        // new allocates memory that gets cleaned up automatically




        Date now = new Date();

        System.out.printf("The current date and time is : " + now);
        System.out.println();//to make a new line

        ///example of reference //NEED TO STUDY AND UNDERSTAND THIS BETTER
        Point point1 = new Point(1, 1);
        Point point2 = point1;

        point1.x = 2;
        System.out.println(point2);
        Footer("End reference section");
        ///////////////////////////REFERENCE TYPES END/////////////////////////



        /////////////////////////Start String section/////////////////////////
        Header("Start String section");


        //concatenate examples
        //strings are reference types in java, but because they are used so much this is basically short hand
        //String myMessage = new String("Hello World");
        String myMessage = "Hello World";
        System.out.println("my message is " + myMessage);
        System.out.println("Does myMessage end with ld? Answer: " + myMessage.endsWith("ld"));
        System.out.println("Does myMessage start with ld? Answer: " + myMessage.startsWith("ld"));
        System.out.println("Does myMessage start with he? Answer: " + myMessage.startsWith("he"));
        System.out.println("Does myMessage start with He? Answer: " + myMessage.startsWith("He"));
        System.out.println("The length of " + myMessage + " is " + myMessage.length());
        System.out.println("The index of W is " + myMessage.indexOf("W") + " in " + myMessage);
        System.out.println("The letter z is not in " + myMessage + "so indexOf wil return " + myMessage.indexOf("z"));
        System.out.println("I'm going to replace World with Don in " + myMessage + ". The new message is " + myMessage.replaceAll("World", "Don"));


        //good method to user is .trim  //get rid of white space before and after string
        String trimExample = "        This is a message that gets trimmed.                                        ";
        System.out.printf("Before Trim:");
        System.out.println(trimExample);
        System.out.printf("After Trim:");
        System.out.printf(trimExample.trim());

        //for a new line
        System.out.println();

        char charA = 'a';
        int intA = 5;

        char charB = 'b';
        int intB = 4;

        char charC = 'c';
        int intC = intA + intB;

        System.out.println(charA + "= " + intA);
        System.out.println(charB + "= " + intB);
        System.out.println(charC + "= " + charA + " + " + charB);
        System.out.println(charC + " is a total of " + intC);

        //example if you want to have quotation marks (" ") inside a string the backslash in an escape key
        System.out.println("Hello \"Mosh\"");
        System.out.printf("c:\\Windows\\...");
        System.out.println("\tnext\n");
        System.out.println("line\n");

        System.out.println(point2);

        Footer("End String section");
        /////////////////////////End String section/////////////////////////


        /////////////////////////Start Array section/////////////////////////
        Header("Start Array section");

        int[] numbers = new int[5];

        //Arrays.toString(numbers) is used from imported library (type Array hit enter) //the Arrays is put in a sout to display it on the console
        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = i;

            System.out.println(numbers[i]);

        }

        int[] largerNumbers = {14, 13, 12, 11, 15};
        System.out.println(Arrays.toString(largerNumbers));
        //this sorts the array
        Arrays.sort(largerNumbers);
        System.out.println(Arrays.toString(largerNumbers));


        //2-d arrays

        //example
        System.out.println("char example");
        char[][] exampleArray = {{'a', 'b', 'c'}, {'c', 'd', 'e'}};
        System.out.println(Arrays.deepToString(exampleArray));


        //2x3 matrix (rows,columns)
        int[][] my2dArray = new int[2][3];
        my2dArray[0][0] = 1;
        //.deepToString for 2d array
        System.out.println(Arrays.deepToString(my2dArray));

        int[][][] my3dArray = new int[4][3][2];
        System.out.println(Arrays.deepToString(my3dArray));

        Footer("End Array section");
        /////////////////////////End Array section/////////////////////////



    /////////////////////////Start Constants section/////////////////////////
        Header("Start Constants section");


        //final makes it a constant //always name constants IN CAPS
        final double PI = 3.14;
        System.out.println(PI);

        Footer("End Constants section");
        /////////////////////////End Constants section/////////////////////////

        /////////////////////////Start Arithmetic Expression section/////////////////////////
        Header("Start Arithmetic Expression section");

        double arithmeticResult1 = 10 / 3; //cast numbers number to a double
        double arithmeticResult2 = 10.0 / 3; //using .0 will give double precision
        double arithmeticResult3 = 10 / (double) 3; //cast numbers number to a double
        System.out.println(arithmeticResult1); //3.0
        System.out.println(arithmeticResult2); //3.33
        System.out.println(arithmeticResult3); //3.33

        //increment and decrement
        int incrementNumber = 1;
        int decrementNumber = 1;

        incrementNumber++;
        System.out.println(incrementNumber); // 1 +1 =2

        decrementNumber--;
        System.out.println(decrementNumber); // 1-1 = 0

        incrementNumber += 2;
        System.out.println(incrementNumber); //2+2=4

        //can also put before  NOTE: this can change the order on how things are done
        ++incrementNumber;
        System.out.println(incrementNumber);


        String arithmeticString = "1";

        int arithmeticResult = Integer.parseInt(arithmeticString) + incrementNumber; //add string plus int
        //can use:
        //Float.parseFloat()
        //Double.parseDouble()
        //etc
        System.out.println(arithmeticResult);


        Footer("End Arithmetic Expression section");
        /////////////////////////End Arithmetic section/////////////////////////


        /////////////////////////Start Math Class section/////////////////////////
        Header("Start Math Class section");

        //the (int)Math... is casting the number into a int

        //this will print the rounded number
        int mathRound = (int) Math.round(2.6);
        System.out.println("The number 2.6 rounded up is " + mathRound);

        //round up
        int mathCeil = (int) Math.ceil(1.2);
        System.out.println("The ceiling of 1.2 is " + mathCeil);

        //round down
        int mathFloor = (int) Math.floor(1.9);
        System.out.println("The floor of 1.9 is " + mathFloor);

        //return max of 2 numbers
        int mathMax = Math.max(2, 6);
        System.out.println("Between 2 and 6 the max number is " + mathMax);

        //return min of 2 numbers
        int mathMin = Math.min(2, 6);
        System.out.println("Between 2 and 6 the min number is " + mathMin);

        //print a random number standard
        double mathRandom1 = Math.random();
        System.out.println("This is a random number between 0 and 1: " + mathRandom1);

        //print a random number 1-10 that is cast to a whole number only; in the def the number is rounded
        double mathRandom10 = Math.round((Math.random() * 10));
        System.out.println("This is a random whole number between 1 and 10: " + mathRandom10);

        //print a random number 1-100 that is cast to a whole number only; in the print statement the number is rounded; this is cast to an int and has () around math.random and 100
        int mathRandom100 = (int) (Math.random() * 100);
        System.out.println("This is a random whole number between 1 and 10: " + Math.round(mathRandom100));


        Footer("End Math Class section");
        /////////////////////////End Math section/////////////////////////

/////////////////////////Start Formatting Numbers section/////////////////////////
        Header("Start Formatting Numbers section");

        //class is called NumberFormat

        //type NumberFormat.getCurrencyInstance(); first then add NumberFormat Currency = last
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        System.out.println("1234567.891 in currency format is: " + currency.format(1234567.891));

        //example of the getPercentInstance
        NumberFormat percentNum = NumberFormat.getPercentInstance();
        System.out.println(".89 in as a percentage is: " + percentNum.format(.89));


        //better example
        System.out.println(NumberFormat.getPercentInstance().format(.1));

        //or this
        String formatExample = NumberFormat.getPercentInstance().format(.22);
        System.out.println(formatExample);


        Footer("End Formatting Numbers section");
        /////////////////////////End Formatting Numbers section/////////////////////////


        /////////////////////////Start Reading Input section/////////////////////////
        Header("Start Reading Input section");



        //how to initialize taking in input
//        Scanner userInput = new Scanner(System.in);
//        Scanner fullName = new Scanner(System.in); ///NOTICE HOW THERE IS ANOTHER SCANNER OBJECT OTHERWISE AFTER SCANNERNAMER INPUT IT WOULD SKIP OVER SCANNERFULLNAME.
//
//        System.out.print("Enter your age: ");
//        //how to take an int as input
//         int scannerAge = userInput.nextInt();
//
//        System.out.print("Enter your First name: ");
//        //how to take a string as input
//        String scannerName = userInput.next(); //note this might auto trim
//
//        System.out.print("Enter your Full name: ");
//        //how to take a string a whole line is as input. AKA first name and last name. (First name would be 1 token and Last name would be one token for .next()
//        String scannerFullName = fullName.nextLine().trim(); //Notice how trim is there to take away white spaces
//
//
//
//
//        System.out.println("Your age is: "+scannerAge);
//        System.out.println("Your First name  is: "+scannerName);
//        System.out.println("Your Full name  is: "+scannerFullName);





        Footer("End Reading Input section");
        /////////////////////////End Input Section/////////////////////////

        /////////////////////////Start Comparison Operators Section/////////////////////////
        Header("Start Comparison Operators Section");
        int compareX = 1;
        int compareY = 1;

        System.out.println("X = " + compareX + " and Y =  " +compareY+". Are they the same: " + (compareX == compareY));



        Footer("End Comparrison Operators Section");
        /////////////////////////End Comparison Operators Section/////////////////////////



        /////////////////////////Start Logical Operators Section/////////////////////////
        Header("Start Logical Operators Section");

       //the && operators everything has to be true or it will produce false
        int temperature = 22;
        boolean isWarm = temperature > 20 && temperature < 30; //&& = and

        System.out.println("Set temp to 22. Is it warm? : " + isWarm);
        temperature =12;
        isWarm = temperature > 20 && temperature < 30;
        System.out.println("Set temp to 12. Is it warm? : " +isWarm);


        //the || operator if at least one statement is true then its true
        boolean hasHighIncome = true;
        boolean hasGoodCredit = false;
        boolean isCriminal = true;

        boolean isEligibleLogic = hasHighIncome || hasGoodCredit; // || = or
        System.out.println("Before Criminal check either high income or good credit :"+isEligibleLogic);

        isEligibleLogic = (hasGoodCredit || hasHighIncome) && !isCriminal;
        System.out.println("After Criminal check included: " +isEligibleLogic);
        Footer("End Logical Operators Section");
        /////////////////////////End Logical Operators Section/////////////////////////


        /////////////////////////Start IF statement Section/////////////////////////
        Header("Start IF statement Section");




        Footer("End IF statement Section");
        /////////////////////////End IF statement Section/////////////////////////

        /////////////////////////Start Ternary Section/////////////////////////
        Header("Start Ternary Section");




        Footer("End Ternary Section");
        /////////////////////////End Ternary Section/////////////////////////

        /////////////////////////Start Switch Section/////////////////////////
        Header("Start Switch Section");




        Footer("End Switch Section");
        /////////////////////////End Switch Section/////////////////////////

        /////////////////////////Start Loops Section/////////////////////////
        Header("Start  Loops Section");




        Footer("End  Loops Section");
        /////////////////////////End  Loops Section/////////////////////////

        /////////////////////////Start Break/Continue Section/////////////////////////
        Header("Start Break/Continue Section");




        Footer("End Break/Continue Section");
        /////////////////////////End Break/Continue Section/////////////////////////













    }


}

