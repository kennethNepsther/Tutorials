let relogio = document.getElementById("clock");
let cor = document.getElementById("hex-color");

function hexRelogio(params) {
    let tempo = new Date();
    let horas = tempo.getHours().toString();
    let minutos = tempo.getMinutes().toString();
    let segundos = tempo.getSeconds().toString();

    if(horas.length < 2){
        horas ="0"+horas;
    }
    
    if(minutos.length < 2){
        minutos ="0"+minutos;
    }
    if(segundos.length < 2){
        segundos ="0"+segundos;
    }

    let relogioStr = horas+":"+minutos+":"+segundos;
    let corStr = "#"+horas + minutos + segundos;

    relogio.textContent = relogioStr;
    cor.textContent = corStr;

    document.body.style.backgroundColor = corStr;
    
}
hexRelogio();
setInterval(hexRelogio,1000);
