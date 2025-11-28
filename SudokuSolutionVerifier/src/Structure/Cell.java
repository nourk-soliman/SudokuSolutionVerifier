/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Structure;

/**
 *
 * @author Nour
 */
public class Cell {
    private int number;

    public Cell(int number) {
        try
        {setNumber(number);}
        catch(IllegalArgumentException e)
        {System.out.println("The input is invalid.");}
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
       if(number<1 || number>9)
       {throw new IllegalArgumentException("The number is out of range.");}  
       this.number=number;
    }
    
    
}
