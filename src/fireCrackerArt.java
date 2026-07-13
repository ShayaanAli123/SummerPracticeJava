// Syed Ali
// CS 141
// HW Core Topics: for loops, nested loops, static methods, class constants
// This program uses loops and static methods to print scalable
// ASCII art of a firecracker.

public class fireCrackerArt {

    public static final int SIZE = 10;

    // This method is the main method of the program and prints 
    // each section of the firecracker.
    public static void main(String[] args) {
        cone();
        border();
        patternedSection();
        middleSection();
        patternedSection();
        border();
        cone();
    }

    // This method prints the pointed top and the
    // bottom section of the firecracker.
    public static void cone() {
        for (int line = 1; line < SIZE; line++) {
            for (int space = 1; space <= SIZE - line; space++) {
                System.out.print(" ");
            }

            System.out.print("//");

            for (int mark = 1; mark <= 2 * line - 2; mark++) {
                System.out.print("!");
            }

            System.out.println("\\\\");
        }
    }

    // This method prints a border made of plus signs and tildes.
    public static void border() {
        System.out.print("+");

        for (int tilde = 1; tilde <= 2 * SIZE; tilde++) {
            System.out.print("~");
        }

        System.out.println("+");
    }

    // This method prints the repeating diagonal pattern inside the firecracker.
    public static void patternedSection() {
        for (int line = 0; line < SIZE; line++) {
            System.out.print("[");

            for (int dash = 0; dash < line; dash++) {
                System.out.print("-");
            }

            for (int pattern = 0; pattern < SIZE - line; pattern++) {
                System.out.print("\\/");
            }

            for (int dash = 0; dash < line; dash++) {
                System.out.print("-");
            }

            System.out.println("]");
        }
    }

    // This method prints the center section containing slashes and hyphens.
    public static void middleSection() {
        for (int line = 1; line <= SIZE - 2; line++) {
            System.out.print("[");

            for (int slash = 1; slash <= SIZE - line - 1; slash++) {
                System.out.print("/");
            }

            for (int dash = 1; dash <= 2 * line + 2; dash++) {
                System.out.print("-");
            }

            for (int slash = 1; slash <= SIZE - line - 1; slash++) {
                System.out.print("\\");
            }

            System.out.println("]");
        }
    }
}

/*
    //\\
   //!!\\
  //!!!!\\
 //!!!!!!\\
+~~~~~~~~~~+
[\/\/\/\/\/]
[-\/\/\/\/-]
[--\/\/\/--]
[---\/\/---]
[----\/----]
[///----\\\]
[//------\\]
[/--------\]
[\/\/\/\/\/]
[-\/\/\/\/-]
[--\/\/\/--]
[---\/\/---]
[----\/----]
+~~~~~~~~~~+
    //\\
   //!!\\
  //!!!!\\
 //!!!!!!\\
*/