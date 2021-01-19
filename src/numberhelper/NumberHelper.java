/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberhelper;

/**
 *
 * @author juliet
 */
public class NumberHelper {

    /**
     * @param args the command line arguments
     */
    private int number;

    public NumberHelper(int n) {
        number = n;
    }

    public boolean isEven() {
        // ritorna true se number numero pari, altrimenti ritorna false
        if(number%2==0){
            return true;
        }
        return false;
    }

    public boolean isOdd() {
        // ritorna true se number è un numero dispari, altrimenti ritorna false
        if(number%2!=0){
            return true;
        }
        return false;
    }
    
    public int sum(int n){
        // ritorna la somma tra number e n
        return number+n;
    }

    public boolean isPrime() {
        // ritorna true se number è un numero primo, altrimenti ritorna false
        if(number==1){
            return true;
        }
    int count=0;

    for(int i=1;i<=number;i++){
        if(number%i==0){
        count++;
        }
    }
    
    if(count==2){
        return true;
    }
    return false;
    }

    public boolean isDivisibleBy(int n) {
        // ritorna true se number è divisibile per il parametro n, altrimenti ritorna false
    if(n!=0){
        if(number%n==0){
            return true;
        }
    }
    return false;
    }
    
}
