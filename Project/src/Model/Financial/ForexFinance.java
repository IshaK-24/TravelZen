/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Financial;

/**
 *
 * @author minal
 */
public class ForexFinance {
    double forexCNY;
    double forexEUR;
    double forexINR;
    double forexUSD;
    
    public ForexFinance(double forexCNY, double forexEUR, double forexINR, double forexUSD) {
        this.forexCNY = forexCNY;
        this.forexEUR = forexEUR;
        this.forexINR = forexINR;
        this.forexUSD = forexUSD;
    }

    public double getForexCNY() {
        return forexCNY;
    }

    public void setForexCNY(double forexCNY) {
        this.forexCNY = forexCNY;
    }

    public double getForexEUR() {
        return forexEUR;
    }

    public void setForexEUR(double forexEUR) {
        this.forexEUR = forexEUR;
    }

    public double getForexINR() {
        return forexINR;
    }

    public void setForexINR(double forexINR) {
        this.forexINR = forexINR;
    }

    public double getForexUSD() {
        return forexUSD;
    }

    public void setForexUSD(double forexUSD) {
        this.forexUSD = forexUSD;
    }

    
}
