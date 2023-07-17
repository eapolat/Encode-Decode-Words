import java.util.Scanner;

import java.util.Random;

public class Lab03_Revision {

    public static void main(String [] args ) {

    
        int choice;
        String inputted_word;
        String encoded_word;
        String saved_inputted_word;
        int i;
        int random_digit;
        int random_place;
        int random_split_index;
        String splitted_1;
        String splitted_2;

        String inputted_word_2;
        String encoded_word_2;
        String saved_inputted_word_2;
        String original_word_2;
        int space_index;
    
        choice = 6;
        saved_inputted_word = " ";
        encoded_word = " ";
        inputted_word = " ";
        i = 0;

        inputted_word_2 = " ";
        encoded_word_2 = " ";
        saved_inputted_word_2 = " ";
        original_word_2 = "";
        
    
        Scanner scan = new Scanner(System.in);
    
    
        while (choice != 5) {

            i = 0;
            System.out.println("1) Encode Message");
            System.out.println("2) Decode Message");
            System.out.println("3) Encode2 Message");
            System.out.println("4) Decode2 Message");
            System.out.println("5) Quit");
    
            
            System.out.print("Enter the choice: ");
    
            choice = scan.nextInt();
            scan.nextLine();
    
    
            if (choice == 1) {
    

                System.out.print("Enter word to encode: ");
                inputted_word = scan.next();
    
    
                while (inputted_word.length() < 2) {
    
                    System.out.println("Invalid length word - try again");
    
    
                    System.out.print("Enter word to encode: ");
                    inputted_word = scan.next();
    
    
                }
    
                saved_inputted_word = inputted_word;
    
    
                while (i < saved_inputted_word.length()) {
    
                    Random rand = new Random();
    
                    random_digit = rand.nextInt(9);
                    random_place = rand.nextInt(saved_inputted_word.length());
                    encoded_word = inputted_word.substring(0, random_place) + random_digit + inputted_word.substring(random_place);
                    inputted_word = encoded_word;
                    i++;
    
                }
    
                Random rand = new Random();
    
                random_split_index = rand.nextInt(encoded_word.length());
                splitted_1 = encoded_word.substring(0, random_split_index);
                splitted_2 = encoded_word.substring(random_split_index);
                encoded_word = splitted_2 + " " + splitted_1;
                System.out.println("Encoded message: " + encoded_word);
                scan.nextLine();
    
    
            }
    
            if (choice == 2 & saved_inputted_word.equals(" ")) {
    
                System.out.println("No message to decode....");
    
            }
    
            if ((choice == 2) & (!saved_inputted_word.equals(" "))) {
    
                System.out.println("The decoded message is: " + saved_inputted_word );
    
            }

            if (choice == 3) {

                System.out.print("Enter word to encode: ");
        
                inputted_word_2 = scan.nextLine();

                System.out.println(inputted_word_2);

                saved_inputted_word_2 = inputted_word_2;
                encoded_word_2 = " ";
                original_word_2 = "";

                while (i < saved_inputted_word_2.length()-1) {

                    encoded_word_2 =  "*" + inputted_word_2.substring(0 + i,1+i);
                    original_word_2 = encoded_word_2 + original_word_2 ;
                    i++;                    

                }

                
                if (i == saved_inputted_word_2.length()-1) {

                    encoded_word_2 = inputted_word_2.substring(saved_inputted_word_2.length()-1, saved_inputted_word_2.length());
                    original_word_2 = encoded_word_2 + original_word_2;

                }

                space_index = original_word_2.indexOf(" ");
                
                if ( space_index != -1) {
                space_index = original_word_2.indexOf(" ");
                original_word_2 = original_word_2.substring(0,space_index-1) + " " + original_word_2.substring(space_index+2);

                }

                System.out.println("Encoded message: " + original_word_2);

            }

            if (choice == 4 & saved_inputted_word_2.equals(" ")) {

                System.out.println("No message to decode....");

            }

            if (choice == 4 & !saved_inputted_word_2.equals(" ")) {

                System.out.println("The decoded message is: " + saved_inputted_word_2 );

            }
    
            if (choice > 5) {
    
                System.out.println("Invalid choice - try again....");
    
            }
    
        }

        scan.close();
    
        System.out.print("Thank you, goodbye!");
        
    }
    }
    