import java.util.Random;
import java.util.Scanner;

public class Main {
    // Shared Random object used by all methods that need random numbers
    static Random rand = new Random();

    public static void main(String[] args) {

        // =====================================================================
        // PSEUDOCODE EXAMPLES
        // =====================================================================

        System.out.println("===== Pseudocode Example 1 =====");
        pseudoExample1();

        System.out.println("\n===== Pseudocode Example 2 =====");
        pseudoExample2();

        // =====================================================================
        // PSEUDOCODE EXERCISES 1.1 to 1.10
        // =====================================================================

        System.out.println("\n===== 1.1 =====");
        q1_1();

        System.out.println("\n===== 1.2 =====");
        q1_2();

        System.out.println("\n===== 1.3 =====");
        q1_3();

        System.out.println("\n===== 1.4 =====");
        q1_4();

        System.out.println("\n===== 1.5 =====");
        q1_5();

        System.out.println("\n===== 1.6 =====");
        q1_6();

        System.out.println("\n===== 1.7 =====");
        q1_7();

        System.out.println("\n===== 1.10 =====");
        q1_10();

        // =====================================================================
        // QUESTION 1
        // =====================================================================

        System.out.println("\n===== 1 a) =====");
        q1a();

        System.out.println("\n===== 1 a) - display 1 to 10 =====");
        q1a_1to10();

        System.out.println("\n===== 1 a) - display 3 to 11 =====");
        q1a_3to11();

        System.out.println("\n===== 1 a) - even numbers 0 to 18 =====");
        q1a_even();

        System.out.println("\n===== 1 a) - odd numbers 0 to 18 =====");
        q1a_odd();

        System.out.println("\n===== 1 a) - multiples of 7 between 0 and 100 =====");
        q1a_multiples7();

        System.out.println("\n===== 1 b) =====");
        q1b();

        System.out.println("\n===== 1 c) =====");
        q1c();

        System.out.println("\n===== 1 b1) =====");
        q1b1();

        // =====================================================================
        // QUESTION 2
        // =====================================================================

        System.out.println("\n===== 2. =====");
        q2();

        System.out.println("\n===== 2. - 0 to 10 =====");
        q2_0to10();

        System.out.println("\n===== 2. - 1 to 10 =====");
        q2_1to10();

        System.out.println("\n===== 2. - 1 to 20 =====");
        q2_1to20();

        System.out.println("\n===== 2. - -5 to 5 =====");
        q2_neg5to5();

        System.out.println("\n===== 2. - -20 to 20 =====");
        q2_neg20to20();

        System.out.println("\n===== 2 a. =====");
        q2a();

        System.out.println("\n===== 2 b. =====");
        q2b();

        System.out.println("\n===== 2 c. =====");
        q2c();

        // =====================================================================
        // QUESTION 3 / 4 (IF / ELSE section)
        // =====================================================================

        System.out.println("\n===== 3. (averages) =====");
        q3_averages();

        System.out.println("\n===== 4b) =====");
        q4b();

        System.out.println("\n===== 4c) =====");
        q4c();

        System.out.println("\n===== 4d) =====");
        q4d();

        System.out.println("\n===== 4e) =====");
        q4e();

        System.out.println("\n===== 4f) =====");
        q4f();

        // =====================================================================
        // QUESTION 5
        // =====================================================================

        System.out.println("\n===== 5. =====");
        q5();

        System.out.println("\n===== 5b) =====");
        q5b();

        System.out.println("\n===== 5c) =====");
        q5c();

        // =====================================================================
        // QUESTION 6
        // =====================================================================

        System.out.println("\n===== 6. =====");
        q6();

        System.out.println("\n===== 6a) =====");
        q6a();

        System.out.println("\n===== 6b) =====");
        q6b();

        System.out.println("\n===== 6c) =====");
        q6c();

        // =====================================================================
        // QUESTION 7 (nested loops / patterns)
        // =====================================================================

        System.out.println("\n===== 7. =====");
        q7();

        System.out.println("\n===== 7 b) =====");
        q7b();

        System.out.println("\n===== 7 c) =====");
        q7c();

        System.out.println("\n===== 7 d) =====");
        q7d();

        System.out.println("\n===== 7 e) =====");
        q7e();

        System.out.println("\n===== 7 f) =====");
        q7f();

        System.out.println("\n===== 7 g) =====");
        q7g();

        // =====================================================================
        // QUESTION 7 (strings section)
        // =====================================================================

        System.out.println("\n===== 7. (strings) =====");
        q7_strings();

        System.out.println("\n===== 7 a) =====");
        q7a_strings();

        System.out.println("\n===== 7 b) =====");
        q7b_strings();

        // =====================================================================
        // QUESTION 8  (interactive - uncomment to run)
        // =====================================================================

        System.out.println("\n===== 8. =====");
        System.out.println("  (Skipped - interactive. Uncomment q8() in main to run.)");
        // q8();

        System.out.println("\n===== 8 a) =====");
        System.out.println("  (Skipped - interactive. Uncomment q8a() in main to run.)");
        // q8a();

        System.out.println("\n===== 8 b) =====");
        System.out.println("  (Skipped - interactive. Uncomment q8b() in main to run.)");
        // q8b();

        // =====================================================================
        // QUESTION 9
        // =====================================================================

        System.out.println("\n===== 9. =====");
        q9();

        System.out.println("\n===== 9 a) =====");
        q9a();

        System.out.println("\n===== 9 c) =====");
        q9c();

        // =====================================================================
        // QUESTION 8 (Scanner / format demo - interactive)
        // =====================================================================

        System.out.println("\n===== 8 a) Scanner demo =====");
        System.out.println("  (Skipped - interactive. Uncomment q8_scanner() in main to run.)");
        // q8_scanner();

        // =====================================================================
        // QUESTION 3 (multiples - later in document)
        // =====================================================================

        System.out.println("\n===== 3 a) =====");
        q3a(5);

        System.out.println("\n===== 3 a) - multiples per row =====");
        q3a_perRow(4);

        // =====================================================================
        // QUESTION 4 (rows - later in document)
        // =====================================================================

        System.out.println("\n===== 4 a) =====");
        q4a(16);

        System.out.println("\n===== 4 b) =====");
        q4b_rows(7);

        System.out.println("\n===== 4 c) =====");
        q4c_rows(16);

        System.out.println("\n===== 4 d) =====");
        q4d_rows(16);

        System.out.println("\n===== 4 e) =====");
        q4e_rows(3, 15);

        // =====================================================================
        // QUESTION 5) (arrays - later in document)
        // =====================================================================

        System.out.println("\n===== 5 a) =====");
        q5a();

        System.out.println("\n===== 5 b) =====");
        q5b_arr(20);

        System.out.println("\n===== 5 c) =====");
        q5c_arr();

        System.out.println("\n===== 5 d) =====");
        q5d_arr();

        System.out.println("\n===== 5 e) =====");
        q5e_arr("word");

        System.out.println("\n===== 5 f) =====");
        q5f_arr('J');

        System.out.println("\n===== 5 g) =====");
        q5g_arr("Hello");

        System.out.println("\n===== 5 h) =====");
        q5h_arr("This is lovely");

        System.out.println("\n===== 5 i) =====");
        q5i_arr();

        System.out.println("\n===== 5 j) =====");
        q5j_arr("The man walk");

        // =====================================================================
        // QUESTION 6 (advanced - later in document)
        // =====================================================================

        System.out.println("\n===== 6 a) =====");
        q6a_prime(17);
        q6a_prime(18);

        System.out.println("\n===== 6 b) =====");
        q6b_primes(50);

        System.out.println("\n===== 6 c) =====");
        q6c_primeGroups(50);

        System.out.println("\n===== 6 d) =====");
        q6d("123+12");

        System.out.println("\n===== 6 e) =====");
        q6e("The man eat");

        System.out.println("\n===== 6 f) =====");
        q6f(new int[]{1, 2, 3, 2, 999});

        System.out.println("\n===== 6 g) =====");
        q6g("he is asleep");

        System.out.println("\n===== 6 h) =====");
        q6h(500);

        // =====================================================================
        // QUESTION 2 (2-dim arrays - later in document)
        // =====================================================================

        System.out.println("\n===== 2 a) (2-dim) =====");
        q2a_twoDim(10);

        // =====================================================================
        // QUESTION 6 l) Chessboard
        // =====================================================================

        System.out.println("\n===== 6 l) =====");
        q6l('C', 3);
    }


    // =========================================================================
// Pseudocode Example 1
// Write pseudo code that displays the numbers 1 to 5 on the screen.
//
// PSEUDOCODE:
//   Start
//     Move 1 to number
//     Repeat 5 times:
//       Display number
//       Add 1 to number
//     End repeat
//   End-Start
// =========================================================================
    static void pseudoExample1() {
        int number = 1;                    // Move 1 to number

        for (int i = 0; i < 5; i++) {     // Repeat 5 times
            System.out.println(number);    // Display number
            number = number + 1;           // Add 1 to number
        }
    }


