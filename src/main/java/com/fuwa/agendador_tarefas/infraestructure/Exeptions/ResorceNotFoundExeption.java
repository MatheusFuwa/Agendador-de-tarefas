package com.fuwa.agendador_tarefas.infraestructure.Exeptions;

public class ResorceNotFoundExeption extends RuntimeException {
    public ResorceNotFoundExeption(String mensagem) {
        super(mensagem);
    }

    public ResorceNotFoundExeption(String mensagem, Throwable throwable){
        super(mensagem, throwable);
    }

}
