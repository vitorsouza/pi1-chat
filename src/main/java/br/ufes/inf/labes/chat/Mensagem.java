package br.ufes.inf.labes.chat;

import java.time.LocalDateTime;

public class Mensagem { 
  private LocalDateTime horario;
  private String remetente;
  private String mensagem;

  public Mensagem() {
    horario = LocalDateTime.now();
  }

  public Mensagem(String remetente, String mensagem) {
    this();
    this.remetente = remetente;
    this.mensagem = mensagem;
  }

  public LocalDateTime getHorario() {
    return horario;
  }

  public String getRemetente() {
    return remetente;
  }

  public String getMensagem() {
    return mensagem;
  }
}
