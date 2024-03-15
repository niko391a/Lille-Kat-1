package ProblemC;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String champerString = "";
        char[] characters = new char[input.length()];
        characters = input.toCharArray();
        String lastDigit = String.valueOf(characters[characters.length-1]);

        // Creates correct Champerowne string
        for(int i = 1 ; i <= characters.length ; i++){
            champerString = champerString + i;
        }
        // checks if given input matches the correct champerowne string
        if(champerString.equals(input)){
            System.out.println(lastDigit);
        } else {
            System.out.println(-1);
        }
    }
}