    // =========================================================================
// Pseudocode Example 2
// Write a program that displays all even numbers from 1 to 150.
//
// PSEUDOCODE:
//   Start
//     Move 1 to number
//     Repeat 150 times:
//       If number is an even number
//         Display number
//       End-if
//       Add 1 to number
//     End repeat
//   End-Start
// =========================================================================
    static void pseudoExample2() {
        int number = 1;                        // Move 1 to number

        for (int i = 0; i < 150; i++) {        // Repeat 150 times
            if (number % 2 == 0) {             // If number is even (no remainder when divided by 2)
                System.out.print(number + " ");
            }
            number = number + 1;               // Add 1 to number
        }
        System.out.println();
    }


    // =========================================================================
// 1.1  What is the output of the following Pseudocode?
//
// PSEUDOCODE:
//   Move 1 to i
//   Repeat 4 times:
//     Display i
//     i = i + 1
//   End-repeat
//
// TRUTH TABLE:
//   Iteration | i before display | Output | i after +1
//       1     |        1         |   1    |     2
//       2     |        2         |   2    |     3
//       3     |        3         |   3    |     4
//       4     |        4         |   4    |     5
//
// Output: 1  2  3  4
// =========================================================================
    static void q1_1() {
        int i = 1;                            // Move 1 to i

        for (int count = 0; count < 4; count++) {   // Repeat 4 times
            System.out.println(i);            // Display i
            i = i + 1;                        // i = i + 1
        }
    }


    // =========================================================================
// 1.2  What will change if you swop the lines "Display i" and "i = i + 1"?
//      (The loop will still repeat 4 times; you did not change any
//       parameters that control the loop.)
//
// Answer: i increments BEFORE it is displayed, so output starts at 2.
//
// PSEUDOCODE:
//   Move 1 to i
//   Repeat 4 times:
//     i = i + 1      <- now FIRST
//     Display i      <- now SECOND
//   End-repeat
//
// Output: 2  3  4  5
// =========================================================================
    static void q1_2() {
        int i = 1;

        for (int count = 0; count < 4; count++) {
            i = i + 1;                        // increment FIRST
            System.out.println(i);            // then display
        }
    }


    // =========================================================================
// 1.3  What will the output be if you repeat the line "Display i"
//      before AND after "i = i + 1"?
//
// PSEUDOCODE:
//   Move 1 to i
//   Repeat 4 times:
//     Display i          <- before
//     i = i + 1
//     Display i          <- after
//   End-repeat
//
// Output: 1 2  2 3  3 4  4 5
// =========================================================================
    static void q1_3() {
        int i = 1;

        for (int count = 0; count < 4; count++) {
            System.out.println(i);            // display BEFORE increment
            i = i + 1;
            System.out.println(i);            // display AFTER increment
        }
    }


    // =========================================================================
// 1.4  What is the output of the following Pseudocode?
//
// PSEUDOCODE:
//   Move 2 to i
//   Repeat while i <= 10:
//     Display i
//     i = i + 2
//   End-repeat
//
// TRUTH TABLE:
//   i  | Display | i after +2
//   2  |    2    |     4
//   4  |    4    |     6
//   6  |    6    |     8
//   8  |    8    |    10
//   10 |   10    |    12   <- 12 > 10 so loop ends
//
// Output: 2  4  6  8  10
// =========================================================================
    static void q1_4() {
        int i = 2;                            // Move 2 to i

        while (i <= 10) {                     // Repeat while i <= 10
            System.out.print(i + " ");        // Display i
            i = i + 2;                        // i = i + 2
        }
        System.out.println();
    }


    // =========================================================================
// 1.5  What will happen if you delete the line "i = i + 2"?
//      (What is this error called?)
//
// Answer: i never changes so the condition (i <= 10) is always true.
//         The loop runs forever. This is called an INFINITE LOOP.
//         In IntelliJ: press the red stop button to terminate it.
// =========================================================================
    static void q1_5() {
        System.out.println("1.5 Answer: Deleting 'i = i + 2' causes an INFINITE LOOP.");
        System.out.println("           i stays at 2 forever -- i <= 10 is always true.");
        System.out.println("           In IntelliJ press the red stop button to end it.");
    }


    // =========================================================================
// 1.6  Change the program to display the following output: 4, 6, ... 12
// =========================================================================
    static void q1_6() {
        int i = 4;                            // start at 4

        while (i <= 12) {                     // stop after 12
            System.out.print(i + " ");
            i = i + 2;                        // step by 2
        }
        System.out.println();
        // Output: 4  6  8  10  12
    }


    // =========================================================================
// 1.7  Change the program to display the following output: 3, 6, 9, 12, 15
// =========================================================================
    static void q1_7() {
        int i = 3;                            // start at 3

        while (i <= 15) {                     // stop after 15
            System.out.print(i + " ");
            i = i + 3;                        // step by 3
        }
        System.out.println();
        // Output: 3  6  9  12  15
    }


    // =========================================================================
// 1.10  a) What is the function of this Code?
//           Answer: Loops through numbers 1-10 and counts how many are
//                   even and how many are odd.
//       b) Validate your assumption by completing the truth table.
//       Can you correct the error?
//       Display the number of times (1) an even number and
//       (2) an odd number occurred.
//       Display the SUM of the odd numbers.
//       Tip: it is much the same as displaying the NUMBER of odd numbers
//            but you should NOT add "1" -- you should add the value itself.
//
// TRUTH TABLE (i goes from 1 to 10):
//   i  | even? | countEven | countOdd | sumOdd
//   1  |  no   |     0     |    1     |    1
//   2  |  yes  |     1     |    1     |    1
//   3  |  no   |     1     |    2     |    4
//   4  |  yes  |     2     |    2     |    4
//   5  |  no   |     2     |    3     |    9
//   6  |  yes  |     3     |    3     |    9
//   7  |  no   |     3     |    4     |   16
//   8  |  yes  |     4     |    4     |   16
//   9  |  no   |     4     |    5     |   25
//  10  |  yes  |     5     |    5     |   25
// =========================================================================
    static void q1_10() {
        int countEven = 0;    // count how many even numbers appear
        int countOdd  = 0;    // count how many odd numbers appear
        int sumOdd    = 0;    // running total of the odd numbers

        // Print the truth table header
        System.out.printf("%-4s %-6s %-12s %-12s %-8s%n",
                "i", "even?", "countEven", "countOdd", "sumOdd");
        System.out.println("------------------------------------------");

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                // i is even
                countEven = countEven + 1;
            } else {
                // i is odd
                countOdd = countOdd + 1;
                sumOdd   = sumOdd + i;    // add the VALUE of i, not just 1
            }

            System.out.printf("%-4d %-6s %-12d %-12d %-8d%n",
                    i, (i % 2 == 0 ? "yes" : "no"), countEven, countOdd, sumOdd);
        }

        System.out.println();
        System.out.println("Even numbers occurred : " + countEven + " times");
        System.out.println("Odd  numbers occurred : " + countOdd  + " times");
        System.out.println("Sum of odd numbers    : " + sumOdd);
    }


    // =========================================================================
// 1 a)  Execute (run) the following code.
//
//   public class Main {
//     public static void main(String[] args) {
//       int size = 6;
//       for (int i = 1; i <= size; i = i + 1) {
//         System.out.println(i);
//       }
//     }
//   }
// =========================================================================
    static void q1a() {
        int size = 6;

        for (int i = 1; i <= size; i = i + 1) {
            System.out.println(i);
        }
    }


    // =========================================================================
