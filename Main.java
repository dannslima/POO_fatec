
/*
1) Escolha uma imagem que contenha vários exemplares de algo, mantendo diferenças entre si.
2) Faça a abstração destes exemplares, elaborando uma classe Java, contendo métodos, atributos, construtor, métodos de acesso.
3) Crie os objetos Java e rode os métodos implementados.
4) Armazene a classe elaborada no seu git e poste aqui o link do seu github ou gitlab pessa
Meu trabalho

*/

public class Main 
{
	
	public static void main(String [] args)
	{
		Carro carro = new Carro("Gol g5","vermelho",5,1.6,9,45);
		
		carro.imprimirAtributos();
		int consumo = carro.calcularKilometragem(carro.consumo, carro.autonomia);
		System.out.println("A autonomia do veículo é de " + consumo + " Kilometros");
	}	
	
	
}