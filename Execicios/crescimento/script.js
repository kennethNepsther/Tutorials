function crescimento(){
    var mateus = 174;
    var geovany = 170;
    var anos = 0;

    //for(let cont = geovany; cont>mateus; cont++)
    
    while(geovany<=mateus){
        mateus = mateus+3;
        geovany = geovany+4;

        anos++;
    }
    document.writeln(anos);
}


function factorial_1(n) {
    
    const fatorial = (n) => n === 0 || n === 1 ? 1 : n * fatorial(n-1)   
    
}

function fatorial(valor) {
    // para valores negativos
    if(valor<0) {
      return 'Valor deve ser maior ou igual a zero';
    
      // para valor = 0  ou igual a 1
    } else if ( (valor == 0) || (valor == 1) ) {
      return 1;
     
    } else {
      var acumula = 1;
      for(x=valor;x>1;x--) {
        acumula = acumula * x;
      }
      return acumula;
    } 
}

