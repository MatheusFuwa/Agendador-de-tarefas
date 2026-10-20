package com.fuwa.agendador_tarefas.infraestructure.Exeptions;

public class ResorceNotFoundException extends RuntimeException {
    public ResorceNotFoundException(String mensagem) {
        super(mensagem);
    }

    public ResorceNotFoundException(String mensagem, Throwable throwable){
        super(mensagem, throwable);
    }

}
