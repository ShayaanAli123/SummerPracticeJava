// Shayaan Ali
// CS 141
// HW Core Topics: static methods, printlns
// This program prints a five-verse cumulative song about writing
// and debugging a Java program, using static methods to avoid repetition of code.

public class MyCodeIsGonnaRock {

    public static void main(String[] args) {
        firstVerse();
        System.out.println();
        verseTwo();
        System.out.println();
        verseThree();
        System.out.println();
        verseFour();
        System.out.println();
        verseFive();
    }

    public static void firstVerse() {
        beginning();
        firstVerseBody();
    }

    public static void verseTwo() {
        beginning();
        secondVerseBody();
    }

    public static void verseThree() {
        beginning();
        thirdVerseBody();
    }

    public static void verseFour() {
        beginning();
        fourthVerseBody();
    }

    public static void verseFive() {
        beginning();
        fifthVerseBody();
    }

    public static void beginning() {
        System.out.println("I'm writing my program it's so much fun!");
        System.out.println("Started with stubs of methods not done.");
    }

    public static void firstVerseBody() {
        ending();
    }

    public static void secondVerseBody() {
        stringLines();
        firstVerseBody();
    }

    public static void thirdVerseBody() {
        stringLines();
        helloWorldLines();
        firstVerseBody();
    }

    public static void fourthVerseBody() {
        stringLines();
        helloWorldLines();
        semicolonLines();
        firstVerseBody();
    }

    public static void fifthVerseBody() {
        stringLines();
        helloWorldLines();
        semicolonLines();
        parenthesisLines();
        firstVerseBody();
    }

    public static void stringLines() {
        System.out.println("I declared a variable of type String.");
        System.out.println("Then used an equals to assign a value.");
    }

    public static void helloWorldLines() {
        System.out.println("I typed in \"Hello\" and after it \"World\".");
        System.out.println("Seems simple enough what could go wrong?");
    }

    public static void semicolonLines() {
        System.out.println("I typed in a semicolon to end the line.");
        System.out.println("Formatted it neatly and indented it fine.");
    }

    public static void parenthesisLines() {
        System.out.println("I typed a close paren at the end.");
        System.out.println("That matches the paren from a few lines above.");
    }

    public static void ending() {
        System.out.println("Clicked the icon and recompiled.");
        System.out.println("Syntax error \"Yikes!\" No problem I'll try again.");
    }
}

/*
I'm writing my program it's so much fun!
Started with stubs of methods not done.
Clicked the icon and recompiled.
Syntax error "Yikes!" No problem I'll try again.

I'm writing my program it's so much fun!
Started with stubs of methods not done.
I declared a variable of type String.
Then used an equals to assign a value.
Clicked the icon and recompiled.
Syntax error "Yikes!" No problem I'll try again.

I'm writing my program it's so much fun!
Started with stubs of methods not done.
I declared a variable of type String.
Then used an equals to assign a value.
I typed in "Hello" and after it "World".
Seems simple enough what could go wrong?
Clicked the icon and recompiled.
Syntax error "Yikes!" No problem I'll try again.

I'm writing my program it's so much fun!
Started with stubs of methods not done.
I declared a variable of type String.
Then used an equals to assign a value.
I typed in "Hello" and after it "World".
Seems simple enough what could go wrong?
I typed in a semicolon to end the line.
Formatted it neatly and indented it fine.
Clicked the icon and recompiled.
Syntax error "Yikes!" No problem I'll try again.

I'm writing my program it's so much fun!
Started with stubs of methods not done.
I declared a variable of type String.
Then used an equals to assign a value.
I typed in "Hello" and after it "World".
Seems simple enough what could go wrong?
I typed in a semicolon to end the line.
Formatted it neatly and indented it fine.
I typed a close paren at the end.
That matches the paren from a few lines above.
Clicked the icon and recompiled.
Syntax error "Yikes!" No problem I'll try again.
*/
