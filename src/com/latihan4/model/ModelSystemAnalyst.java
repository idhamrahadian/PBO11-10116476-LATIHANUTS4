/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.latihan4.model;

/**
 *
 * @author Idham Rahadian
 */
public class ModelSystemAnalyst extends ModelEmployee {

    public int bonus = 90000;

    public void bonusSystemAnalyst() {
        System.out.println("Salary Employe Designer : " + salary);
        System.out.println("Bonus System Analyst : " + bonus);
    }
}
