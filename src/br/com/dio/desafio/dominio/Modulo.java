package br.com.dio.desafio.dominio;
import java.util.*;

public class Modulo {
    private Curso curso;
    private Mentoria mentoria;


    public void adicionaConteudos(Curso curso){
        this.curso = curso;
    }

    public void adicionaConteudos(Mentoria mentoria){
          this.mentoria = mentoria;
    }
    public void adicionaConteudos(Curso curso, Mentoria mentoria){
        this.curso = curso;
        this.mentoria = mentoria;
    }


    @Override
    public String toString() {
        return "Modulo{" +
                "curso=" + curso +
                ", mentoria=" + mentoria +
                '}';
    }
}//Mentoria
