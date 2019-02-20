function mostrar1(){
	
	var valor=document.getElementById("Tipo_c").value;

	if(valor==="Mario"){
		document.getElementById("img1").src="imagenes/Mario-Bros.png";
	}else if(valor==="Luigi"){
		document.getElementById("img1").src="imagenes/Luigi.png";
	}else if(valor==="Toad"){
		document.getElementById("img1").src="imagenes/Toad_super_mario.png";
	}

}

function mostrar2(){
	
	var valor=document.getElementById("Tipo_p").value;

	if(valor==="N"){
		document.getElementById("img2").src="imagenes/vacio.png";
	}else if(valor==="FF"){
		document.getElementById("img2").src="imagenes/Flor_de_Fuego.png";
	}else if(valor==="FH"){
		document.getElementById("img2").src="imagenes/Flor_de_hielo.png";
	}else if(valor==="B"){
		document.getElementById("img2").src="imagenes/Bellota.png";
	}else if(valor==="C"){
		document.getElementById("img2").src="imagenes/Super_Bell.png";
	}

}

function mostrar3(){
	
	var valor=document.getElementById("Tipo_m").value;

	if(valor==="N"){
		document.getElementById("img3").src="imagenes/vacio.png";
	}else if(valor==="YV"){
		document.getElementById("img3").src="imagenes/yoshi.png";
	}else if(valor==="YAZ"){
		document.getElementById("img3").src="imagenes/yoshi_azul.png";
	}else if(valor==="YR"){
		document.getElementById("img3").src="imagenes/yoshi_rosa.png";
	}else if(valor==="YA"){
		document.getElementById("img3").src="imagenes/Yoshi_Amarillo.png";
	}

}

function validar(){

        var k=0;

	while(k===0){	

	if(document.getElementById("Tipo_c").value===""){

		document.getElementById("Tipo_c").value=prompt('el potagonista debe ser Mario, Luigi o Toad');

	}else {

		k=1;	

	}
	
    }
      
}