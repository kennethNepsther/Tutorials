var horas = 0;
var minutos = 0;
var segundos = 0;
var milsegundos = 0;

var startTimer = function(){
     milsegundosInt = setInterval(function(){
        milsegundos = (milsegundos > 1000) ? 1:(milsegundos + 1);
        setTimeToHTML(horas,minutos,segundos,milsegundos);        

    },1);

     segundosInt = setInterval(function(){
        segundos = (segundos > 59) ? 1:(segundos+1);        

    },1000);

     minutosInt = setInterval(function(){
        minutos = (minutos > 59) ? 1:(minutos+1);        

    },1000 *60);

      horasInt = setInterval(function(){
        horas = (horas > 59) ? 1:(horas+1);        

    },1000 *60*60);
} 

var stopTimer = function(){
    clearInterval(milsegundosInt);
    clearInterval(segundosInt);
    clearInterval(minutosInt);
    clearInterval(horasInt);
}
var resetTimer = function(){
    stopTimer();
    horas = 0; minutos = 0; segundos = 0; milsegundos = 0;
    setTimeToHTML(horas,minutos,segundos,milsegundos);
}

var setTimeToHTML = function(horas,minutos,segundos,milsegundos){
    document.getElementById("horas").innerText= (horas.length == 1) ? ("0"+ horas) : horas;
    document.getElementById("minutos").innerText= (minutos.length == 1) ? ("0"+ minutos) : minutos;
    document.getElementById("segundos").innerText= (segundos.length == 1) ? ("0"+ segundos) : segundos;
    document.getElementById("milsegundos").innerText= milsegundos;

}