import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your first name");
    String userFirst = input.nextLine();
    System.out.println("Enter your last name");
    String userLast = input.nextLine();
    String ansOne = "";
    System.out.print("1."); // question 1
    System.out
        .println("A keyboard is an exapmle of which of these. (Keep in mind it's case sensitive for all questions)");
    System.out.println(" A. Softwear\n B. Hard drive \n C. Acessory \n D. Hardwear");
    char choice1 = input.next().charAt(0);
    int correct = 0;

    if (choice1 == 'D') { // answer is D
      System.out.println("Correct");
      ansOne = "Correct";
      correct = correct + 1;
    }

    else {
      System.out.println("Incorrect");
      ansOne = "invalid selection";
    }

    System.out.print("2."); // question 2

    String ansTwo = "";
    System.out.println("What does SSD stand for.");
    System.out
        .println(" A. Solid State Drive \n B. Solid State Device \n C. Smart Soft Drive \n D. Sovit Superior Device");
    char choice2 = input.next().charAt(0);

    if (choice2 == 'A') { // answer is A
      System.out.println("Correct");
      ansTwo = "Correct";
      correct = correct + 1;
    }

    else {
      System.out.println("Incorrect");
      ansTwo = "invalid selection";
    }

    System.out.print("3."); // question 3

    String ansThree = "";
    System.out.println("Why is an SSD superiour than a Hard Drive.(there are 2 right answers)");
    System.out.println(" A. It's Stronger \n B. It's Faster \n C. It's Smaller \n D. It runs colder");
    char choice3 = input.next().charAt(0);

    if (choice3 == 'B') { // answer is B and C
      System.out.println("Correct");
      ansThree = "Correct";
      correct = correct + 1;
    }

    else if (choice3 == 'C') {
      System.out.println("Correct");
      ansThree = "Correct";
      correct = correct + 1;
    }

    else {
      System.out.println("Incorrect");
      ansThree = "invalid selection";
    }

    System.out.print("4."); // question 4

    String ansFour = "";
    System.out.println("How do you input a decimal into your code.");
    System.out.println(" A. char \n B. int \n C. float \n D. String");
    char choice4 = input.next().charAt(0);

    if (choice4 == 'C') { // answer is C
      System.out.println("Correct");
      ansFour = "Correct";
      correct = correct + 1;
    }

    else {
      System.out.println("Incorrect");
      ansFour = "invalid selection";
    }

    System.out.print("5."); // question 5

    String ansFive = "";
    System.out.println("_____ reduces your carbon footprint.");
    System.out.println(" A. Recycling \n B. Driving \n C. Throwing out \n D. Hoarding");
    char choice5 = input.next().charAt(0);

    if (choice5 == 'A') { // answer is A
      System.out.println("Correct");
      ansFive = "Correct";
      correct = correct + 1;
    }

    else {
      System.out.println("Incorrect");
      ansFive = "invalid selection";
    }

    System.out.print("6."); // question 6

    String ansSix = "";
    System.out.println("_____ is gloabal warming.");
    System.out.println(" A. A rise in the planets average tempature \n B. Bad weather \n C. Snow \n D. Heatwaves");
    char choice6 = input.next().charAt(0);

    if (choice6 == 'A') { // answer is A
      System.out.println("Correct");
      ansSix = "Correct";
      correct = correct + 1;
    }

    else {
      System.out.println("Incorrect");
      ansSix = "invalid selection";
    }

    System.out.print("7."); // question 7

    String ansSeven = "";
    System.out.println("What will this line of code output: System.out.print(\"Hi\");");
    System.out.println(" A. Hello \n B. Bye \n C. Hi \n D. Bonjour");
    char choice7 = input.next().charAt(0);

    if (choice7 == 'C') { // answer is C
      System.out.println("Correct");
      ansSeven = "Correct";
      correct = correct + 1;
    }

    else {
      System.out.println("Incorrect");
      ansSeven = "invalid selection";
    }

    System.out.print("8."); // question 8

    String ansEight = "";
    System.out.println("What does this operator mean: \"==\".");
    System.out.println(" A. Equal to \n B. More than \n C. Less than \n D. Divided by");
    char choice8 = input.next().charAt(0);

    if (choice8 == 'A') { // answer is A
      System.out.println("Correct");
      ansEight = "Correct";
      correct = correct + 1;
    }

    else {
      System.out.println("Incorrect");
      ansEight = "invalid selection";
    }

    System.out.print("9."); // question 9

    String ansNine = "";
    System.out.println("What is the operator : \"char\" used for");
    System.out.println(" A. A number \n B. A decimal \n C. A Character \n D. A Sentance");
    char choice9 = input.next().charAt(0);

    if (choice9 == 'C') { // answer is C
      System.out.println("Correct");
      ansNine = "Correct";
      correct = correct + 1;
    }

    else {
      System.out.println("Incorrect");
      ansNine = "invalid selection";
    }

    System.out.print("10."); // question 10

    String ansTen = "";
    System.out.println("How many gigabytes are in a terabyte(there are 2 right answers)");
    System.out.println(" A. 1000 \n B. 1500 \n C. 850 \n D. 1024");
    char choice10 = input.next().charAt(0);

    if (choice10 == 'A') { // answer is A and D
      System.out.println("Correct");
      ansTen = "Correct";
      correct = correct + 1;
    }

    else if (choice10 == 'D') {
      System.out.println("Correct");
      ansTen = "Correct";
      correct = correct + 1;
    }

    else {
      System.out.println("Incorrect");
      ansTen = "invalid selection";
    }

    System.out.println("You got " + correct + " questions right."); // how many questions correct

    float userAvg = (correct / 10f) * 100f;
    String grade = ""; // equation to find the average
    // esle if statements to give grade
    if (userAvg >= 90 && userAvg <= 100) {
      grade = "A+";
    } 
    else if (userAvg >= 85 && userAvg < 90) {
      grade = "A";
    } 
    else if (userAvg >= 80 && userAvg < 85) {
      grade = "A-";
    } 
    else if (userAvg >= 77 && userAvg < 80) {
      grade = "B+";
    } 
    else if (userAvg >= 73 && userAvg < 77) {
      grade = "B";
    } 
    else if (userAvg >= 70 && userAvg < 73) {
      grade = "B-";
    } 
    else if (userAvg >= 67 && userAvg < 70) {
      grade = "C+";
    } 
    else if (userAvg >= 63 && userAvg < 68) {
      grade = "C";
    } 
    else if (userAvg >= 60 && userAvg < 63) {
      grade = "C-";
    } 
    else if (userAvg >= 57 && userAvg < 61) {
      grade = "D+";
    } 
    else if (userAvg >= 53 && userAvg < 57) {
      grade = "D";
    } 
    else if (userAvg >= 50 && userAvg < 53) {
      grade = "D-";
    } 
    else {
      grade = "F";
    }
    System.out.println("You mark is " + grade);

  }
}