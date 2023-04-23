// Modificamos los elementos del arreglo
autos[1] = "Volvo";
console.log(autos[1]);

//Agregamos nuevos valores al arreglo - metodo push
autos.push("Audi");
console.log(autos);

//Otras formas de agregar elementos al arreglo
autos[autos.length] = "Mercedes Benz";
console.log(autos);

//Tercera forma de agregar elementos: Con esta forma se debe de tener CUIDADO
autos[6] = "Porsche";
console.log(autos);
