package br.com.mariojp.solid.isp;

// Impressora simples
public class SimplePrinter implements Printer {
    @Override
    public void print(String content) /* imprime */ {
        System.out.println("Imprimindo: " + content);
    }
}