// 1 a)  Change: display the numbers 1 to 10.
// =========================================================================
    static void q1a_1to10() {
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


    // =========================================================================
// 1 a)  Change: display the numbers 3 to 11.
// =========================================================================
    static void q1a_3to11() {
        for (int i = 3; i <= 11; i = i + 1) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


    // =========================================================================
// 1 a)  Change: display the even numbers from 0 to 18.
// =========================================================================
    static void q1a_even() {
        for (int i = 0; i <= 18; i = i + 2) {   // step by 2 to only land on even numbers
            System.out.print(i + " ");
        }
        System.out.println();
    }


    // =========================================================================
// 1 a)  Change: display the odd numbers between 0 and 18.
// =========================================================================
    static void q1a_odd() {
        for (int i = 1; i <= 18; i = i + 2) {   // start at 1 (first odd), step by 2
            System.out.print(i + " ");
        }
        System.out.println();
    }


    // =========================================================================
// 1 a)  Change: display all multiples of 7 between 0 and 100.
// =========================================================================
    static void q1a_multiples7() {
        for (int i = 7; i <= 100; i = i + 7) {  // start at 7, step by 7
            System.out.print(i + " ");
        }
        System.out.println();
    }


    // =========================================================================
// 1 b)  Change the code so that it will display the numbers 7 to 1
//       in declining sequence.
//       Output: 7654321
// =========================================================================
    static void q1b() {
        // Count DOWN from 7 to 1 -- use i = i - 1 to decrease
        for (int i = 7; i >= 1; i = i - 1) {
            System.out.print(i);   // print (not println) so all numbers are on one line
        }
        System.out.println();      // move to next line at the very end
    }


    // =========================================================================
// 1 c)  Run the following code:
//
//   int size = 6;
//   int occurred = 0;
//   for (int i = 1; i <= size; i++) {
//     System.out.println(i);
//     occurred = occurred + 1;
//   }
//   System.out.println("A number were displayed : " + occurred + " times");
//
//   The example adds up the number of occurrences.
// =========================================================================
    static void q1c() {
        int size     = 6;
        int occurred = 0;           // tracks how many numbers were displayed

        for (int i = 1; i <= size; i++) {
            System.out.println(i);
            occurred = occurred + 1;    // add 1 each time a number is shown
        }

        System.out.println("A number were displayed : " + occurred + " times");
    }


    // =========================================================================
// 1 b1)  Add another variable "sum" and display the sum of the variables
//        that were displayed.
//        {Much the same as "occurred" but you should not add 1 --
//         you should add the value that was displayed.}
// =========================================================================
    static void q1b1() {
        int size     = 6;
        int occurred = 0;
        int sum      = 0;           // NEW: will hold the total of all displayed numbers

        for (int i = 1; i <= size; i++) {
            System.out.println(i);
            occurred = occurred + 1;
            sum      = sum + i;     // add the actual value displayed (not just 1)
        }

        System.out.println("A number were displayed : " + occurred + " times");
        System.out.println("Sum of the numbers      : " + sum);
    }


    // =========================================================================
// 2.  Run the following code:
//
//   import java.util.Random;
//   public class Main {
//     public static void main(String[] args) {
//       Random rand = new Random();
//       for (int i = 1; i <= 10; i++) {
//         int myNumber = rand.nextInt(100);
//         System.out.println(myNumber);
//       }
//     }
//   }
//
//   rand.nextInt(100) produces a random whole number from 0 to 99
// =========================================================================
    static void q2() {
        for (int i = 1; i <= 10; i++) {
            int myNumber = rand.nextInt(100);   // 0 to 99
            System.out.println(myNumber);
        }
    }


    // =========================================================================
// 2.  Change: display random numbers 0 to 10 (Not 0 to 100)
//     rand.nextInt(11) gives 0 to 10 (11 possible values: 0,1,2,...,10)
// =========================================================================
    static void q2_0to10() {
        for (int i = 1; i <= 10; i++) {
            int myNumber = rand.nextInt(11);    // 0 to 10
            System.out.print(myNumber + " ");
        }
        System.out.println();
    }


    // =========================================================================
// 2.  Change: display random numbers 1 to 10
//     rand.nextInt(10) gives 0-9, adding 1 shifts it to 1-10
// =========================================================================
    static void q2_1to10() {
        for (int i = 1; i <= 10; i++) {
            int myNumber = rand.nextInt(10) + 1;   // 0-9 + 1 = 1 to 10
            System.out.print(myNumber + " ");
        }
        System.out.println();
    }


    // =========================================================================
// 2.  Change: display random numbers 1 to 20
// =========================================================================
    static void q2_1to20() {
        for (int i = 1; i <= 10; i++) {
            int myNumber = rand.nextInt(20) + 1;   // 0-19 + 1 = 1 to 20
            System.out.print(myNumber + " ");
        }
        System.out.println();
    }


    // =========================================================================
// 2.  Change: display random numbers -5 to 5
//     rand.nextInt(11) gives 0-10, subtracting 5 shifts it to -5 to 5
// =========================================================================
    static void q2_neg5to5() {
        for (int i = 1; i <= 10; i++) {
            int myNumber = rand.nextInt(11) - 5;   // 0-10 - 5 = -5 to 5
            System.out.print(myNumber + " ");
        }
        System.out.println();
    }


    // =========================================================================
// 2.  Change: display random numbers -20 to 20
// =========================================================================
    static void q2_neg20to20() {
        for (int i = 1; i <= 10; i++) {
            int myNumber = rand.nextInt(41) - 20;  // 0-40 - 20 = -20 to 20
            System.out.print(myNumber + " ");
        }
        System.out.println();
    }


    // =========================================================================
// 2 a.  Write a program that will display 7 random numbers,
//       the values must be from 5 to 10.
// =========================================================================
    static void q2a() {
        for (int i = 1; i <= 7; i++) {
            int myNumber = rand.nextInt(6) + 5;    // 0-5 + 5 = 5 to 10
            System.out.println(myNumber);
        }
    }


    // =========================================================================
// 2 b.  Write a program that will display 10 random numbers
//       and then the sum of the numbers.
// =========================================================================
    static void q2b() {
        int sum = 0;                   // will hold the running total

        for (int i = 1; i <= 10; i++) {
            int myNumber = rand.nextInt(100);
            System.out.println(myNumber);
            sum = sum + myNumber;      // add each number to sum
        }

        System.out.println("Sum: " + sum);
    }


    // =========================================================================
// 2 c.  Also display the average of the numbers.
// =========================================================================
    static void q2c() {
        int sum = 0;

        System.out.print("Numbers: ");
        for (int i = 1; i <= 10; i++) {
            int myNumber = rand.nextInt(100);
            System.out.print(myNumber + " ");
            sum = sum + myNumber;
        }

        System.out.println();
        System.out.println("Sum    : " + sum);
        // Divide by 10.0 (not 10) so Java gives a decimal answer
        System.out.printf("Average: %.2f%n", sum / 10.0);
    }


    // =========================================================================
// 3.  Execute the following code (IF / ELSE section).
//     Change the code so that it will:
//     - Display the average of the numbers smaller than 50
//     - And the average of the numbers greater or equal to 50
//     - And the average of all the numbers.
// =========================================================================
    static void q3_averages() {
        int sumSmall   = 0;    // total of numbers < 50
        int countSmall = 0;    // how many numbers < 50
        int sumLarge   = 0;    // total of numbers >= 50
        int countLarge = 0;    // how many numbers >= 50
        int sumAll     = 0;    // total of ALL numbers

        for (int i = 1; i <= 10; i++) {
            int myNum = rand.nextInt(100);   // random number 0-99
            sumAll = sumAll + myNum;

            if (myNum < 50) {
                sumSmall   = sumSmall + myNum;
                countSmall = countSmall + 1;
            } else {
                sumLarge   = sumLarge + myNum;
                countLarge = countLarge + 1;
            }
        }

        // Guard against dividing by zero
        double avgSmall = (countSmall > 0) ? (double) sumSmall / countSmall : 0;
        double avgLarge = (countLarge > 0) ? (double) sumLarge / countLarge : 0;
        double avgAll   = sumAll / 10.0;

        System.out.printf("Average of numbers smaller than 50 : %.2f%n", avgSmall);
        System.out.printf("Average of numbers >= 50           : %.2f%n", avgLarge);
        System.out.printf("Average of all numbers             : %.2f%n", avgAll);
    }


    // =========================================================================
// 4b)  Write a program that display 10 random numbers between -10 to 10
//      (including). And then display how many numbers were negative.
// =========================================================================
    static void q4b() {
        int negCount = 0;              // count of negative numbers

        for (int i = 1; i <= 10; i++) {
            int myNum = rand.nextInt(21) - 10;   // 0-20 - 10 = -10 to 10
            System.out.println(myNum);

            if (myNum < 0) {
                negCount = negCount + 1;   // count it if negative
            }
        }

        System.out.println("Number of negative numbers: " + negCount);
    }


    // =========================================================================
// 4c)  Write a program that will create a random number myRand (5-10)
//      and then display the numbers 1 to myRand.
//      e.g. If the value is 4, the output must be:
//      1
//      2
//      3
//      4
// =========================================================================
    static void q4c() {
        int myRand = rand.nextInt(6) + 5;    // 0-5 + 5 = 5 to 10

        System.out.println("myRand = " + myRand);

        for (int i = 1; i <= myRand; i++) {
            System.out.println(i);
        }
    }


    // =========================================================================
// 4d)  Write a program that will create a random number myRand (3-6)
//      and then display the numbers 1 to myRand and after that
//      the numbers myRand to 1.
//      e.g. If the value is 4, the output must be:
//      1
//      2
//      3
//      4
//      4
//      3
//      2
//      1
// =========================================================================
    static void q4d() {
        int myRand = rand.nextInt(4) + 3;    // 0-3 + 3 = 3 to 6

        System.out.println("myRand = " + myRand);

        // Count UP: 1 to myRand
        for (int i = 1; i <= myRand; i++) {
            System.out.println(i);
        }

        // Count DOWN: myRand back to 1
        for (int i = myRand; i >= 1; i--) {
            System.out.println(i);
        }
    }


    // =========================================================================
// 4e)  Change the program so that the highest number will not be duplicated.
//      e.g. If value is 4:
//      1
//      2
//      3
//      4
//      3    <- note: 4 does NOT appear again
//      2
//      1
// =========================================================================
    static void q4e() {
        int myRand = rand.nextInt(4) + 3;

        System.out.println("myRand = " + myRand);

        // Count UP: 1 to myRand
        for (int i = 1; i <= myRand; i++) {
            System.out.println(i);
        }

        // Count DOWN: start at myRand - 1 (so we skip the peak number)
        for (int i = myRand - 1; i >= 1; i--) {
            System.out.println(i);
        }
    }


    // =========================================================================
// 4f)  Write a program that will create a random number myRand (3-9)
//      and then display the numbers 1 to myRand and next to it
//      the numbers in reverse sequence.
//      e.g. If the value is 4, the output must be:
//      1  4
//      2  3
//      3  2
//      4  1
// =========================================================================
    static void q4f() {
        int myRand = rand.nextInt(7) + 3;    // 0-6 + 3 = 3 to 9

        System.out.println("myRand = " + myRand);

        for (int i = 1; i <= myRand; i++) {
            // Left column counts up, right column counts down
            // When i=1, right = myRand; when i=2, right = myRand-1; etc.
            int rightCol = myRand - i + 1;
            System.out.println(i + "\t" + rightCol);
        }
    }


    // =========================================================================
// 5.  Execute the following code:
//     (Generate 6 random numbers; print "Even" after each even number)
// =========================================================================
    static void q5() {
        int size = 6;

        for (int i = 1; i <= size; i++) {
            int myNum = rand.nextInt(100);
            System.out.println(myNum);

            if (myNum % 2 == 0) {       // % gives remainder; 0 remainder means divisible
                System.out.println("Even");
            }
        }
    }


    // =========================================================================
// 5b)  Change the program so that it will display 10 random numbers
//      (values 1-40) and to the right of each even number "(Even)" and
//      to the right of each odd number "(Odd)".
//      e.g.  7 (Odd)
//            19 (Odd)
//            12 (Even)
//            15 (Odd)
//            44 (Even)
//            46 (Even)
// =========================================================================
    static void q5b() {
        for (int i = 1; i <= 10; i++) {
            int num = rand.nextInt(40) + 1;    // 1 to 40

            if (num % 2 == 0) {
                System.out.println(num + " (Even)");
            } else {
                System.out.println(num + " (Odd)");
            }
        }
    }


    // =========================================================================
// 5c)  Write a program that will generate and display 10 random numbers
//      and if the number is divisible by 2 or 3, display the number
//      and "two" or "three" behind it.
//      e.g.  3 (Three)
//            6 (Two)
//            6 (Three)
//            2 (Two)
//
//      Note: 6 is divisible by BOTH 2 and 3, so it gets both labels.
//            That is why we use two separate if statements (not if-else).
// =========================================================================
    static void q5c() {
        for (int i = 1; i <= 10; i++) {
            int num = rand.nextInt(100);
            System.out.print(num);

            if (num % 2 == 0) {
                System.out.print(" (Two)");
            }
            if (num % 3 == 0) {
                System.out.print(" (Three)");
            }

            System.out.println();    // move to next line after each number
        }
    }


    // =========================================================================
// 6.  Execute the following code.
//     (6 randoms 2-21; display "Correct" if divisible by 2 OR 3)
// =========================================================================
    static void q6() {
        int size = 6;

        for (int i = 1; i <= size; i++) {
            int myNum = rand.nextInt(20) + 2;    // 0-19 + 2 = 2 to 21

            if (myNum % 2 == 0 || myNum % 3 == 0) {
                System.out.println(myNum + " Correct");
            } else {
                System.out.println(myNum);
            }
        }
    }


    // =========================================================================
// 6a)  This program displays values that are divisible by 2 or 3.
//      Change the program so that it will display "Correct" only after
//      values that are divisible by 2 AND 3.
// =========================================================================
    static void q6a() {
        int size = 6;

        for (int i = 1; i <= size; i++) {
            int myNum = rand.nextInt(20) + 2;

            // Both conditions must be true -- change || (or) to && (and)
            if (myNum % 2 == 0 && myNum % 3 == 0) {
                System.out.println(myNum + " Correct");
            } else {
                System.out.println(myNum);
            }
        }
    }


    // =========================================================================
// 6b)  Change the program so that it will display "Correct" after values
//      that are divisible by (2 and 3) or (2 and 5).
// =========================================================================
    static void q6b() {
        int size = 6;

        for (int i = 1; i <= size; i++) {
            int myNum = rand.nextInt(20) + 2;

            // Split into two clear boolean variables to make the logic readable
            boolean divBy2and3 = (myNum % 2 == 0 && myNum % 3 == 0);
            boolean divBy2and5 = (myNum % 2 == 0 && myNum % 5 == 0);

            if (divBy2and3 || divBy2and5) {
                System.out.println(myNum + " Correct");
            } else {
                System.out.println(myNum);
            }
        }
    }


    // =========================================================================
// 6c)  Write a program that will generate 10 random numbers with values
//      smaller than 100. Display "Small" (0-33), "Average" (34-66),
//      or "Large" (67-99) next to each value.
// =========================================================================
    static void q6c() {
        for (int i = 1; i <= 10; i++) {
            int num = rand.nextInt(100);     // 0 to 99

            if (num <= 33) {
                System.out.println(num + " Small");
            } else if (num <= 66) {
                System.out.println(num + " Average");
            } else {
                System.out.println(num + " Large");
            }
        }
    }


    // =========================================================================
// 7.  Execute the JAVA program and then do the following tasks.
//     Produce the following result on any number given from 1 to 9.
//     (Star triangle -- the base nested loop program)
// =========================================================================
    static void q7() {
        int size = rand.nextInt(6) + 2;   // random size 2 to 7

        System.out.println("Size = " + size);

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");   // print one star per j
            }
            System.out.println();         // new line after each row
        }
    }


    // =========================================================================
