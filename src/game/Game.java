/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.Random;
import java.util.Scanner;


public class Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String repeat = "";
        do{
            int num = random.nextInt(5-0+1)+0;
            System.out.println("Программа загадала число от 0 до 5, отгадай: ");
            int attempt = 0; 
            int userNum;
            do{
                userNum = scanner.nextInt();
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
            System.out.println("------------------------------------");
            System.out.printf("Чтобы закончить нажмите \"n\",%n для продолжения нажмите%n любую другую клавишу: ");
            scanner.nextLine();
            repeat=scanner.nextLine();
            if(repeat.equals("n")){
                break;
            }
            System.out.println("");
        }while(true);
    }
  


