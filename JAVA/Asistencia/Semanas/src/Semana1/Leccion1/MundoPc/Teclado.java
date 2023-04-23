package Semana1.Leccion1.MundoPc;

public class Teclado extends DispositivoEntrada{
    private static int contadorTeclado = 1;
    private final int idTeclado;

    public Teclado(String marca, String tipoEntrada){
        super(marca, tipoEntrada);
        this.idTeclado = Teclado.contadorTeclado++;
    }

    public int getIdTeclado(){
        return this.idTeclado;
    }

    @Override
    public String toString(){
        return "Teclado { ID#: " + this.getIdTeclado() + ". "  + super.toString() + " } ";
    }
}
