const formulario = document.querySelector("form");
const iNome = document.querySelector(".nome");
const iEmail = document.querySelector(".email");
const iSenha = document.querySelector(".senha");
const iTelefone = document.querySelector(".telefone");

function cadastrar(){
    fetch("http://localhost:8080/usuarios",
    {
        headers:{
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        method: "POST",
        body: JSON.stringify({
            nome: iNome.value,
            email: iEmail.value,
            senha: iSenha.value,
            telefone: iTelefone.value
           })
    })
    .then(function (res) { console.log(res) })
    .catch(function (res) { console.log(res) })

    alert("Usuário cadastrado com sucesso!")
};

function limpar(){
    iNome.value = "";
    iEmail.value = "";
    iSenha.value = "";
    iTelefone.value = "";
}

formulario.addEventListener('submit', function(event){
    event.preventDefault();

    cadastrar();
    limpar();
});