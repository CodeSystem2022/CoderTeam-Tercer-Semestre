package Semana1.Leccion1.MundoPc;



    public class Raton extends DispositivoEntrada {

        private static int contadorRatones;
        private final int idRaton;

        public Raton(String marca, String tipoEntrada) {
            super(marca, tipoEntrada);
            this.idRaton = ++Raton.contadorRatones;
        }

        //Metodos setter y getter
        public void setContadorRatones (int contadorRatones){
            this.contadorRatones = contadorRatones;
        }

        public int getContadorRatones(){
            return this.contadorRatones;
        }

        public int getIdRaton(){
            return idRaton;
        }

        @Override
        public String toString(){
            return "Raton {" + " IdRaton: " + idRaton  + ". "+ super.toString() + " }";
        }
    }