// 7 b)  Produce: row i has the digit i repeated i times
//       1
//       2 2
//       3 3 3
//       4 4 4 4
// =========================================================================
    static void q7b() {
        int size = 4;

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%-2d", i);   // print i (the row number), not j
            }
            System.out.println();
        }
    }


    // =========================================================================
// 7 c)  Produce: row i prints 1 2 3 ... i
//       1
//       1 2
//       1 2 3
//       1 2 3 4
// =========================================================================
    static void q7c() {
        int size = 4;

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%-2d", j);   // print j (which counts from 1 to i)
            }
            System.out.println();
        }
    }


    // =========================================================================
// 7 d)  Produce: each row prints the same number repeated size times
//       1 1 1 1
//       2 2 2 2
//       3 3 3 3
//       4 4 4 4
// =========================================================================
    static void q7d() {
        int size = 4;

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {   // inner loop ALWAYS runs size times
                System.out.printf("%-2d", i);
            }
            System.out.println();
        }
    }


    // =========================================================================
// 7 e)  Every cell shows the input value in a triangle.
//       If 2 is entered:       If 4 is entered:
//       2                      4
//       2 2                    4 4
//                              4 4 4
//                              4 4 4 4
// =========================================================================
    static void q7e() {
        // Demonstrate with the two values from the document: 2 and 4
        for (int value : new int[]{2, 4}) {
            System.out.println("Value = " + value + ":");

            for (int i = 1; i <= value; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.printf("%-2d", value);   // print value each time (not i or j)
                }
                System.out.println();
            }
        }
    }


    // =========================================================================
// 7 f)  Diamond: ascending then descending
//       1
//       2 2
//       3 3 3
//       4 4 4 4
//       3 3 3
//       2 2
//       1
// =========================================================================
    static void q7f() {
        int size = 4;

        // Top half: count UP from 1 to size
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) System.out.printf("%-2d", i);
            System.out.println();
        }

        // Bottom half: count DOWN from size-1 to 1 (skip the peak to avoid duplication)
        for (int i = size - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) System.out.printf("%-2d", i);
            System.out.println();
        }
    }


    // =========================================================================
// 7 g)  Print grid of coordinates
//       (1,1) (1,2) (1,3) (1,4)
//       (2,1) (2,2) (2,3) (2,4)
//       (3,1) (3,2) (3,3) (3,4)
//       (4,1) (4,2) (4,3) (4,4)
// =========================================================================
    static void q7g() {
        int size = 4;

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.printf("(%d,%d) ", i, j);
            }
            System.out.println();
        }
    }


    // =========================================================================
// 7.  Execute the JAVA program. (Strings section)
//     Reads a name and displays each letter on a new line.
// =========================================================================
    static void q7_strings() {
        static void q7_strings() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your name ");
            String name = sc.nextLine();

            System.out.println("You entered: " + name);
            System.out.println("Each letter:");

            // name.length() = number of characters; charAt(i) gets character at position i
            for (int letter = 0; letter < name.length(); letter++) {
                System.out.println(name.charAt(letter));
            }
        }


        // =========================================================================
// 7 a)  Change the program so that it will display two columns:
//       the 1st column the letters as typed,
//       the 2nd column in reverse order.
//       e.g. if the word is "with", the output should be:
//       w  h
//       i  t
//       t  i
//       h  w
// =========================================================================
        static void q7a_strings() {
            String name = "with";    // in the real program: read from Scanner

            System.out.println("Name: " + name);

            int len = name.length();

            for (int i = 0; i < len; i++) {
                char leftChar  = name.charAt(i);              // forward direction
                char rightChar = name.charAt(len - 1 - i);   // from the end, counting inward
                System.out.println(leftChar + "  " + rightChar);
            }
        }


        // =========================================================================
