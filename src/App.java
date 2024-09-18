public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        String cadena = "Holaaa mundo";
        int edad = 10;
        System.out.println(cadena);
        System.out.print("Tamaño de la cadena: ");
        System.out.println(cadena.length());
        System.out.println(cadena.split(" ")[1]); //Separa la cadena donde está el espacio, y coge la primera [0]
        for (int i = 0; i < cadena.length(); i++){
            if (i == cadena.length()-1){
                System.out.print(cadena.charAt(i));
            } else{
            System.out.print(cadena.charAt(i) + "-");
            }
        }
        //Contar palabras
        System.out.println();
         int palabras = cadena.split(" ").length;
         System.out.println(palabras);

         //Contar cuantas a hay en la cadena
         int contador = 0; 
         for (int i = 0; i < cadena.length(); i++){
            if (cadena.charAt(i) == 'a'){
                contador++;
            }
         }
         System.out.println("total de a: " + contador);

            
            
    }
}
