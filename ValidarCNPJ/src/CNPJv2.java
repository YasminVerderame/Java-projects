import java.util.Scanner;

public class CNPJv2
{
	public static final int TAMANHO_CNPJ = 12;		// quantidade de dígitos do CNPJ
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		String CNPJ = new String();
		int DV1i, DV1c, DV2i, DV2c, tamanho;

		System.out.print("Informe o CNPJ que deseja validar (sem ./-): ");
		CNPJ = teclado.nextLine();
		tamanho = TAMANHO_CNPJ;

		DV1i = Character.digit(CNPJ.charAt(tamanho), 10);
		DV2i = Character.digit(CNPJ.charAt(tamanho+1), 10);

		DV1c = calculaDvCNPJ(CNPJ, 1);
		DV2c = calculaDvCNPJ(CNPJ, 2);

		if (DV1c == DV1i && DV2c == DV2i)
			System.out.println("\nCNPJ VÁLIDO!");
		else
			System.out.println("\nCNPJ INVÁLIDO!");

		teclado.close();
	}

	public static int calculaDvCNPJ(String CNPJ, int digito)
	{
		int i, soma, peso, resto, tamanho;
		char charDigito;
		int intDigito;

		tamanho = 11 + digito;
		soma = 0;
		peso = 4 + digito;
		for (i = 0; i < tamanho; i++)
		{
			charDigito = CNPJ.charAt(i);
			intDigito = Character.digit(charDigito, 10);
			soma = soma + intDigito*peso;

			peso--;
			if (peso == 1)
				peso = 9;
		}

		resto = soma % 11;
		if (resto < 2)
			return 0;
		else
			return (11 - resto);
	}
}
