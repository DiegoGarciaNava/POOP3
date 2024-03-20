/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop3;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;

/**
 *
 * @author Diegi
 */
public class POOP3 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        
        //Arreglos
        int nums[];
        int[] nums2;
        int [] nums3={1,2,3,4,5,6};
        for (int i = 0; i <nums3.length; i++) {
            System.out.println("Elemento["+i+"]="+nums3[i]);
        }    
        for (int temp : nums3) {
            System.out.println("Elemento:"+ temp);
            
        //String
        
        String s = new String("Hola Mundo");
        String s1= "Hola mundo";
            System.out.println(s);
            System.out.println(s1);
        String nombre = "Diego";
        String apellido = "Garcia";
        String nombreCompleto= nombre+" "+ apellido;
            System.out.println(nombreCompleto);
            
            
        //Operador punto
            System.out.println("Arreglo nums3 tiene "+ nums3.length + " elementos");
            System.out.println("Tu nombre tiene "+nombre.length()+" elementos");
            System.out.println("Tu nombre tiene "+(nombreCompleto.length()-1)+" elementos");
                
         
        //wrappers y autoboxig
            int a=3;
            //Integer b= new Integer(value:22); Correcta pero sin uso 
            Integer c = 33;
            int d = c;
            System.out.println(d);
            Integer e = a;
            String cadena = e.toString();
            System.out.println("Valor de a= "+ cadena);
            String f = a + "";
            System.out.println("Elementos de f: "+ f.length());
            
        
        //Colecciones
        ArrayList<Integer> miArrayList = new ArrayList<Integer>();
        miArrayList.add(11);
        miArrayList.add(33);
        miArrayList.add(44);
            System.out.println("Tam de arrayList "+ miArrayList.size());
        miArrayList.add(1, 22);
         System.out.println("Tam de arrayList "+ miArrayList.size());
            for (Integer integer : miArrayList) {
                System.out.println(integer);
            }
         miArrayList.add(1, 15);
         for (Integer integer : miArrayList) {
                System.out.println(integer);
            }
         
        //Hashtable
        Hashtable <String, Integer> miAgenda  = new Hashtable <String, Integer>();
        miAgenda.put("Coral", 759237538);
        miAgenda.put("Diego", 123456789);
        miAgenda.put("Rashid", 987654321);
        miAgenda.put("Kalid", 486732432);
        miAgenda.put("Mia", 294245667);
        
        
        
            System.out.println("Elementos en mi Agenda "+ miAgenda.size());
            for (String value  : miAgenda.keySet()) {
                System.out.println(value);
                
            }
            
            for (Integer value  : miAgenda.values()) {
                System.out.println(value);
                
            }
            
        
        //Enumeracion
       String llave;
        Integer valor;
        Enumeration<String> llavesEnumeradas = miAgenda.keys();
            while (llavesEnumeradas.hasMoreElements()) {
                llave = llavesEnumeradas.nextElement();
                valor = miAgenda.get(llave);
                System.out.println("Nombre "+llave+ " Num Telefono: "+ valor);
            }
       
            
            Date cumpleDiego = new Date(101,02 ,30);
            Date cumpleCoral = new Date(102,06,18);
            Hashtable <String, Date> miAgenda1  = new Hashtable <String, Date>();
            miAgenda1.put("Coral", cumpleCoral);
            miAgenda1.put("Diego", cumpleDiego);
            String llave1;
            Date cumple;
            Enumeration<String> llavesEnumeradas1 = miAgenda1.keys();
            while (llavesEnumeradas1.hasMoreElements()) {
                llave1 = llavesEnumeradas1.nextElement();
                cumple = miAgenda1.get(llave1);
                System.out.println("Nombre "+llave1+ " Fecha de nacimiento: "+ cumple);
            }
            
            
         
        /* 
       
            //Interfaces
            System.out.println(Math.PI);
            System.out.println(Math.abs(-5));
            System.out.println(Math.pow(3, 2));
            System.out.println(Math.sqrt(9));
            System.out.println(Math.max(44, 121));
            
            
            //Date
            
            Date hoy = new Date();
            System.out.println(hoy);
            
            //Calendar
            
            Calendar calendarioHoy = Calendar.getInstance();
            System.out.println(calendarioHoy);
            
          */  
            //Diccionario de hashtable que tenga 5 elementos
            //Agenda con hashtable y calendar Key=Nombre Value= calendar
            
            


   
        
    

        }
    }
    
}


