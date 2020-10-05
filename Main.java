import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.println("Enter your first name");
  String  userFirst = input.nextLine();
  System.out.println("Enter your last name");
  String  userLast  = input.nextLine();
  String ansOne = "";
  System.out.print("1.");
  System.out.println("A keyboard is an exapmle of which of these. (Keep in mind it's case sensitive for all questions");
  System.out.println(" A. Softwear\n B. Hard drive \n C. Acessory \n D. Hardwear");
  char  choice1  = input.next().charAt(0);

  if (choice1=='D') { 
      ansOne = "Correct";
    }

  else{
      System.out.println("Incorrect");
      ansOne="invalid selection";
    }



  System.out.print("2.");

    String ansTwo = "";
    System.out.println("What does SSD stand for.");
    System.out.println(" A. Solid State Drive \n B. Solid State Device \n C. Smart Soft Drive \n D. Sovit Superior Device");
    char  choice2  = input.next().charAt(0);

    if  (choice2=='A') { 
      ansTwo = "Correct";
    }

    else{
      System.out.println("Incorrect");
      ansTwo="invalid selection";
    } 
   
   System.out.print("3.");

    String ansThree = "";
    System.out.println("Why is an SSD superiour than aHard Drive.");
    System.out.println(" A. It's Stronger \n B. It's Faster \n C. It's Smaller \n D. It runs colder");
    char  choice3  = input.next().charAt(0);

    if (choice3=='B') { 
      ansThree = "Correct";
    }

    else if (choice3=='C') { 
      ansThree = "Correct";
    }

    else{
      System.out.println("Incorrect");
      ansThree="invalid selection";
    }

    System.out.print("4.");

    String ansFour = "";
    System.out.println("How do you input a decimal into your code.");
    System.out.println(" A.char \n B.int \n C. float \n D. String");
    char  choice4  = input.next().charAt(0);

    if (choice4=='C') { 
      ansFour = "Correct";
    }

    else{
      System.out.println("Incorrect");
      ansFour="invalid selection";
    }

    System.out.print("5.");

    String ansFive = "";
    System.out.println("_____ reduces your carbon footprint.");
    System.out.println(" A.Recycling \n B.Driving \n C. Throwing out \n D. Hoarding");
    char  choice5  = input.next().charAt(0);

    if (choice5=='A') { 
      ansFive = "Correct";
    }

    else{
      System.out.println("Incorrect");
      ansFive="invalid selection";
    }

    System.out.print("6.");

    String ansSix = "";
    System.out.println("_____ is gloabal warming.");
    System.out.println(" A. A rise in the planets average tempature \n B. Bad weather \n C. Snow \n D. Heatwaves");
    char  choice6  = input.next().charAt(0);

    if (choice6=='A') { 
      ansSix = "Correct";
    }

    else{
      System.out.println("Incorrect");
      ansSix="invalid selection";
    }

    System.out.print("7.");

    String ansSeven = "";
    System.out.println("What will this line of code output: System.out.print(\"Hi\");");
    System.out.println("A. Hello \n B. Bye \n C. Hi \n D. Bonjour");
    char  choice7  = input.next().charAt(0);

    if (choice7=='C') { 
      ansSeven = "Correct";
    }

    else{
      System.out.println("Incorrect");
      ansSeven="invalid selection";
    }

    System.out.print("8.");

    String ansEight = "";
    System.out.println("What does this operator mean: \"==\".");
    System.out.println("A. Equal to \n B. More than \n C. Less than \n D. Divided by");
    char  choice8  = input.next().charAt(0);

    if (choice8=='A') { 
      ansEight = "Correct";
    }

    else{
      System.out.println("Incorrect");
      ansEight="invalid selection";
    }




    
    













  }
}