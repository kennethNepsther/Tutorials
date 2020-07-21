function verificar(params) {
    var data = new Date();
    var ano = data.getFullYear();
    var formAno = document.getElementById("txtano");
    var resultado = document.querySelector("div#result");

    if(formAno.value.length == 0 || Number(formAno.value) > ano){
        alert("Verfique os dados e preencha novamente...");
    }else{
        var sexo = document.getElementsByName("sexo");
        var idade = ano- Number(formAno.value);
        var imagem = document.createElement('img');// criação de um elemento no Html
        //imagem.setAttribute('id','foto');// definir atributo do elemento criado
        var genero;
        if(sexo[0].checked){
            genero="homem";
            if(idade>=0 && idade<=18){
                //criança
                imagem.setAttribute("src","img/teste1.png");
            }else if(idade>18 && idade<=45){
                //adulto
                imagem.setAttribute('src','img/adlt1.png');
            }else{
                //Idoso
                imagem.setAttribute('src','img/av1.png');
            }
        }else{
            genero = "mulher";
            if(idade>=0 && idade<=18){
                //criança
                imagem.setAttribute('src','img/teste2.png');
            }else if(idade>18 && idade<=45){
                //adulto
                imagem.setAttribute('src','img/adlt2.png');
            }else{
                //Idoso
                imagem.setAttribute('src','img/av2.png');
            }
        }
        resultado.style.textAlign="center";
        resultado.innerHTML=`Encotramos ${genero} de ${idade} anos`;
        resultado.appendChild(imagem);
        
        

    }
    
}