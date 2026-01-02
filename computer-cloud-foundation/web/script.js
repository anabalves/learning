const ano = document.getElementById("ano");
const anoAtual = new Date();

ano.innerHTML = anoAtual.getFullYear();

function alertar() {
    alert("Olá! Essa é uma introdução a Web")
}