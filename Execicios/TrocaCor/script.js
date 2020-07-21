function carregar(){    
    var msg = document.getElementById("msg");
    var foto = document.getElementById("img");
    var data = new Date();
    var hora = data.getHours();
     msg.innerHTML=`Agora são ${hora} horas`;

    if (hora >=0 && hora <12) {
        //vermelho
        foto.src ='img/vermelho.png';
        document.body.style.background="#ff2600";
        
    } else if(hora >= 12 && hora < 18) {
        //amarelo
        foto.src= 'img/amarelo.png';
        document.body.style.background="#e5ff00";
    }
    //verde
    else{ foto.src='img/verde.png';
    document.body.style.background="#00ff0d";
    }
}