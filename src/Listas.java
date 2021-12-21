import java.util.*;

public class Listas {
    public static void main(String[] args) {
      List lista1 = new ArrayList();

        lista1.add(123);
        lista1.add("Frank");
        lista1.add(25);
        lista1.add(1.65);
        lista1.add(true);
        System.out.println();
        System.out.println(lista1);
        System.out.println("\n\n");


              for (Object dato : lista1){System.out.println(dato);
        }
        System.out.println(  lista1.get(1));
        System.out.println("\n\n");

        lista1.remove(0);
        System.out.println(lista1);

        lista1.add(0, "123");
        System.out.println(lista1);
        System.out.println("\n\n");

        lista1.set(1, "Frank Garash");

        System.out.println(lista1);

        lista1.clear();

        System.out.println("la lista es"+lista1);


        Set dias = new HashSet();
        dias.add("Lunes");
        dias.add("Martes");
        dias.add("Miercoles");
        dias.add("Jueves");
        dias.add("Viernes");

        for (Object dia: dias) {
            System.out.println(dia);
        }

        System.out.println("--------------------------------");
        Map numeros = new HashMap<>();
        numeros.put(100, "francisco Garache");
        numeros.put(101, "frank");
        numeros.put(102, "robert perez");
        numeros.put(103, "javi");
        numeros.put(105, "estevan carrion");

        System.out.println(numeros);
        System.out.println("--------------------------------");
        System.out.println(numeros.get(105));

                for (Object clave : numeros.keySet()){
                    System.out.println(clave+ "  " + numeros.get(clave));
                }








    }
}
