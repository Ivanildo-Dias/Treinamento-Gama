package aula04.projed;

import java.util.ArrayList;

public class AppED {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(10);
        lista.add(20);
        lista.add(30);
        
        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
            if(lista.get(i) == 20){
                System.out.println("Achei");
                return;
            }
        }
        System.out.println("Terminou");
    }
}
