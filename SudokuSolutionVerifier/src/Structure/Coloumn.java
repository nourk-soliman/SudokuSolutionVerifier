/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Structure;

/**
 *
 * @author Nour
 */
public class Coloumn {
    Cell[]coloumn;

    public Coloumn(Cell[] coloumnn) {
       this.coloumn=new Cell[9];
       try{setColoumn(coloumn);}
       catch(IllegalArgumentException e)
       {System.out.println("Coloumn can not be null.");}
    }

    public Cell[] getColoumn() {
        return coloumn;
    }

    public void setColoumn(Cell[] coloumn) {
        if(coloumn==null)
        {throw new IllegalArgumentException("Coloumn can not be null.");}
        this.coloumn=coloumn;
    }
    
}
