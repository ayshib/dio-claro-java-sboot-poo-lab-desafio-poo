package br.ays.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String nome;
    private Set<Conteudo> conteudoInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp) {
        conteudoInscritos.addAll(bootcamp.getConteudos());
        bootcamp.devInscrever(this);
    }

    public void progredir() {
        Optional<Conteudo> conteudo = conteudoInscritos.stream().findFirst();
        conteudo.ifPresentOrElse(
            c -> { conteudosConcluidos.add(c); conteudoInscritos.remove(c); },
            () -> System.out.println("Voce nao esta matruculado em nenhum curso")
        );
    }

    public double calcularTotalXp() {
        return conteudosConcluidos.stream()
            .mapToDouble(Conteudo::calcularXp)
            .sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudoInscritos() {
        return conteudoInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }
}
