package agencia;

import javax.swing.JOptionPane;

public class Agencia {
    
    public void carroCaro(Vehiculo matCarros[][]){
        System.out.println("Carro más caro");
        float precio = matCarros[0][0].getPrecioVehiculo();
        int i=0, j=0;
        for(int fila=0; fila<matCarros.length; fila++){
            for(int col=0; col<matCarros[fila].length; col++){
                if(matCarros[fila][col].getPrecioVehiculo()>precio){
                    precio=matCarros[fila][col].getPrecioVehiculo();
                    i=fila;
                    j=col;
                }//cierra if
            }//for 2
        }//fpr 1
        System.out.println("Placa "+matCarros[i][j].getPlaca());
        System.out.println("Modelo "+matCarros[i][j].getModelo());
        System.out.println("Precio "+matCarros[i][j].getPrecioVehiculo());
        System.out.println("Color "+matCarros[i][j].getColor());
    }
    
    public void menu(){
        byte opc=1;
        VentaVehiculo obj = new VentaVehiculo();
        Vehiculo matCarros[][] = new Vehiculo[2][2];
        while (opc>=1 && opc<5){
           opc= Byte.parseByte(JOptionPane.showInputDialog("1.Realizar ventas\n2.Imprimir ventas\n3.Carros con extra\nDigite su opcion"));
           switch(opc){
               case 1: obj.venta(matCarros);
               break;
               case 2: obj.imprimeVenta(matCarros);
               break;
               case 3: obj.carrosConExtra(matCarros);
               break;
               default: System.out.println("Saliendo del sistema");
           }//cierra switch
        }//cierra while
    }//cierra metodo menu
    
    
    public static void main(String[] args) {
        Agencia objAgencia = new Agencia();
        objAgencia.menu();
    }
    
}//cierra clase Agencia
