package exceptions;

import java.util.Scanner;

/**
 * Created by danawacomputer on 2017-04-12.
 */
public class ExceptionTest {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String userInput = null;
        int converted = 0;

        while(true){
            System.out.println("숫자를 입력해주세요");
            userInput = scanner.nextLine();

            try{
                converted = Integer.parseInt(userInput);
                System.out.printf("당신이 입력한 숫자는 %d 입니다", converted);
                break;

            }catch (NumberFormatException e){
                System.out.println("잘못된 숫자를 입력하셨습니다.");
            }

        }


    }
}
