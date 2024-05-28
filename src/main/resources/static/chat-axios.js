import "./axios.js";

function enviarMensagem() {
  let remetente = document.getElementById('remetente').value;
  let mensagem = document.getElementById('mensagem').value;
  axios.post('/chat', {
    "remetente": remetente,
    "mensagem": mensagem
  }).then(function (response) {
    atualizarChat();
  }).catch(function (error) {
    console.log(error);
  });
}

function atualizarChat() {
  axios.get('/chat').then(function (response) {
    var chat = "";
    var data = response.data;
    for (var i = 0; i < data.length; i++) {
      chat += `[${data[i].horario}] ${data[i].remetente}: ${data[i].mensagem}<br />`;
    }
    document.getElementById('chat').innerHTML = chat;
  }).catch(function (error) {
    console.log(error);
  });
}

document.getElementById('btnEnviar').addEventListener('click', enviarMensagem);
atualizarChat();
