/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author FATTANI COMPUTERS
 */
public class LAB8 {

    class Power_Law{
        int current; 
        int voltage;
    public Power_law(int current , int voltage){
        this.current = current;
        this.voltage = voltage;
        
    }
    public int calculatePower(){
        return current * voltage;
    }
  }
    
public class Main{
    public static void main(Sting[] args){
        Power_law obj  = new Power_law(4,200);
        int power =  obj.calcuatePower();
        System.out.println("Power; "+ power + "Watts"");    
    }
    

}
}
