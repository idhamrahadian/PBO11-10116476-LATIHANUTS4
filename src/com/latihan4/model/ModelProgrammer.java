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
public class ModelProgrammer extends ModelEmployee {

    public int bonus = 60000;

    public void bonusProgrammer() {
        System.out.println("Salary Employe Designer : " + salary);
        System.out.println("Bonus Programmer : " + bonus);
    }
}
