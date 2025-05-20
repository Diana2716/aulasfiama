package Exercicios;

public class IlhaDosCodigos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        String[] codigos = {"4H", "7A", "2C"};
        
        String resultado = "";

        for (String codigo : codigos) {
            
            String numeroStr = "";
            char letra = ' ';

            for (int i = 0; i < codigo.length(); i++) {
                char c = codigo.charAt(i);
                if (Character.isDigit(c)) {
                    numeroStr += c; 
                } else {
                    letra = c; 
                }
            }

            int quantidade = Integer.parseInt(numeroStr);

            for (int i = 0; i < quantidade; i++) {
                resultado += letra;
            }
        }

        System.out.println("Código reconstruído: " + resultado);
    }
}
