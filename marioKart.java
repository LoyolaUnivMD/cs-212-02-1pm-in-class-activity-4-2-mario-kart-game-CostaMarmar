// Programmers:  Costa Marmaras
// Course:  CS 212
// Due Date: 2/8/24
// In class assessment: Mario Kart
// Problem Statement: Make a Mario Kart class and methods that will simulate a Mario Kart game
// Data In: None
// Data Out: Driver info, boost simulation, Updated Driver info
// Credits: [Is your code based on an example in the book, in class, or something else?
//            Reminder: you should never take code from the Internet or another person

class MarioKartGame {
    public static void main(String[] args) {

        //instantiate the bill and john objects
        System.out.println("Mario Kart!");
        MarioKartPlayer bill = new MarioKartPlayer("Bill", "Mario", 65);
        MarioKartPlayer john = new MarioKartPlayer("John", "Bowser", 50);

        //Display the info for both the players
        bill.DisplayInfo();
        System.out.println();
        john.DisplayInfo();
        System.out.println();

        //Boost both players
        bill.Boost();
        System.out.println();
        john.Boost();
        System.out.println();

        //Display updated info for the players
        bill.DisplayInfo();
        System.out.println();
        john.DisplayInfo();
    }
}
