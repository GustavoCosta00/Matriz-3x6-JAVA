/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication45;

public class JavaApplication45 {

    static String[][] vendedores = {{"GUSTAVO","10", "20", "30", "0",    ""},
                                    {"ANA",    "10", "30", "30", "0", ""},
                                    {"JOÃO",   "10", "50", "30", "0",    ""}
                                   };
    
    static int media_pessoa1 = 0;
    static int media_pessoa2 = 0;
    static int media_pessoa3 = 0;
    static int media_geral = 0;

    public static void main(String[] args) {
        mediaVendedores();
        adicionandoValoreseMudandoTipo();
    }
    
    public static void mediaVendedores(){
        
        String armazenandoValor = "";
        String pessoa1[] = new String[4];
        String pessoa2[] = new String[4];
        String pessoa3[] = new String[4];
        int armazenando_valor_inteiro = 0;
        int pessoa1_valorInteiro[] = new int[4];
        int pessoa2_valorInteiro[] = new int[4];
        int pessoa3_valorInteiro[] = new int[4];
        
        
        
        for (int i = 0; i < 4; i++) {
            
            // PESSOA NUMERO 1
           armazenandoValor = vendedores[0][i];
           pessoa1[i] = armazenandoValor;
           
           // PESSOA NUMERO 2
           armazenandoValor = vendedores[1][i];
           pessoa2[i] = armazenandoValor;
                   
           // PESSOA NUMERO 3
           armazenandoValor = vendedores[2][i];
           pessoa3[i] = armazenandoValor;
                   
        }
        for (int i = 1; i < pessoa1.length; i++) {
            
            // ADICIONANDO VALOR INTEIRO PARA PESSOA 1
            armazenando_valor_inteiro = Integer.parseInt(pessoa1[i]);
            pessoa1_valorInteiro[i] = armazenando_valor_inteiro;
            
            media_geral += pessoa1_valorInteiro[i];
            
            // ADICIONANDO VALOR INTEIRO PARA PESSOA 2
            armazenando_valor_inteiro = Integer.parseInt(pessoa2[i]);
            pessoa2_valorInteiro[i] = armazenando_valor_inteiro;
            
            media_geral += pessoa2_valorInteiro[i];
            
            // ADICIONANDO VALOR INTEIRO PARA PESSOA 3
            armazenando_valor_inteiro = Integer.parseInt(pessoa3[i]);
            pessoa3_valorInteiro[i] = armazenando_valor_inteiro;
            
            media_geral += pessoa3_valorInteiro[i];
        }
        
        for (int i = 0; i < pessoa1_valorInteiro.length; i++) {
            
            media_pessoa1 += pessoa1_valorInteiro[i];
            
            media_pessoa2 += pessoa2_valorInteiro[i];
            
            media_pessoa3 += pessoa3_valorInteiro[i];
        }
        
        // MEDIA PESSOA1
        media_pessoa1 = media_pessoa1 / 3;
        
        // MEDIA PESSOA2
        media_pessoa2 = media_pessoa2 / 3;
        
        // MEDIA PESSOA3
        media_pessoa3 = media_pessoa3 / 3;
     
    }
    
    public static void adicionandoValoreseMudandoTipo(){
        
        System.out.println(vendedores[0][4]);
        media_geral = ( media_geral / 9 );
        String media_pessoa1_string = Integer.toString(media_pessoa1);
        String media_pessoa2_string = Integer.toString(media_pessoa2);
        String media_pessoa3_string = Integer.toString(media_pessoa3);
        int resultado_vendedor1 = 0;
        int resultado_vendedor2 = 0;
        int resultado_vendedor3 = 0;
        
        vendedores[0][4] = media_pessoa1_string;
        vendedores[1][4] = media_pessoa2_string;
        vendedores[2][4] = media_pessoa3_string;
        
        
        // ANALIZANDO RESULTADOS PRIMEIRO VENDEDOR
        if(media_pessoa1 > media_geral){
            resultado_vendedor1 = ((media_pessoa1 / media_geral) - 1) * 100;
            String cn = Integer.toString(resultado_vendedor1);
            vendedores[0][5] = cn;
        }else{
            resultado_vendedor1 = (media_pessoa1 / media_geral) * 100;
            String cn = Integer.toString(resultado_vendedor1);
            vendedores[0][5] = cn;
        }
        
        // ANALIZANDO RESULTADOS SEGUNDO VENDEDOR
        if(media_pessoa2 > media_geral){
            resultado_vendedor2 = ((media_pessoa2 / media_geral) - 1) * 100;
            String cn = Integer.toString(resultado_vendedor2);
            vendedores[0][5] = cn;
        }else{
            resultado_vendedor2 = (media_pessoa2 / media_geral) * 100;
            String cn = Integer.toString(resultado_vendedor2);
            vendedores[0][5] = cn;
        }
        
        // ANALIZANDO RESULTADOS TERCEITO VENDEDOR
        if(media_pessoa3 > media_geral){
            resultado_vendedor3 = ((media_pessoa3 / media_geral) - 1) * 100;
            String cn = Integer.toString(resultado_vendedor3);
            vendedores[0][5] = cn;
        }else{
            resultado_vendedor3 = (media_pessoa3 / media_geral) * 100;
            String cn = Integer.toString(resultado_vendedor3);
            vendedores[0][5] = cn;
        }
        
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(vendedores[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
    
}
