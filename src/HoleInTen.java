import java.util.Scanner;
import java.util.ArrayList;

public class HoleInTen {
    public static void main(String[]args ){
        //Variables
        String userInput = "";
        Scanner kybd = new Scanner(System.in);
        ArrayList<String> codes = new ArrayList<>();
        codes.add("BALL");
        codes.add("DRV01");
        codes.add("DRV02");
        codes.add("DRV03");
        codes.add("SET01");
        codes.add("SET02");
        codes.add("SET03");
        codes.add("SET04");
        codes.add("SET05");

        System.out.println("Product codes: " + codes);
        System.out.print("Please enter product code(CAPS ONLY): ");
        userInput = kybd.nextLine();

        switch(userInput){
            case "BALL":
                System.out.println("Golf Balls (1 dozen); $38.00");
                break;
            case "DRV01":
                System.out.println("Big Bertha Driver; $449.95 ");
                break;
            case "DRV02":
                System.out.println("Vaporizer Driver; $375.00");
                break;
            case "DRV03":
                System.out.println("Fly-Z Driver; $179.00");
                break;
            case "SET01":
                System.out.println("Project Manager Gold Club Set; $179.00");
                break;
            case "SET02":
                System.out.println("Junior VP Golf Club Set; $225.00");
                break;
            case "SET03":
                System.out.println("Executive Golf Club Set; $299.95");
                break;
            case "SET04":
                System.out.println("CEO Golf Club Set; $374.95");
                break;
            case "SET05":
                System.out.println("Chairman of the Board Club Set; $495.00");
                break;
        }
        System.out.println("Program Finished");
    }
}
