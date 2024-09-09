import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DnDCharacter ecstasy = new DnDCharacter(73, 10, 4, 5, 4, 4, 2,0,0,0,0);

        ecstasy.setHealth(143);
        ecstasy.setSpellSlot(3,2);
        ecstasy.setSpellSlot(5,1);
        ecstasy.setSorceryPoints(5);

        String input = "";


        while(!Objects.equals(input, "end")) {

            System.out.println("\nWhat would you like to do? ");
            input = scanner.next();

            switch (input) {
                case "reduceHealth" -> {

                    System.out.println("How much would you like to remove? ");
                    ecstasy.reduceHealth(scanner.nextInt());
                    ecstasy.getHealth();
                }
                case "addHealth" -> {

                    System.out.println("How much would you like to add? ");
                    ecstasy.addHealth(scanner.nextInt());
                    ecstasy.getHealth();
                }
                case "setHealth" -> {

                    System.out.println("What is the current health you have? ");
                    ecstasy.setHealth(scanner.nextInt());
                    ecstasy.getHealth();
                }
                case "usePoints" -> {

                    System.out.println("How many points do you want to use? ");
                    ecstasy.useSorceryPoints(scanner.nextInt());
                    ecstasy.getSorceryPoints();
                }
                case "setPoints" -> {

                    System.out.println("How many points do you have? ");
                    ecstasy.setSorceryPoints(scanner.nextInt());
                    ecstasy.getSorceryPoints();
                }
                case "useSpell" -> {
                    System.out.println("What spell level are you using? ");
                    int spellLevel = scanner.nextInt();
                    System.out.println("How many slots are you using?");
                    ecstasy.useSpellSlot(spellLevel, scanner.nextInt());
                    ecstasy.getSpellSlots();

                }
                case "setSpell" -> {
                    System.out.println("What spell level are you setting? ");
                    int spellLevel = scanner.nextInt();
                    System.out.println("How many slots do you have?");
                    ecstasy.setSpellSlot(spellLevel, scanner.nextInt());
                    ecstasy.getSpellSlots();

                }
                case "shortRest" -> {

                    ecstasy.shortRest();
                    ecstasy.getInfo();
                }
                case "longRest" -> {

                    ecstasy.longRest();
                    ecstasy.getInfo();
                }
                case "getHealth" -> ecstasy.getHealth();
                case "getPoints" -> ecstasy.getSorceryPoints();
                case "getSpellSlots" -> ecstasy.getSpellSlots();
                case "getInfo" -> ecstasy.getInfo();
                case "end" -> {System.out.println("Bye bye"); ecstasy.getInfo();}
                case null, default -> {
                    System.out.println("That's not an option");
                    System.out.println("List of Commands:");
                    System.out.println("\nreduceHealth\naddHealth\nsetHealth\nUsePoints\nsetPoints\nuseSpell\nsetSpell\nshortRest\nlongRest\ngetHealth\ngetPoints\ngetSpellSlots\ngetInfo\nend");
                }
            }
        }
        scanner.close();

    }
}
