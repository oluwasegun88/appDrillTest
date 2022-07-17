import org.junit.jupiter.params.shadow.com.univocity.parsers.common.CommonParserSettings;

import java.util.Scanner;

public class NokiaPhone {
    private static Scanner scanner = new Scanner(System.in);
    
    private static int input;

    public static void main(String[] args) {
        menu();
        callRegisterOption();
        settingOptions();
    }
    
    public static void menu{
        System.out.print(""";
                press\s
                1 Phone book
                2 Messages
                3 Chat
                4 Call register
                5 Tones
                6 Settings
                7 Call divert
                8 Games
                9 Calculator
                10 Remainder
                11 Check
                12 Profile
                13 SIM services\s""");
        userInput();
        switch(input){
            case 1:
                phoneBook();
                break;
            case 2:
                messages();
                break;
            case 3:
                chat();
                break;
            case 4:
                callRegister();
                break;
            case 5:
                tones();
                break;
            case 6:
                settings();
                break;
            case 7:
                callDivert();
                break;
            case 8:
                games();
                break;
            case 9:
                calculator:
                break;
            case 10:
                reminder();
                break;
            case 11:
                check();
                break;
            case 12:
                profile();
                break;
            case 13:
                simService();
            default:
                System.out.println("wrong input");
                
        }
    }

    private void messages() {
    }

    public static void phoneBook(){
        
        System.out.print("""
                Press\s
                1 Search
                2 Service Nos.
                3 Add name
                4 Erase
                5 Edit
                6 Assign tone
                7 Send b'card
                8 Options
                9 Speed dials
                10 Voice tags\s""");
        userInput();
        switch (input) {
            case 1:
                System.out.println("Search");
                break;
            case 2:
                System.out.println("Service Nos");
                break;
            case 3:
                System.out.println("Erase");
                break;
            case 4:
                System.out.println("Edit");
                break;
            case 5:
                System.out.println("Assign tone");
                break;
            case 6:
                System.out.println("Send b'card ");
                break;
            case 7:
                System.out.println("Options");
                break;
            case 8:
                System.out.println("Speed dials");
                break;
            case 9:
                System.out.println("Voice tags");
                break;
            default:
                phoneBook();
                
        }
                
    }
    
    public static void phoneBookOptions8(){
        System.out.println("Type of view%n2. Memory status");
        userInput();
        switch (input){
            case 1:
                System.out.println("Type of view");
                break;
            case 2:
                System.out.println("Memory status");
                break;
        }
    }
    


}
