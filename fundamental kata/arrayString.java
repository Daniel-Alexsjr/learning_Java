public class arrayString {


    public static void main(String[] args){
        String[] nomes = {"João", "Maria", "José", "Ana", "Pedro"};

        for (String nome : nomes){
            System.out.println(adicionarAsteriscos(nome));
        }
    } 

    public static String adicionarAsteriscos(String s){
    
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < s.length(); i++){
            resultado.append(s.charAt(i));
            if (i < s.length() - 1){
                resultado.append("***");
            }
        }
        System.out.println(resultado);
        return resultado.toString();
    }
}
