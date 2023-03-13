
public class FuncoesString {

	public static void main(String[] args) {
		/*
		 * ### Formatar ###
		 * toLowerCase() - transformar para minusculo
		 * toUpperCase() - transformar para maiusculo
		 * trim() - remover espaços.
		 * 
		 * ### Recortar ### 
		 * substring(inicio) - Informando o início
		 * substring(inicio, fim) - Informando o início e final
		 * 
		 * ### Substituir ###
		 * Replace(char, char) - Caractere
		 * Replace (string, string) - String
		 * 
		 * ### Buscar ### Buscar posição em uma string
		 * IndexOf 
		 * LastIndexOf
		 * 
		 * ### str.Split("") ### - Recortar com base em um separador informado
		 * 
		 * */
		
		 String original = "abcde FGHIJ ABC abc DEFG	";
		 
		 String s1 = original.toLowerCase();
		 String s2 = original.toUpperCase();
		 String s3 = original.trim();
		 String s4 = original.substring(2);
		 String s5 = original.substring(2,9);
		 String s6 = original.replace('a', 'x');
		 String s7 = original.replace("abc", "xy");
		 int i = original.indexOf("bc");
		 int j = original.lastIndexOf("bc");
		 
		 System.out.println("Original : -"+ original + "-");
		 System.out.println("toLowerCase: -"+ s1 + "-");
		 System.out.println("toUpperCase: -"+ s2 + "-");
		 System.out.println("trim: -"+ s3 + "-");
		 System.out.println("substring(2): -"+ s4 + "-");
		 System.out.println("substring(2,9): -"+ s5 + "-");
		 System.out.println("replace('a', 'x');: -"+ s6 + "-");
		 System.out.println("replace('abc', 'xy');: -"+ s7 + "-");
		 System.out.println("indexOf: -"+ i +"-");
		 System.out.println("indexOf: -"+ j +"-");

		 
		 String s = "potato apple lemon";
		 
		 String[] vect = s.split(" ");
		 
		 System.out.println("Primeira posição: "+ vect[0]);
		 System.out.println("Segunda posição: "+ vect[1]);
		 System.out.println("Terceira posição: "+ vect[2]);
		 		 
		 
	}

}
