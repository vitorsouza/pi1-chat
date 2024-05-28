package br.ufes.inf.labes.chat;

import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Mensagem { 
  @Id @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

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
