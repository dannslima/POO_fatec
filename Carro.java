
 public class Carro 
{
	//atributos
	String modelo;
	String cor;
	int qtd_passageiros;
	double potencia;
	int consumo;
	int autonomia;
	
	// Criando metodo construtor
	public Carro (String modelo , String cor , int qtd_passageiros, 
	double potencia, int consumo,int autonomia)	
	{
		this.modelo = modelo;
		this.cor = cor;
		this.qtd_passageiros = qtd_passageiros;
		this.potencia = potencia;
		this.consumo = consumo;
		this.autonomia = autonomia;
	}
	//metodo para exibir propriedades do objeto 
	public void tracejar()
	{
		System.out.println("****************************************");
	}

	public void imprimirAtributos()
	{
		tracejar();
		System.out.println("Modelo do carro é " + modelo );
		System.out.println("cor do carro é " + cor );
		System.out.println("quantidade de passageiros do carro é " + qtd_passageiros );
		System.out.println("Potência do carro é " + potencia );
		System.out.println("consumo do carro é " + consumo );
		System.out.println("autonomia do carro é " + autonomia );
		tracejar();
	}

	// calcular quantos quilometros o veículo anda com tanque cheio
	public  int calcularKilometragem (int consumo , int autonomia)
	{	
		System.out.println("Chamando metodo calcularKilometragem ");
		return this.consumo * this.autonomia;
		// porque não consigo chamar o meteodo tracejar?
	}

	
	
}
