/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package decendingorder;

/**
 *
 * @author cui
 */
import java.util.Scanner;
public class Decendingorder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        System.out.println("Enter three numbers");
        int x=s.nextInt();
        int y=s.nextInt();
        int z=s.nextInt();
        if(x>=y&&x>=z){
            if(y>=z){
                System.out.printf("%d%d%d",x,y,z);}
            else{
                System.out.printf("%d%d%d",x,z,y);}
                
    }
         if(y>=x&&y>=z){
            if(x>=z){
                System.out.printf("%d%d%d",y,x,z);}
            else{
                System.out.printf("%d%d%d",y,z,x);}
                
    }
     if(z>=y&&z>=x){
            if(y>=x){
                System.out.printf("%d%d%d",z,y,x);}
            else{
                System.out.printf("%d%d%d",z,x,y);}
                
    }
}
}
