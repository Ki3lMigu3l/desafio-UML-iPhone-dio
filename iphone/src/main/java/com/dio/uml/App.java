package com.dio.uml;

import com.dio.uml.model.iPhone;

public class App {
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();

        // Testando funções de Reprodutor Musical
        meuIphone.tocar();
        meuIphone.pausar();
        meuIphone.selecionarMusica("Take Care");

        // Testando funções de Aparelho Telefônico
        meuIphone.ligar("(81) 99999-9999");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Testando funções de Navegador na Internet
        meuIphone.exibirPagina("https://github.com/Ki3lMigu3l");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}