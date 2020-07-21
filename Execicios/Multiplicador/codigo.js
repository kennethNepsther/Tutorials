function multiplicar(params) {
    var numero = document.getElementById("numero");
    var tabuada = document.getElementById("tab");
  
    if(Number(numero.value.length) ==""){
        alert("O campo está vazio...");
        
   
    }else{
        tabuada.innerHTML='';    
        var num = Number(numero.value);

        for(let i=1;i<=12;i++){
            let item = document.createElement('option');
            item.text =`${num} x ${i} = ${num*i}`;
            tabuada.appendChild(item);
            
            

        }
        
       

    }
}    


  