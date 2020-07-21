//var divtempo = document.querySelector("div#tempo");
var contador = new Number();
var contador = 10;

function inicio(params) {
    if((contador-1) >= 0){
        contador -= 1;
        if(contador == 0){
            contador = 'Pronto';
        }else if(contador < 10){
            contador =`0${contador}`;
        }
        tempo.innerText = contador;// id da div onde vai ser mostrada o contador
        //divtempo.innerHTML = contador;
        setTimeout('inicio()',1000);
    }

    
}