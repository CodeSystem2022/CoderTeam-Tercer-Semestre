//Let persona3 = new Persona("Carla", "Ponce");

class Persona{
    constructor(nombre, apellido){
        this._nombre = nombre;
        this._apellido = apellido;
    }

    get nombre(){
        return this._nombre;
    }
    set nombre(nombre){
        this._nombre = nombre;
    }
    get apellido(){
        return this._apellido;
    }
    set apellido(apellido){
        this._apellido = apellido;
    }
}

class Empleado extends Persona{ //clase hija
    constructor(nombre, apellido , departamento){
        super(nombre, apellido);
        this._departamento = departamento;
    }

    get departamento(){
        return this._departamento;
    }
    set departamento(departamento){
        this._departamento = departamento;
    }
}

Let persona1 = new Persona("Martin","Perez");
console.log(persona1.nombre);
//console.log(persona1); Persona {_nombre: "Martin", _apellido: "Perez"}
persona1.nombre = "juan Carlos"
console.log(persona1.nombre);
Let persona2 = new Persona("Carlos", "Lara");
console.log(persona2.nombre);
//.log(persona2); Persona {_nombre: "Carlos", _apellido: "Lara"}
persona2.nombre = "Maria Laura";
console.log(persona2.nombre);

Let empleado1 = new Empleado("Maria", "Gimenez", "Sistemas");
console.log(empleado1);
console.log(empleado1.nombre);