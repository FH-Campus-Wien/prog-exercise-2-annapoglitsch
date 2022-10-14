package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){
        // input your solution here
        //Scanner und Deklaration
        Scanner scan = new Scanner(System.in);
        float Eingabe;
        float Ausgabe = 0;
        int i = 1;
        //Methode
        System.out.print("Number 1: ");
        Eingabe = scan.nextFloat();

        while (Eingabe > 0) {
            i++;
            if (Eingabe > Ausgabe) {
                Ausgabe = Eingabe;
            }
            System.out.print("Number " + i + ": ");
            Eingabe = scan.nextFloat();
        }
        if (Ausgabe <= 0) {
            System.out.println("No number entered.");
        } else {
            System.out.printf("The largest number is %.2f", Ausgabe);
            System.out.println();
        }
    }


    //todo Task 2
    public void stairs(){
        // input your solution here
        Scanner scan = new Scanner(System.in);
        System.out.print("n: ");
        int rows;
        int number = 1;
        rows = scan.nextInt();

        if (rows > 0) {
            for (int x = 1; x <= rows; x++) {
                for (int i = 1; i <= x; i++) {
                    System.out.print(number++ + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Invalid number!");
        }
    }

    //todo Task 3
    public void printPyramid() {
        // input your solution here
        //
        //Weihnachtsbaum
        //
        int rows = 6;
        for (int x = 1; x <=rows ; x++) {
            for (int i = x; i < rows; i++) {
                System.out.print(" ");
            }
            for (int y = 1; y<(2*x);y++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //todo Task 4
    public void printRhombus() {

        // input your solution here
        //Quelle nicht vergessen!!!!!!
        int h;
        Scanner scan = new Scanner(System.in);
        System.out.print("h: ");
        h = scan.nextInt();
        System.out.print("c: ");
       char c = scan.next().charAt(0);


        if (h % 2 != 0) {
            for (int rows = 0; rows <= (h/2); rows++) {
                for (int spaces = rows; spaces < h/2; spaces++) {
                    System.out.print(" ");
                }
                for (int symbols = 0-rows; symbols <= rows; symbols++) {
                    System.out.print((char)(c-Math.abs(symbols)));
                }
                System.out.println();
                if (rows == h) {
                    break;
                }
            }
            for (int rows2 = (h/2) - 1; rows2 >= 0; rows2--) {
                for (int spaces2 = rows2 + 1 ; spaces2 <= h/2 ; spaces2++) {
                    System.out.print(" ");
                }
                for (int symbols2 = 0-rows2; symbols2 <= rows2; symbols2++) {
                    System.out.print((char)(c-Math.abs(symbols2)));
                }
                System.out.println();
                if (rows2 == 0) {
                    break;
                }
            }
        }
            else {
                System.out.println("Invalid number!");
            }
    }
    //todo Task 5
    public void marks() {
        // input your solution here
        Scanner scan = new Scanner(System.in);
        int grades;
        int i = 1;
        int x;
        int sum = 0;
        float sumgrades = 0;
        float interception;
        int marks = 0;

        for (int a = 1; a > 0; a++) {
            System.out.print("Mark " + i++ + ": ");
        grades = scan.nextInt();
              x = grades;

              if (x < 6 && x > 0) {
                  sumgrades += x;
                  marks++;
                  if (x == 5) {
                      sum++;
                  }
              }
            else if ( x < 0 || x > 5) {
                System.out.println("Invalid mark!");
                i--;
            }
            interception = (sumgrades) / marks;

            if (x == 0 && i != 2) {
                System.out.printf("Average: %.2f", interception);
                System.out.println();
                System.out.println("Negative marks: " + sum);
                break;
            } else if (x == 0 && i != 1) {
                System.out.println("Average: 0.00");
                System.out.println("Negative marks: " + sum);
                break;
            }
            }
        }

    //todo Task 6
    public void happyNumbers() {
        // input your solution here
        Scanner scan = new Scanner(System.in);

        System.out.print("n: ");
        int n = scan.nextInt();

        /*int hunderter = (n / 100);
        int zehner = (n / 10) % 10;
        int einer = n % 10;*/

        int Iterationsschritt1 = 0;

        while (n > 0) {

            if (n != 1 && n != 4) {
                int hunderter = (n / 100);
                int zehner = (n / 10) % 10;
                int einer = n % 10;

                Iterationsschritt1 = (hunderter * hunderter + zehner * zehner + einer * einer);
                n = Iterationsschritt1;
            }
                if (n == 4) {
                System.out.println("Sad number!");
                break;
            } else if (n==1) {
                System.out.println("Happy number!");
                break;
            }
        }

    }
    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }

    private class type {
    }
}