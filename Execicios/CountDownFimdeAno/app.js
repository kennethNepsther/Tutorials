
function contador(params) {
    var dataActual =new Date();
    var dataEvento =new Date(2020, 00, 01);

    var horaActual = dataActual.getTime();
    var horaEvento = dataEvento.getTime();

    var tempoRestante = horaEvento-horaActual;
   

    var segundosRestante = Math.floor(tempoRestante / 1000);
    var minutosRestante = Math.floor(segundosRestante / 60);
    var horasRestante = Math.floor(minutosRestante / 60);
    var diasRestante = Math.floor(horasRestante / 24);
    

    horasRestante %=24;
    minutosRestante %=60;
    segundosRestante %=60;
    
   

    horasRestante = (horasRestante < 10) ? "0" + horasRestante : horasRestante;
    minutosRestante = (minutosRestante < 10) ? "0" + minutosRestante: minutosRestante;
    segundosRestante = (segundosRestante < 10) ? "0" + segundosRestante : segundosRestante;

    

    document.getElementById("dias").innerText= diasRestante;
    document.getElementById("horas").innerText= horasRestante;
    document.getElementById("minutos").innerText= minutosRestante;
    document.getElementById("segundos").innerText= segundosRestante;

    setTimeout(contador,1000);  
}
    contador();