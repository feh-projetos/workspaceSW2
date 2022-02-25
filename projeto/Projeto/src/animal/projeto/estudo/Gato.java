package animal.projeto.estudo;

import animal.projeto.superclasse.Animal;

public class Gato extends Animal {

	
	public String pular() {
		
      this.setNome("Tom");
      this.setCor("Cinza");
      
		return " O gato " + this.getNome() +  "de cor " + this.getCor()+
				"\n ,ele pulou!"; 
	}
	
   public String comer() {
	   this.setNome("Mingau");
	   this.setEspecie("Persa");
	      
		
		return " O gato " + this.getNome() +  " de especie " + this.getEspecie()+
				"\n ,ele comeu  whiskas sache!"; 
	}

  public String correr() {
	
	  this.setNome("Jerry");
	  this.setEspecie("Gato Bengala");
	   
	return " O gato " + this.getNome() +  " de especie " + this.getEspecie()+
			"\n ,ele correu do cachorro!";
}


}






