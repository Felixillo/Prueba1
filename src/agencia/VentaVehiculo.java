package agencia;

import javax.swing.JOptionPane;

public class VentaVehiculo {
    public void venta(Vehiculo matCarros[][]){
        for(int fila=0; fila<matCarros.length; fila++){
            for(int col=0; col<matCarros.length; col++){
                matCarros[fila][col]= new Vehiculo();
                matCarros[fila][col].setPlaca(JOptionPane.showInputDialog("Digite la placa"));
                matCarros[fila][col].setModelo(JOptionPane.showInputDialog("Digite el modelo"));
                matCarros[fila][col].setColor(JOptionPane.showInputDialog("Digite el color"));
                matCarros[fila][col].setPrecioVehiculo(Float.parseFloat(JOptionPane.showInputDialog("Digite el precio")));
                byte extra = Byte.parseByte(JOptionPane.showInputDialog("1.Extra\n2.Sin extra\nDigite su opcion"));
                if(extra==1)
                    matCarros[fila][col].setExtras(true);
                else
                    matCarros[fila][col].setExtras(false);
                
            }//cierra for de columnas
        }//cierra for de filas
    }
    
    public void imprimeVenta(Vehiculo matCarros[][]){
        for(int fila=0; fila<matCarros.length; fila++)
            for(int col=0; col<matCarros.length; col++){
                System.out.println("Placa "+matCarros[fila][col].getPlaca());
                System.out.println("Modelo "+matCarros[fila][col].getModelo());
                System.out.println("Precio "+matCarros[fila][col].getPrecioVehiculo());
                System.out.println("color "+matCarros[fila][col].getColor());
                if(matCarros[fila][col].isExtras()==true)
                    System.out.println("Tiene extras");
                else
                    System.out.println("No tiene extras");
                
                System.out.println("----------------------------");
                
            } 
    }
    
    public void carrosConExtra(Vehiculo matCarros[][]){
        System.out.println("Autos que tienen extra");
        for(int fila=0; fila<matCarros.length; fila++){
            for(int col=0; col<matCarros.length; col++){
                if(matCarros[fila][col].isExtras()==true){
                    System.out.println("Placa "+matCarros[fila][col].getPlaca());
                    System.out.println("Modelo "+matCarros[fila][col].getModelo());
                    System.out.println("Precio "+matCarros[fila][col].getPrecioVehiculo());
                    System.out.println("color "+matCarros[fila][col].getColor());
                }    
            }//cierra for columnas
        }//cierra for filas   
    }//cierra metodo carrosConExtra
    
    
}//cierra clase ventaVehiculo
