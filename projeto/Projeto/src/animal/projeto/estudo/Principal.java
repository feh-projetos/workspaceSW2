package animal.projeto.estudo;

import javax.swing.JOptionPane;



public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gato gt = new Gato();
		JOptionPane.showMessageDialog(null, gt.comer());
		JOptionPane.showMessageDialog(null, gt.pular());
		JOptionPane.showMessageDialog(null, gt.correr());    
	}

}
