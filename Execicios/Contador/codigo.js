function contar(params) {
    var inicio = document.getElementById("txtinicio");
    var fim = document.getElementById("txtfim");
    var passo = document.getElementById("txtpasso");
    var resultado = document.querySelector("div#result");

    if(Number(inicio.value.length) ==0 ||Number(fim.value.length) ==0||Number(passo.value.length) ==0){
        alert("Faltam dados...");
        
   
    }else{
        // var i = Number(inicio.value);
        // var f = Number(fim.value);
        // var c = Number(passo.value);       
        var i = Number(inicio.value);
        var f = Number(fim.value);
        var p = Number(passo.value);

            if(p==0){
                alert(" O passo não pode ser Zero! considerando passo 1");
                p=1;
            }
            if(i<f){
                //contagem crescente
                for(let cont = i; cont<=f; cont+=p){
                    resultado.innerHTML+=`${cont} `;
                    //resultado.innerHTML += cont;
                    //resultado.innerHTML+=`${cont}\u{1F603} `;// com Imoji
                 }
            }else{
                //contagem crescente
                for(let cont = i; cont>=f; cont-=p){
                    resultado.innerHTML+=`${cont} `;
                }

        
            }
    }
}    


  