/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.services;

/**
 *
 * @author hallan
 */
public interface OnlinePaymentService {
    
    public double paymentFee(double amount);
    public double interest(double amount, int months);
    
}
