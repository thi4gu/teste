package com.example;

/**
 * Hello world!
 *
 */
public class App 
{



    public static void main(String[] args )
    {
        Centro centro = new Centro();
        // Comentário Eclipse
        // Comentário Intellij
        centro.setNome("Centro Novo de Novo 3.6 Intellij");
        centro.setNome("Centro Novo de Novo 3.6 Eclipse");
        System.out.println( centro.getNome() );
    }

}