// 7 b)  Write a program that will read a name and count and display
//       the number of times the letters a, e, o occur in the name.
//       Read Name
//       Repeat Name.length times (FOR)
//         If name.charAt(i) = 'a'  countA++
// =========================================================================
        static void q7b_strings() {
            String name = "Josephine";   // in the real program: read from Scanner

            System.out.println("Name: " + name);

            int countA = 0;
            int countE = 0;
            int countO = 0;

            for (int i = 0; i < name.length(); i++) {
                // Convert to lowercase so 'A' and 'a' both count
                char c = Character.toLowerCase(name.charAt(i));

                if (c == 'a') {
                    countA = countA + 1;
                } else if (c == 'e') {
                    countE = countE + 1;
                } else if (c == 'o') {
                    countO = countO + 1;
                }
            }

            System.out.println("a: " + countA);
            System.out.println("e: " + countE);
            System.out.println("o: " + countO);
        }


        // =========================================================================
// 8.  Execute the JAVA program.
//     (Math quiz -- 3 addition questions; interactive)
// =========================================================================
        static void q8() {
            Scanner scanner = new Scanner(System.in);
            int score = 0;

            for (int i = 1; i <= 3; i++) {
                int num1   = rand.nextInt(20) + 1;   // 1 to 20
                int num2   = rand.nextInt(20) + 1;
                int answer = num1 + num2;

                System.out.print("Question " + i + ": What is " + num1 + " + " + num2 + "? ");
                int userAnswer = scanner.nextInt();

                if (userAnswer == answer) {
                    System.out.println("Correct!");
                    score = score + 1;
                } else {
                    System.out.println("Wrong. The correct answer was " + answer + ".");
                }
            }

            System.out.println("Quiz complete! You got " + score + " out of 3 correct.");
        }


        // =========================================================================
// 8 a)  Make the program more user friendly.
//       - Ask for a name and mention the player's name with comments.
//       - Also ask if the person wants to play again and allow to
//         play again -- you will need while for this.
// =========================================================================
        static void q8a() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter your name: ");
            String playerName = scanner.nextLine();

            boolean playAgain = true;

            while (playAgain) {
                int score = 0;

                for (int i = 1; i <= 3; i++) {
                    int num1   = rand.nextInt(20) + 1;
                    int num2   = rand.nextInt(20) + 1;
                    int answer = num1 + num2;

                    System.out.print("Question " + i + ", " + playerName
                            + ": What is " + num1 + " + " + num2 + "? ");
                    int userAnswer = scanner.nextInt();

                    if (userAnswer == answer) {
                        System.out.println("Well done " + playerName + "! Correct!");
                        score = score + 1;
                    } else {
                        System.out.println("Wrong. The correct answer was " + answer + ".");
                    }
                }

                System.out.println(playerName + ", you scored " + score + " out of 3.");
                scanner.nextLine();   // clear the leftover newline from nextInt()
                System.out.print("Do you want to play again? (yes/no): ");
                String reply = scanner.nextLine().trim().toLowerCase();
                playAgain = reply.equals("yes") || reply.equals("y");
            }

            System.out.println("Thanks for playing!");
        }


        // =========================================================================
// 8 b)  Also:
//       - Add subtraction and multiplication to the program.
//       - Use a random number to decide which one of the three must be asked.
//       - Also add negative numbers (e.g. -1 x 3).
//       - How will you add division and be sure the answer is a whole number?
//         Answer: pick the whole-number answer first, then multiply to get
//         the dividend (e.g. answer=5, divisor=3, dividend=15).
//       - How will you ensure Multiply will be in the same range as Add?
//         Answer: use the same max values for both operands.
// =========================================================================
        static void q8b() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter your name: ");
            String playerName = scanner.nextLine();

            boolean playAgain = true;

            while (playAgain) {
                int score = 0;

                for (int i = 1; i <= 5; i++) {
                    int op = rand.nextInt(3);  // 0 = add, 1 = subtract, 2 = multiply

                    int    a, b, correct;
                    String question;

                    if (op == 0) {
                        // Addition
                        a        = rand.nextInt(20) + 1;
                        b        = rand.nextInt(20) + 1;
                        correct  = a + b;
                        question = a + " + " + b;
                    } else if (op == 1) {
                        // Subtraction
                        a        = rand.nextInt(20) + 1;
                        b        = rand.nextInt(20) + 1;
                        correct  = a - b;
                        question = a + " - " + b;
                    } else {
                        // Multiplication -- allow negatives (e.g. -1 x 3)
                        a        = rand.nextInt(11) - 3;   // -3 to 7
                        b        = rand.nextInt(11) - 3;
                        correct  = a * b;
                        question = a + " x " + b;
                    }

                    System.out.print("Q" + i + " [" + playerName + "]: " + question + " = ");
                    int userAnswer = scanner.nextInt();

                    if (userAnswer == correct) {
                        System.out.println("Correct!");
                        score = score + 1;
                    } else {
                        System.out.println("Wrong. Answer: " + correct);
                    }
                }

                System.out.println(playerName + ": " + score + " out of 5.");
                scanner.nextLine();
                System.out.print("Play again? (yes/no): ");
                playAgain = scanner.nextLine().trim().toLowerCase().startsWith("y");
            }
        }


        // =========================================================================
// 9.  Execute the following JAVA program:
//
//   int[] myNumbers = new int[10];
//   for (int idx1 = 0; idx1 < 10; idx1++) {
//     myNumbers[idx1] = rand.nextInt(1000);
//   }
//   for (int idx2 = 0; idx2 < 10; idx2++) {
//     System.out.println(myNumbers[idx2]);
//   }
//
//   An array is a list of values stored under one name.
//   new int[10] creates space for 10 integers (index 0 to 9).
// =========================================================================
        static void q9() {
            int[] myNumbers = new int[10];   // declare an array that holds 10 numbers

            // Loop 1: fill the array
            for (int idx1 = 0; idx1 < 10; idx1++) {
                myNumbers[idx1] = rand.nextInt(1000);   // 0 to 999
            }

            // Loop 2: display the array
            for (int idx2 = 0; idx2 < 10; idx2++) {
                System.out.println(myNumbers[idx2]);
            }
        }


        // =========================================================================
// 9 a)  Write a Java program that will:
//       - put 10 random numbers in an array and display them on one line
//       - and then display the even numbers on the next line
//       - it must also sum the even numbers in the array
//       - and at the end display the total of the even numbers.
//       e.g. All:  8  7  5  1  2  2  1  8  0  9
//            Even: 2  2  0  8
//            Sum:  12
// =========================================================================
        static void q9a() {
            int[] arr     = new int[10];
            int   sumEven = 0;

            // Fill the array with random numbers
            for (int i = 0; i < 10; i++) {
                arr[i] = rand.nextInt(100);
            }

            // Display all numbers on one line
            System.out.print("All:  ");
            for (int i = 0; i < 10; i++) {
                System.out.printf("%-4d", arr[i]);
            }
            System.out.println();

            // Display only even numbers; also add them to sumEven
            System.out.print("Even: ");
            for (int i = 0; i < 10; i++) {
                if (arr[i] % 2 == 0) {
                    System.out.printf("%-4d", arr[i]);
                    sumEven = sumEven + arr[i];
                }
            }
            System.out.println();

            System.out.println("Sum:  " + sumEven);
        }


        // =========================================================================
// 9 c)  Write a Java program that will:
//       - put 20 random numbers in an array
//       - sort the array
//       - display the original array and the sorted array.
//       e.g. 8  6  3  9  2  6
//            2  3  6  6  8  9
// =========================================================================
        static void q9c() {
            int[] arr = new int[20];

            // Fill with random numbers
            for (int i = 0; i < arr.length; i++) {
                arr[i] = rand.nextInt(100);
            }

            // Display original
            System.out.print("Original: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.printf("%-4d", arr[i]);
            }
            System.out.println();

            // Make a copy so the original stays untouched
            int[] sorted = arr.clone();

            // Bubble sort:
            // Each outer pass bubbles the largest unsorted value to the end.
            for (int i = 0; i < sorted.length - 1; i++) {
                for (int j = 0; j < sorted.length - 1 - i; j++) {
                    if (sorted[j] > sorted[j + 1]) {
                        // Swap the two adjacent elements
                        int temp       = sorted[j];
                        sorted[j]      = sorted[j + 1];
                        sorted[j + 1]  = temp;
                    }
                }
            }

            // Display sorted
            System.out.print("Sorted:   ");
            for (int i = 0; i < sorted.length; i++) {
                System.out.printf("%-4d", sorted[i]);
            }
            System.out.println();
        }


        // =========================================================================
// 8 a)  Execute the following Scanner + format demo (interactive).
// =========================================================================
        static void q8_scanner() {
            Scanner in      = new Scanner(System.in);
            Scanner scanner = new Scanner(System.in);

            System.out.println("Your name:");
            String name = scanner.nextLine();

            System.out.println("Number one");
            int number1 = in.nextInt();

            System.out.println("Number two");
            float number2 = in.nextInt();

            float answer = number1 / number2;

            // %s = string, %n = newline, %3d = integer in 3 chars, %6.2f = float with 2 decimals
            System.out.format("%s %n %3d %s %3.0f %s %6.2f ",
                    name, number1, "/", number2, "=", answer);
            System.out.println();
        }


        // =========================================================================
