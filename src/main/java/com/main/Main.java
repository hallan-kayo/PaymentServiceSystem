/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.main;

import com.model.entities.Contract;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author hallan
 */
public class Main {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        DateTimeFormatter dateFormater = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //formatando data
        
        System.out.println("Entre com os dados do contrato");
        
        try{

            System.out.println("Número:");
            int number = input.nextInt();
            System.out.println("Data:");
            LocalDate date = LocalDate.parse(input.next(),dateFormater);
            System.out.println("Valor do contrato:");
            double value = input.nextDouble();

            Contract contract = new Contract(number,date,value);
            
            System.out.println("Entre com o número de parcelas:");
            int numberOfIndtallments = input.nextInt();
            
        }catch(RuntimeException error){
            System.out.println("Um erro inesperado aconteceu"+ error.getMessage());
        }
    }
}
