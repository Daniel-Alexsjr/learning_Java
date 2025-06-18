public class addLength{
  
  public static String[] addLengthF(String str){
    String[] res = str.split(" ");
    for (int i=0; i<res.length; i++){
      res[i] = res[i] + " " + res[i].length();
    }
    return res;
  }
  public static void main(String[] args) {
    String frase = "hello world java";
    String[] resultado = addLengthF(frase);
    System.out.println(java.util.Arrays.toString(resultado));
  
  } 
}