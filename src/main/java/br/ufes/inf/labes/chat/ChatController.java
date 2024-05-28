package br.ufes.inf.labes.chat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatController {
	@Autowired
	private MensagemRepository mensagemRepository;

  @PostMapping("/chat")
  public void enviarMensagem(@RequestBody Mensagem mensagem) {
    mensagemRepository.save(mensagem);
  }

  @GetMapping("/chat")
  public Iterable<Mensagem> obterMensagens() {
    return mensagemRepository.findAll();
  }
}
