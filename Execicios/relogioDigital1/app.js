let resultado = document.querySelector('div#relogio');
function relogio(params) {
    let dataCompleta = new Date();

    let mes = dataCompleta.getMonth();
    

     let ano = dataCompleta.getFullYear();
     let dia2 = dataCompleta.getDate();
     let dia = dataCompleta.getDay();
    let horas = dataCompleta.getHours();
    let minutos = dataCompleta.getMinutes();
    let segundos = dataCompleta.getSeconds(); 
     

//===================================================
    horas = (horas < 10)    ? "0"+horas : horas;
    minutos = (minutos < 10)  ? "0"+minutos : minutos;
    segundos = (segundos < 10) ? "0"+segundos : segundos;
    

    if(dia==0){
        dia = "Domingo";
    }else if(dia==1){
        dia = "Segunda feira";
    }else if(dia==2){
        dia = "Terça feira";
    }else if(dia==3){
        dia = "Quarta feira";
    }else if(dia==4){
        dia = "Quinta feira";
    }else if(dia==5){
        dia = "Sexta feira";
    }else if(dia==6){
        dia = "Sábado";
    }
//=====================================================
   
   resultado.innerHTML = horas+":"+minutos+":"+segundos+"<br>"; 
    
    resultado.innerHTML += dia+": "+dia2+"-"+mes+"-"+ano;

     //setInterval(relogio,10);

     setTimeout(relogio,1000)
    
}