// 3 a)  Design and code a program that displays the first x multiples
//       of 2, 3, 5 and 7.
//       e.g. If 5 is given:
//       2   3   5   7
//       4   6   10  14
//       6   9   15  21
//       8   12  20  28
//       10  15  25  35
//       {Will you use For? Only one loop?}
// =========================================================================
        static void q3a(int x) {
            // One loop, four columns -- multiply each base by the row number i
            for (int i = 1; i <= x; i++) {
                System.out.printf("%-5d%-5d%-5d%-5d%n", 2*i, 3*i, 5*i, 7*i);
            }
        }


        // =========================================================================
// 3 a)  Now write a program that will display the output of every number
//       on the same line -- 2 on the 1st row, 3 on the 2nd etc.
//       e.g. 4 should give:
//       2  4  6  8
//       3  6  9  12
//       5  10 15 18
//       7  14 21 28
//       {Will you use For? Only one loop?}
// =========================================================================
        static void q3a_perRow(int x) {
            // One row per base number; inner loop multiplies by 1, 2, 3, ...x
            for (int base : new int[]{2, 3, 5, 7}) {
                for (int i = 1; i <= x; i++) {
                    System.out.printf("%-5d", base * i);
                }
                System.out.println();
            }
        }


        // =========================================================================
// 4 a)  Read a number and count up on consecutive rows,
//       display up to 6 numbers per row. When 16 is entered:
//       1  2  3  4  5  6
//       7  8  9  10 11 12
//       13 14 15
// =========================================================================
        static void q4a(int n) {
            for (int i = 1; i <= n; i++) {
                System.out.printf("%-4d", i);

                // After every 6th number, or when we reach the last number, start a new line
                if (i % 6 == 0 || i == n) {
                    System.out.println();
                }
            }
        }


        // =========================================================================
// 4 b)  Display up to 6 per row and then display the sum of the numbers.
//       When 7 is entered:
//       1  2  3  4  5  6
//       7
//       Sum: 28
// =========================================================================
        static void q4b_rows(int n) {
            int sum = 0;

            for (int i = 1; i <= n; i++) {
                System.out.printf("%-4d", i);
                sum = sum + i;

                if (i % 6 == 0 || i == n) {
                    System.out.println();
                }
            }

            System.out.println("Sum: " + sum);
        }


        // =========================================================================
// 4 c)  Display up to 6 per row and then also the sum of the numbers
//       in the row. When 16 is entered:
//       1  2  3  4  5  6  | 21
//       7  8  9  10 11 12 | 57
//       13 14 15          | 42
//       {It's OK if the sum of the last row is in the wrong column}
// =========================================================================
        static void q4c_rows(int n) {
            int rowSum = 0;

            for (int i = 1; i <= n; i++) {
                System.out.printf("%-4d", i);
                rowSum = rowSum + i;

                // End of row: print the row sum, then reset rowSum to 0
                if (i % 6 == 0 || i == n) {
                    System.out.println("| " + rowSum);
                    rowSum = 0;
                }
            }
        }


        // =========================================================================
// 4 d)  Design and write a program that will read a number and then display
//       up to 6 per row. Each row in reversed sequence. When 16 is entered:
//       6  5  4  3  2  1
//       12 11 10 9  8  7
//       15 14 13
// =========================================================================
        static void q4d_rows(int n) {
            // Process the numbers in chunks of 6
            for (int start = 1; start <= n; start = start + 6) {
                int end = Math.min(start + 5, n);   // don't go past n

                // Print this row from end down to start (reversed)
                for (int i = end; i >= start; i--) {
                    System.out.printf("%-4d", i);
                }
                System.out.println();
            }
        }


        // =========================================================================
// 4 e)  Given 2 numbers:
//       - if the 2nd is larger than the 1st, swap them around
//       then:
//       - display the sum of the even numbers between the two numbers
//       - display the average of these even numbers
// =========================================================================
        static void q4e_rows(int a, int b) {
            // Swap so that a is the smaller and b is the larger
            if (b > a) {
                int temp = a;
                a = b;
                b = temp;
            }

            System.out.println("Range: " + b + " to " + a);

            int sumEven   = 0;
            int countEven = 0;

            for (int i = b; i <= a; i++) {
                if (i % 2 == 0) {
                    sumEven   = sumEven + i;
                    countEven = countEven + 1;
                }
            }

            System.out.println("Sum of even numbers    : " + sumEven);
            System.out.printf("Average of even numbers: %.2f%n",
                    countEven > 0 ? (double) sumEven / countEven : 0);
        }


        // =========================================================================
// 5 a)  Change the program so that the random numbers will all be
//       between 10 and 50.
// =========================================================================
        static void q5a() {
            int[] myNumbers = new int[10];

            for (int idx1 = 0; idx1 < 10; idx1++) {
                myNumbers[idx1] = rand.nextInt(41) + 10;   // 0-40 + 10 = 10 to 50
            }

            for (int idx2 = 0; idx2 < 10; idx2++) {
                System.out.printf("%-4d", myNumbers[idx2]);
            }
            System.out.println();
        }


        // =========================================================================
// 5 b)  Design and write a program that will read a number "max" (1-100)
//       and then:
//       - put max random numbers into an array
//       - display the odd numbers
//       - display the numbers divisible by 7
//       - display the average of the odd numbers
//       - display the average of the numbers divisible by 7
// =========================================================================
        static void q5b_arr(int max) {
            int[] arr = new int[max];

            for (int i = 0; i < max; i++) {
                arr[i] = rand.nextInt(100);
            }

            // Display odd numbers and calculate their average
            int sumOdd   = 0;
            int countOdd = 0;

            System.out.print("Odd numbers:     ");
            for (int i = 0; i < max; i++) {
                if (arr[i] % 2 != 0) {           // not divisible by 2 = odd
                    System.out.printf("%-4d", arr[i]);
                    sumOdd   = sumOdd + arr[i];
                    countOdd = countOdd + 1;
                }
            }
            System.out.printf("%n  Average of odd: %.2f%n",
                    countOdd > 0 ? (double) sumOdd / countOdd : 0);

            // Display numbers divisible by 7 and calculate their average
            int sumDiv7   = 0;
            int countDiv7 = 0;

            System.out.print("Divisible by 7:  ");
            for (int i = 0; i < max; i++) {
                if (arr[i] % 7 == 0) {
                    System.out.printf("%-4d", arr[i]);
                    sumDiv7   = sumDiv7 + arr[i];
                    countDiv7 = countDiv7 + 1;
                }
            }
            System.out.printf("%n  Average div 7:  %.2f%n",
                    countDiv7 > 0 ? (double) sumDiv7 / countDiv7 : 0);
        }


        // =========================================================================
// 5 c)  Design and write a program that will use 3 arrays to do the following:
//       - generate 50 random numbers and put them into the 1st array
//       - search the array for numbers divisible by 3 and store in 2nd array
//       - search the array for numbers divisible by 5 and store in 3rd array
//       - display the numbers divisible by 3 first
//       - then display the numbers divisible by 5
// =========================================================================
        static void q5c_arr() {
            int[] arr1 = new int[50];   // first array: all 50 random numbers
            int[] arr2 = new int[50];   // second array: numbers divisible by 3
            int[] arr3 = new int[50];   // third array:  numbers divisible by 5

            int count2 = 0;             // how many entries went into arr2
            int count3 = 0;             // how many entries went into arr3

            // Fill arr1
            for (int i = 0; i < 50; i++) {
                arr1[i] = rand.nextInt(100);
            }

            // Search and fill arr2 and arr3
            for (int i = 0; i < 50; i++) {
                if (arr1[i] % 3 == 0) {
                    arr2[count2] = arr1[i];
                    count2 = count2 + 1;
                }
                if (arr1[i] % 5 == 0) {
                    arr3[count3] = arr1[i];
                    count3 = count3 + 1;
                }
            }

            System.out.print("Divisible by 3: ");
            for (int i = 0; i < count2; i++) System.out.printf("%-4d", arr2[i]);
            System.out.println();

            System.out.print("Divisible by 5: ");
            for (int i = 0; i < count3; i++) System.out.printf("%-4d", arr3[i]);
            System.out.println();
        }


        // =========================================================================
