/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Vladimir
 */
public class Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(5-0+1)+0;
        System.out.println("Программа задумала число от 0 до 5, отгадай: ");
        Scanner scanner = new Scanner(System.in);
       int attempt = 0;
        do{
            int userNum = scanner.nextInt();
            if(num == userNum){
                System.out.println("Ура, ты выиграл!");
                break;
            }else{
                if(attempt<2){
                    System.out.println("Неправильно, попробуй еще раз: ");
                }else{
                    System.out.println("Ты проиграл :(, задумано число: " + num);
                }
            }
            attempt++;
        }while(attempt < 3);
    }
    
}
    

