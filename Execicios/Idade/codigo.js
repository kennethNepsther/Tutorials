var diaNasc = document.querySelector("#Fdia");
var mesNasc = document.querySelector("#Fmes");
var anoNasc = document.querySelector("#Fano");
var resultado = document.getElementById("res");
var botao = document.querySelector("#btn");
    botao.onclick = function(){CalculoDeidade()}



function CalculoDeidade(params) {
    
    let data_actual = new Date();  
    
    if (Number(diaNasc.value) == 0 || Number(diaNasc.value) == null ||Number(anoNasc.value) == 0 || Number(anoNasc.value) == null ||  Number(mesNasc.value == 0 ||  Number(mesNasc.value) == null)
    ||  Number(data_actual.getFullYear()) < Number(anoNasc.value)){
        
        resultado.innerHTML = "Dados Inválidos";
    
    }else{
      
    let anos = Number(data_actual.getFullYear()) - Number(anoNasc.value);
    
    if(Number(data_actual.getMonth()) < Number(mesNasc.value) ){

        anos --;
        resultado.innerHTML = "estas com "+ anos+" anos";
           

    } else{
        resultado.innerHTML = "estas com "+ anos+" anos";

    } 

}


    diaNasc.value = '';
    mesNasc.value = '';
    anoNasc.value = '';
  
    
   
}