// 5 d)  Generate 2 random numbers x (20-100) and y (4-8).
//       - display the numbers 1 to x, displayed y per row
//       - also the sum of the numbers in the row
//       - and the sum of each column in the row below.
// =========================================================================
        static void q5d_arr() {
            int x = rand.nextInt(81) + 20;   // 20 to 100
            int y = rand.nextInt(5)  + 4;    // 4 to 8

            System.out.println("x = " + x + "  y = " + y);

            int[] colSums = new int[y];   // one running total per column
            int   col     = 0;            // tracks which column we are in
            int   rowSum  = 0;

            for (int i = 1; i <= x; i++) {
                System.out.printf("%-5d", i);
                rowSum           = rowSum + i;
                colSums[col % y] = colSums[col % y] + i;
                col              = col + 1;

                // End of row: print row sum, reset rowSum
                if (col % y == 0 || i == x) {
                    System.out.println("| " + rowSum);
                    rowSum = 0;
                }
            }

            // Print column sums
            System.out.print("ColSums: ");
            int filledCols = (x % y == 0) ? y : x % y;
            for (int i = 0; i < filledCols; i++) {
                System.out.printf("%-5d", colSums[i]);
            }
            System.out.println();
        }


        // =========================================================================
// 5 e)  Given a word, display the sum for the word where the following
//       letters are associated with each letter.
//       A=3  B=5  C=1  D=9  E=8  F=32 G=19 H=33 I=23 J=14
//       K=12 L=25 M=30 N=30 O=31 P=31 Q=17 R=16 S=24 T=20
//       U=29 V=39 W=42 X=41 Y=35 Z=26
//       e.g. "word" should display 98
//       Do this using a 2nd method. {(if/case) or Array}
//       {Is there a function to determine the position of a character in a string?}
// =========================================================================
        static void q5e_arr(String word) {
            // Letter values for A(0) to Z(25)
            int[] values = {3, 5, 1, 9, 8, 32, 19, 33, 23, 14,
                    12, 25, 30, 30, 31, 31, 17, 16, 24, 20,
                    29, 39, 42, 41, 35, 26};

            int sum = 0;

            for (int i = 0; i < word.length(); i++) {
                char c = Character.toUpperCase(word.charAt(i));   // uppercase the letter
                if (c >= 'A' && c <= 'Z') {
                    // c - 'A' converts the letter to its index: A=0, B=1, C=2, ...
                    sum = sum + values[c - 'A'];
                }
            }

            System.out.println("\"" + word + "\" = " + sum);
        }


        // =========================================================================
// 5 f)  Design and write a program that will read a character
//       and then display the ASCII value of the character.
// =========================================================================
        static void q5f_arr(char c) {
            // Casting (int) converts a char to its ASCII number
            System.out.println("'" + c + "' has ASCII value: " + (int) c);
        }


        // =========================================================================
// 5 g)  Design and write a program that will read a word
//       and then display the sum of the ASCII values of the characters.
// =========================================================================
        static void q5g_arr(String word) {
            int sum = 0;

            for (int i = 0; i < word.length(); i++) {
                sum = sum + (int) word.charAt(i);   // cast char to int = ASCII value
            }

            System.out.println("\"" + word + "\" ASCII sum = " + sum);
        }


        // =========================================================================
// 5 h)  Design and write a program that will read a sentence
//       and then display each word on a new line.
//       e.g. "This is lovely" must give:
//       This
//       is
//       lovely
// =========================================================================
        static void q5h_arr(String sentence) {
            String[] words = sentence.split(" ");   // split the sentence on spaces

            for (int i = 0; i < words.length; i++) {
                System.out.println(words[i]);
            }
        }


        // =========================================================================
// 5 i)  Design and write a program that will read in 5 numbers and display
//       them in reverse sequence. NB, no duplicate is allowed. If a number
//       is repeated, an error message must be displayed and a replacement
//       number must be read.
//       e.g. Input: 8  2  7  4  2 (duplicate!)  5
//            Output: 5  4  7  2  8
// =========================================================================
        static void q5i_arr() {
            // Demo with fixed input -- in the real program use Scanner.nextInt()
            int[] inputData = {8, 2, 7, 4, 2, 5};   // 2 is a duplicate; 5 replaces it
            int[] arr       = new int[5];
            int   count     = 0;                     // how many valid numbers stored so far
            int   inputIdx  = 0;

            while (count < 5) {
                int num = inputData[inputIdx];
                inputIdx = inputIdx + 1;

                // Check if num already exists in arr
                boolean isDuplicate = false;
                for (int i = 0; i < count; i++) {
                    if (arr[i] == num) {
                        isDuplicate = true;
                    }
                }

                if (isDuplicate) {
                    System.out.println(num + " (Duplicate number, try again)");
                } else {
                    arr[count] = num;
                    count      = count + 1;
                    System.out.println("Accepted: " + num);
                }
            }

            System.out.println("Output (reversed):");
            for (int i = count - 1; i >= 0; i--) {
                System.out.println(arr[i]);
            }
        }


        // =========================================================================
// 5 j)  Design and write a program that will read a sentence and then
//       display each word on a new line with the letters in reversed order.
//       e.g. "The man walk" must give:
//       ehT
//       nam
//       klaw
// =========================================================================
        static void q5j_arr(String sentence) {
            String[] words = sentence.split(" ");

            for (int w = 0; w < words.length; w++) {
                String word     = words[w];
                String reversed = "";

                // Build the reversed word one character at a time, starting from the end
                for (int i = word.length() - 1; i >= 0; i--) {
                    reversed = reversed + word.charAt(i);
                }

                System.out.println(reversed);
            }
        }


        // =========================================================================
// 6 a)  Design and write a program that will read a number and determine
//       if it is a prime number.
//       {A flag might be handy.}
//
//       A prime number is only divisible by 1 and itself.
//       We check divisors from 2 up to sqrt(n) -- efficient!
// =========================================================================
        static boolean isPrime(int n) {
            if (n < 2) return false;      // 0 and 1 are not prime by definition

            boolean prime = true;         // flag: assume prime until proven otherwise

            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    prime = false;        // found a divisor -- not prime
                }
            }

            return prime;
        }

        static void q6a_prime(int n) {
            if (isPrime(n)) {
                System.out.println(n + " is a prime number.");
            } else {
                System.out.println(n + " is NOT a prime number.");
            }
        }


        // =========================================================================
// 6 b)  Design and write a program that will read a number and then print
//       all smaller prime numbers.
//       {How efficient is your program?}
// =========================================================================
        static void q6b_primes(int limit) {
            System.out.print("Prime numbers smaller than " + limit + ": ");

            for (int i = 2; i < limit; i++) {
                if (isPrime(i)) {
                    System.out.print(i + " ");
                }
            }

            System.out.println();
        }


        // =========================================================================
// 6 c)  The program must also display the number of comparisons necessary
//       for each group of 5 prime numbers. Thus the number of comparisons
//       for the 1st 5 prime numbers, the second group of 5, etc.
// =========================================================================
        static void q6c_primeGroups(int limit) {
            int primeCount = 0;   // total primes found so far
            int groupComps = 0;   // comparisons used in the current group of 5

            System.out.printf("%-10s %-10s %-15s%n", "Prime", "Count", "Group Comps");
            System.out.println("-".repeat(37));

            for (int n = 2; n < limit; n++) {
                int     comps = 0;
                boolean prime = true;

                for (int i = 2; i <= Math.sqrt(n); i++) {
                    comps = comps + 1;
                    if (n % i == 0) {
                        prime = false;
                        break;
                    }
                }

                if (prime) {
                    primeCount = primeCount + 1;
                    groupComps = groupComps + comps;

                    System.out.printf("%-10d %-10d", n, primeCount);

                    // Every 5 primes, print the group comparison total and reset
                    if (primeCount % 5 == 0) {
                        System.out.printf("%-15d%n", groupComps);
                        groupComps = 0;
                    } else {
                        System.out.println();
                    }
                }
            }

            // Print the last incomplete group if any
            if (groupComps > 0) {
                System.out.println("  Last group comparisons: " + groupComps);
            }
        }


        // =========================================================================
// 6 d)  Design and write a program that will read a sum (only addition)
//       into a string[30] and then calculate and display the value.
//       e.g. "123+12" must add to 135
// =========================================================================
        static void q6d(String expr) {
            // split("\\+") splits on the + sign
            // (the \\ is needed because + has a special meaning in Java regex)
            String[] parts = expr.split("\\+");
            int sum = 0;

            for (int i = 0; i < parts.length; i++) {
                sum = sum + Integer.parseInt(parts[i].trim());   // trim removes spaces
            }

            System.out.println("\"" + expr + "\" = " + sum);
        }


        // =========================================================================
// 6 e)  Design and write a program that will read a sentence and then
//       display the number of times the characters of the alphabet occurred.
//       "A" and "a" should be handled the same.
//       e.g. "The man eat"
//       Must Display:  a: 2
//                      e: 2
//                      h: 1
//                      m: 1
//                      n: 1
//                      t: 2
// =========================================================================
        static void q6e(String sentence) {
            System.out.println("Sentence: \"" + sentence + "\"");

            int[] freq = new int[26];   // one counter per letter; index 0 = 'a', 25 = 'z'

            for (int i = 0; i < sentence.length(); i++) {
                char c = Character.toLowerCase(sentence.charAt(i));  // treat upper and lower the same
                if (c >= 'a' && c <= 'z') {
                    freq[c - 'a'] = freq[c - 'a'] + 1;   // c - 'a' gives 0-25 index
                }
            }

            // Print only the letters that appeared at least once
            for (int i = 0; i < 26; i++) {
                if (freq[i] > 0) {
                    System.out.println("  " + (char)('a' + i) + ": " + freq[i]);
                }
            }
        }


        // =========================================================================
