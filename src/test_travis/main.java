package test_travis;

import javax.swing.JOptionPane;

import test_travis.Operaciones;

public class main {

	public static void main(String[] args) {
		  int a;
	      Operaciones s=new Operaciones();
	        a = Integer.parseInt(JOptionPane.showInputDialog("Elija Opcion "
	                + " \n 1.Sumar"
	                + " \n 2.restar"
	                + " \n 3.multiplicar"
	                +"  \n4.Dividir"));
	        switch(a){
	            case 1:
	               JOptionPane.showMessageDialog(null, s.sumar(3,3));
	            break;
	            case 2:
	                JOptionPane.showMessageDialog(null, s.restar(3,3));
	            break;
	            case 3:
	                JOptionPane.showMessageDialog(null, s.multiplicar(3,3));
	            break;
	            case 4:
	                JOptionPane.showMessageDialog(null, s.dividir(3,3));
	            break;
	        
	        }

	}

}
