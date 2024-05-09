package br.ufes.inf.labes.chat;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatController {
  private List<Mensagem> mensagens = new ArrayList<>();

  @PostMapping("/chat")
  public void enviarMensagem(@RequestBody Mensagem mensagem) {
    mensagens.add(mensagem);
  }

  @GetMapping("/chat")
  public Iterable<Mensagem> obterMensagens() {
    return mensagens;
  }
}