// 6 f)  Design and write a program that will read in numbers (values 1-40)
//       until 999 is read. It must calculate the average, display each number,
//       the number of times it occurred and its "distance" from the average.
//       (Ignore 999)
//       e.g. 1, 2, 3, 2, 999 must give:
//       1, 1, -1
//       2, 2,  0
//       3, 1,  1
// =========================================================================
        static void q6f(int[] data) {
            // Step 1: calculate average (ignore 999)
            int total = 0;
            int count = 0;
            for (int i = 0; i < data.length; i++) {
                if (data[i] != 999) {
                    total = total + data[i];
                    count = count + 1;
                }
            }

            double avg = (count > 0) ? (double) total / count : 0;

            System.out.printf("Average: %.2f%n", avg);
            System.out.printf("%-8s %-10s %-10s%n", "Value", "Occurred", "Distance");
            System.out.println("-".repeat(30));

            // Step 2: for each possible value 1-40, count occurrences
            for (int v = 1; v <= 40; v++) {
                int occurrences = 0;
                for (int i = 0; i < data.length; i++) {
                    if (data[i] == v) {
                        occurrences = occurrences + 1;
                    }
                }
                if (occurrences > 0) {
                    System.out.printf("%-8d %-10d %-10.0f%n", v, occurrences, v - avg);
                }
            }
        }


        // =========================================================================
// 6 g)  Design and write a program that will read a sentence and then
//       sort the letters.
//       e.g. "he is asleep" must give "aeeehilps"
// =========================================================================
        static void q6g(String sentence) {
            // Remove spaces first so we only sort actual letters
            String noSpaces = sentence.replace(" ", "");
            char[] chars    = noSpaces.toCharArray();

            // Bubble sort the characters
            for (int i = 0; i < chars.length - 1; i++) {
                for (int j = 0; j < chars.length - 1 - i; j++) {
                    if (chars[j] > chars[j + 1]) {
                        char temp    = chars[j];
                        chars[j]     = chars[j + 1];
                        chars[j + 1] = temp;
                    }
                }
            }

            System.out.println("\"" + sentence + "\" sorted: \"" + new String(chars) + "\"");
        }


        // =========================================================================
// 6 h)  Design and write a program that will compare the effectivity of
//       different sorting methods by:
//       (1) Counting the number of times 2 values are compared
//       (2) Counting the number of times 2 numbers were swopped
//       (3) Comparing the time it takes to sort
//
//       The two possible sorting methods: Bubble sort and Shell sort.
//       1st sort ascending, 2nd sort again ascending, 3rd sort descending.
//
//       Numbers sorted: 9999
//       Method   1st sort              2nd Sort              3rd Sort
//                Comp  Swop  Time(ms)  Comp  Swop  Time(ms)  Comp  Swop  Time(ms)
//       Shell    ...
//       Bubble   ...
// =========================================================================
        static void q6h(int n) {
            // Generate random numbers
            int[] original = new int[n];
            for (int i = 0; i < n; i++) {
                original[i] = rand.nextInt(10000);
            }

            System.out.println("Numbers sorted: " + n);
            System.out.printf("%-8s %-6s %-6s %-10s %-6s %-6s %-10s %-6s %-6s %-10s%n",
                    "Method", "Comp", "Swop", "Time(ms)",
                    "Comp", "Swop", "Time(ms)",
                    "Comp", "Swop", "Time(ms)");
            System.out.println("-".repeat(90));

            // ---- BUBBLE SORT ----
            long[] bComp = new long[3];
            long[] bSwop = new long[3];
            long[] bTime = new long[3];
            int[]  bArr  = original.clone();

            for (int pass = 0; pass < 3; pass++) {
                if (pass == 1) bArr = bArr.clone();     // pass 2: sort the already-sorted array
                boolean desc = (pass == 2);              // pass 3: sort descending

                long startTime = System.currentTimeMillis();
                long comps     = 0;
                long swops     = 0;

                for (int i = 0; i < bArr.length - 1; i++) {
                    for (int j = 0; j < bArr.length - 1 - i; j++) {
                        comps = comps + 1;
                        boolean shouldSwap = desc ? bArr[j] < bArr[j+1] : bArr[j] > bArr[j+1];
                        if (shouldSwap) {
                            swops = swops + 1;
                            int temp   = bArr[j];
                            bArr[j]    = bArr[j + 1];
                            bArr[j+1]  = temp;
                        }
                    }
                }

                bComp[pass] = comps;
                bSwop[pass] = swops;
                bTime[pass] = System.currentTimeMillis() - startTime;
            }

            // ---- SHELL SORT ----
            long[] sComp = new long[3];
            long[] sSwop = new long[3];
            long[] sTime = new long[3];
            int[]  sArr  = original.clone();

            for (int pass = 0; pass < 3; pass++) {
                if (pass == 1) sArr = sArr.clone();
                boolean desc = (pass == 2);

                long startTime = System.currentTimeMillis();
                long comps     = 0;
                long swops     = 0;

                // Shell sort: start with a large gap and halve it each time
                int gap = sArr.length / 2;
                while (gap > 0) {
                    for (int i = gap; i < sArr.length; i++) {
                        int temp = sArr[i];
                        int j    = i;

                        while (j >= gap) {
                            comps = comps + 1;
                            boolean shouldMove = desc ? sArr[j - gap] < temp : sArr[j - gap] > temp;
                            if (shouldMove) {
                                swops    = swops + 1;
                                sArr[j]  = sArr[j - gap];
                                j        = j - gap;
                            } else {
                                break;
                            }
                        }
                        sArr[j] = temp;
                    }
                    gap = gap / 2;
                }

                sComp[pass] = comps;
                sSwop[pass] = swops;
                sTime[pass] = System.currentTimeMillis() - startTime;
            }

            // Print results
            System.out.printf("%-8s %-6d %-6d %-10d %-6d %-6d %-10d %-6d %-6d %-10d%n",
                    "Bubble",
                    bComp[0], bSwop[0], bTime[0],
                    bComp[1], bSwop[1], bTime[1],
                    bComp[2], bSwop[2], bTime[2]);

            System.out.printf("%-8s %-6d %-6d %-10d %-6d %-6d %-10d %-6d %-6d %-10d%n",
                    "Shell",
                    sComp[0], sSwop[0], sTime[0],
                    sComp[1], sSwop[1], sTime[1],
                    sComp[2], sSwop[2], sTime[2]);
        }


        // =========================================================================
// 2 a)  (2-dim arrays section)
//       Write a program that generates a random number x (10-50) and
//       displays the first x numbers in 2 columns.
//       1st column: numbers divisible by 3.
//       2nd column: all other numbers.
//       e.g. if 10 was generated:
//       3   1
//       6   2
//       9   4
//           5
//           7
//           8
//           10
// =========================================================================
        static void q2a_twoDim(int x) {
            int[] col1 = new int[x];   // numbers divisible by 3
            int[] col2 = new int[x];   // all other numbers
            int   c1   = 0;            // index for col1
            int   c2   = 0;            // index for col2

            for (int i = 1; i <= x; i++) {
                if (i % 3 == 0) {
                    col1[c1] = i;
                    c1       = c1 + 1;
                } else {
                    col2[c2] = i;
                    c2       = c2 + 1;
                }
            }

            System.out.printf("%-10s %s%n", "Div by 3", "Other");

            int rows = Math.max(c1, c2);   // the longer column determines the row count
            for (int i = 0; i < rows; i++) {
                String left  = (i < c1) ? String.valueOf(col1[i]) : "";
                String right = (i < c2) ? String.valueOf(col2[i]) : "";
                System.out.printf("%-10s %s%n", left, right);
            }
        }


        // =========================================================================
// 6 l)  Design a chessboard, e.g.
//       -A-B-C-D-E-F-G-H-
//       Allow the user to specify a position on the board then display
//       the position with the diagonals.
//       e.g. C3 must give all diagonal cells marked with X.
// =========================================================================
        static void q6l(char colChar, int rowNum) {
            int col = colChar - 'A';   // convert 'A'-'H' to column index 0-7
            int row = rowNum  - 1;     // convert row 1-8 to index 0-7

            char[][] board = new char[8][8];

            // Fill every cell with a dot
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    board[i][j] = '.';
                }
            }

            // Mark diagonals: a cell is on the diagonal if its row AND column
            // distances from our chosen position are equal
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    int rowDist = Math.abs(i - row);
                    int colDist = Math.abs(j - col);
                    if (rowDist == colDist && !(i == row && j == col)) {
                        board[i][j] = 'X';
                    }
                }
            }

            board[row][col] = '*';   // mark the chosen position itself

            // Print column header
            System.out.print("  -");
            for (char c = 'A'; c <= 'H'; c++) System.out.print(c + "-");
            System.out.println();

            // Print each row with its row number
            for (int i = 0; i < 8; i++) {
                System.out.print((i + 1) + " ");
                for (int j = 0; j < 8; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("  " + "-".repeat(17));
        }
    }