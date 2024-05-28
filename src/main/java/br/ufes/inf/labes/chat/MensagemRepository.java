package br.ufes.inf.labes.chat;

import org.springframework.data.repository.CrudRepository;

public interface MensagemRepository extends CrudRepository<Mensagem, Long> {
  
}
