import java.util.Scanner;

/**
 * ============================================================
 *  TOPIC: while Loop  vs  do-while Loop
 * ============================================================
 *
 *  WHILE LOOP                        DO-WHILE LOOP
 *  (condition checked FIRST)         (body runs FIRST, then check)
 *
 *        ┌──────────┐                      ┌──────────┐
 *        │  START   │                      │  START   │
 *        └────┬─────┘                      └────┬─────┘
 *             │                                 │
 *        ┌────▼─────┐                      ┌────▼─────┐
 *   ┌───►│condition?│                      │ Process  │◄──┐
 *   │    └──┬────┬──┘                      └────┬─────┘   │
 *   │     f │  t │                              │         │
 *   │       │ ┌──▼──────┐                  ┌────▼─────┐   │
 *   │       │ │ Process │──────────────────►│condition?│   │
 *   │       │ └─────────┘                  └──┬────┬──┘   │
 *   └───────┘                               f │  t │      │
 *        ┌──▼──────┐                          │    └───────┘
 *        │   END   │                      ┌───▼──┐
 *        └─────────┘                      │  END │
 *                                         └──────┘
 *
 *  SYNTAX:
 *    while (condition) {        do {
 *        // statements              // statements  ← runs at least once
 *    }                          } while (condition);
 *
 *  KEY DIFFERENCE:
 *  while → condition checked first → body may run 0 or more times
 *  do-while → body runs first at least 1 time → then condition is checked to decide if it continues running (e.g food menu)
 * ============================================================
 */
public class WhileAndDoWhileLoop {

    public static void main(String[] args) {
        /*int i = 1, n = 100;
        int x = 1, y = 100;

        while (i < 100) {
            System.out.println(i);
            i = i*2;
        }

        System.out.println();
        do {
            System.out.println(x);
            x = x*2;
        } while (x < y);



        //Name Validation
        Scanner input = new Scanner(System.in);
        String name = "";

        while (name.isEmpty()) {
            System.out.print("Enter your Name: ");
            name = input.nextLine();
        }

        System.out.println("Your name is " + name);
        input.close();

        //Game Quit
        String response = "";

        Scanner in = new Scanner(System.in);
        while (!response.equals("Q")) {
            System.out.print("You are playing a game");
            System.out.println("Press Q to quit: ");
            response = in.next().toUpperCase(); //handle lower or upper cases
        }


        //Age Validation
        Scanner scanner = new Scanner(System.in);
        int age = 0;

        System.out.println("Enter your age: ");
        age = scanner.nextInt();
        
        while (age < 0) {
            System.out.println("Your age cant be negative");
            System.out.println("Enter your age: ");
            age = scanner.nextInt();
        }
        System.out.println("You are " + age + " years old");
        */

        //doWhile Version

        Scanner scanner = new Scanner(System.in);
        int age = 0;

        do {
            System.out.println("Your age cant be negative");
            System.out.println("Enter your age: ");
            age = scanner.nextInt();
        } while (age < 0);

        System.out.println("You are " + age + " years old");
        scanner.close();
    }
}
