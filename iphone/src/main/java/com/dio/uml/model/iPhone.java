package com.dio.uml.model;

import com.dio.uml.interfaces.NavegadorInternet;
import com.dio.uml.interfaces.ReprodutorMusical;
import com.dio.uml.interfaces.Telefonico;

public class iPhone implements ReprodutorMusical, Telefonico, NavegadorInternet {
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Aberto nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada");
    }

    @Override
    public void tocar() {
        System.out.println("Reproduzir música...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausar música.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero + "...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado");
    }
}
