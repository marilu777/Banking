import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

import bank.model.Cliente;

static Cliente[] clientes;

public class Main {

    private static Cliente[] clientes;
    private static int quantidade;

    public static void main(String[] args){

        clientes = new Cliente[10];
        clientes[quantidade++] = new Cliente();
        clientes[quantidade++] = new Cliente();

        //TODO auto-genetated method stub

        /*System.out.print("Ola bom dia");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        scanner.nextLine();

        System.out.println(input);*/

       /*Cliente[] clientes = new Cliente[3];
        clientes[0]= "0";
        clientes[1]= "1";
        clientes[2]= "2";
        registar(new Cliente());*/
        
        

        ArrayList<String> strings = new ArrayList<String>(); // 0
        strings.add("1");
        strings.add("1");
        strings.add("1");
        strings.add("1");
        strings.add("1");

        for(String str : strings) {
            System.out.println(str);
        }
        for(int i = 0; i < strings.size(); i++){
            System.out.println(strings.get(i));
        }

        strings.clear();
        strings.countains("2");

        strings.add("2");
        strings.add(3, "10");
        strings.set(2, "3");
        strings.remove(2);
    }

    static void registar(cliente novo){
        System.out.print("Nova coleçao criada");
        quantidade = quantidade + 1;
        clientes = quantidade + 1;
        clientes(quantidade++) = nova;
    }

}


class ListaArray {
    String[] array = new String[10];
    int size = 0;

    public void add(String str){
        array[size] = str;
        size++;
    }
    public void add(int index, String str){
        
    }
    public void remove(int index){
        size--;
    }
    public void size(){
        return array.length;
    }
}
