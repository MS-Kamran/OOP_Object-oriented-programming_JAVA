//5//

import java.util.Scanner;

public class lab1task5 {
    public static void main (String args[] ){
        
        Scanner scan = new Scanner (System.in);
        double I=0,E,R,L,C,F;
        
        System.out.println("Enter a value for voltage (volts):");
        E = scan.nextInt();
        System.out.println("Enter a value for resistance (ohms):");
        R = scan.nextInt();
        System.out.println("Enter a value for inductance (henrys):");
        L = scan.nextInt();
        System.out.println("Enter a value for capacitance (farads):");
        C = scan.nextInt();
        System.out.println("Enter a value for frequency (hertz):");
        F = scan.nextInt();
        
        I=E/Math.sqrt(R*R+((2*3.1416*F*L-1/2*3.1416*F*C)*(2*3.1416*F*L-1/2*3.1416*F*C)));
        
        System.out.println("Current (amperes):"+I);
    }
}