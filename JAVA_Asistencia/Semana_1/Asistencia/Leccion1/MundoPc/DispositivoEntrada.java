package Semana1.Leccion1.MundoPc;


    public class DispositivoEntrada {

        private String tipoEntrada;
        private String marca;

        public DispositivoEntrada( String marca,String tipoEntrada){
            this.tipoEntrada = tipoEntrada;
            this.marca = marca;
        }

        public String getTipoEntrada() {
            return this.tipoEntrada;
        }

        public void setTipoEntrada(String tipoEntrada) {
            this.tipoEntrada = tipoEntrada;
        }

        public String getMarca() {
            return this.marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        @Override
        public String toString() {
            return "DispositivoEntrada {" + "TipoEntrada: " + tipoEntrada + ", Marca: " + marca + '}';
        }
    }

