/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import util.Input;

/**
 *
 * @author LENOVO
 */
public class Menu {
    public static int chooseInputOption(){
            System.out.println("-----------------------------------------------------------------");
            System.out.println("1. Experience                                                   |");
            System.out.println("2. Fresher                                                      |");
            System.out.println("3. Internship                                                   |");
            System.out.println("4. Display and Search Information                               |");
            System.out.println("5. Exit                                                         |");
            System.out.println("-----------------------------------------------------------------");
        int option = Input.inputOption(1, 5);
        return option;
    }
}
