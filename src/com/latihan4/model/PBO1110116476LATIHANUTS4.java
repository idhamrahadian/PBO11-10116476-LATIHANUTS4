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
public class PBO1110116476LATIHANUTS4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ModelDesigner oMD = new ModelDesigner();
        oMD.bonusDesigner();

        System.out.println("\n");

        ModelProgrammer oMP = new ModelProgrammer();
        oMP.bonusProgrammer();

        System.out.println("\n");

        ModelSystemAnalyst oMSA = new ModelSystemAnalyst();
        oMSA.bonusSystemAnalyst();

    }

}
