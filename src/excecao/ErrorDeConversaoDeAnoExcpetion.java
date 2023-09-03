package br.com.alura.screenmatch.excecao;

public class ErrorDeConversaoDeAnoExcpetion extends RuntimeException {
    private String mensagem;
    public ErrorDeConversaoDeAnoExcpetion(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
