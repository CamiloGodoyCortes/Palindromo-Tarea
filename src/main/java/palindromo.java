public class palindromo {
    public palindromo() {
    }

    public boolean esPalindromo(String entrada) {
        entrada = RevisionString(entrada);
        if (entrada.equals("")){
            return false; }
        else if (entrada.length()==1){
            return false; }
        else{
            String palabraAux = "";

            for (int i = entrada.length() - 1; i >= 0; i--) {
                char caracter = entrada.charAt(i);
                palabraAux += caracter;
            }
            return entrada.equals(palabraAux);
        }
    }

    private String RevisionString(String a) {

        // Esto elimina los espacios
        a = a.replace(" ", "");
        //esto transforma las mayusculas a minusculas
        a=a.toLowerCase();
        return a;
    }
}
