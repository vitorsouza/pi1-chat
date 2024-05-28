package br.ufes.inf.labes.chat;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class ChatControllerTest {
  @Mock
  private MensagemRepository mensagemRepository;

  @InjectMocks
  private ChatController chatController;

  private Mensagem mensagem = new Mensagem("Marvin", "I won't enjoy it.");

  @BeforeEach
  public void init() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  public void testEnviarMensagem() {
    chatController.enviarMensagem(mensagem);
    verify(mensagemRepository, times(1)).save(mensagem);
  }

  @Test
  public void testObterMensagens() {
    chatController.obterMensagens();
    verify(mensagemRepository, times(1)).findAll();
  }
}
