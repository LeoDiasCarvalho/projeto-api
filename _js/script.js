const formulario = document.querySelector("form");
const iNome = document.querySelector(".nome");
const iEmail = document.querySelector(".email");
const iSenha = document.querySelector(".senha");
const iTelefone = document.querySelector(".telefone");

formulario.addEventListener('submit', function(event){
    event.preventDefault();

   const dados = {
    nome: iNome.value,
    email: iEmail.value,
    senha: iSenha.value,
    telefone: iTelefone.value
   };
   
   console.log(dados);
});