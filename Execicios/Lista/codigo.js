var numero = document.getElementById("fnum");
let Lista = document.querySelector('select#flista');
resultado = document.querySelector('div#res');
let valores =[];

function eNumero(num){
    if(Number(num)>=1 && Number(num)<=100){
        return true;
         
    }else{
        return false;
    } 
}

function estaNalista(num, list) {
    if(list.indexOf(Number(num))!=-1){
        return true;
    }else{
        return false;
    }
    
}

function adicionar(params) {
    if(eNumero(numero.value) && !estaNalista(numero.value, valores)){

        valores.push(Number(numero.value));
        let item = document.createElement('option');
        item.text =`valor ${numero.value} adicionado`;
        Lista.appendChild(item);
        resultado.innerHTML ='';// limpa na função finalizar
        
    }else{
        alert("Valor inválido ou já encontrado na lista");
    }
    numero.value = '';
    numero.focus();
}
  
function finalizar(params) {
    if(valores.length == 0){
        alert(" Adicione elementos Antes de finalizar");
    }else{
        let maior = valores[0];
        let menor = valores[0];
        let total = valores.length;
        let soma = 0;
        let media = 0;
        

        for(let cont in valores){
            soma += valores[cont]
            if(valores[cont]>maior){
                maior = valores[cont]; 
            }
            if(valores[cont]<menor){
                menor = valores[cont];
            }
        }
        media = soma/total;
        resultado.innerHTML ='';       
        resultado.innerHTML +=`Contém ${total} elementos cadastrados<br>`;
        resultado.innerHTML +=`o maior inserido é: ${maior} <br>`;
        resultado.innerHTML +=`o menor inserido é: ${menor} <br>`;
        resultado.innerHTML +=`A soma de todos valores  é: ${soma} <br>`;
        resultado.innerHTML +=`A media dos  valores no array  é: ${media}`;
    }
    
}