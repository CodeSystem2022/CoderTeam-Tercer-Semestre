package Semana1.Leccion1.MundoPc;

public class Main {
    public static void main(String[] args) {


        //Importar la clase
        Monitor monitor1 = new Monitor("Samsung", 24);
        Raton raton1 = new Raton("Samsung", "Bluetooth");
        Teclado teclado1 = new Teclado("Samsung", "Bluetooth");
        Computadora pc1 = new Computadora("Pc1", monitor1, teclado1, raton1);

        Orden orden1 = new Orden();
        orden1.agregarComputadora(pc1);
        orden1.mostrarOrden();

        Monitor monitor2 = new Monitor("Redragon", 24);
        Raton raton2 = new Raton("Redragon", "USB");
        Teclado teclado2 = new Teclado("Redragon", "Bluetooth");
        Computadora pc2 = new Computadora("Pc2", monitor2, teclado2, raton2);

        Orden orden2 = new Orden();
        orden2.agregarComputadora(pc2);
        orden2.mostrarOrden();

        Monitor monitor3 = new Monitor("Asus", 24);
        Raton raton3 = new Raton("Redragon", "USB");
        Teclado teclado3 = new Teclado("Logitech", "Bluetooth");
        Computadora pc3 = new Computadora("Pc3", monitor3, teclado3, raton3);

        Orden orden3 = new Orden();
        orden3.agregarComputadora(pc3);
        orden3.mostrarOrden();

        Monitor monitor4 = new Monitor("Samsung", 24);
        Raton raton4 = new Raton("Logitech", "USB");
        Teclado teclado4 = new Teclado("Logitech", "USB");
        Computadora pc4 = new Computadora("Pc4", monitor4, teclado4, raton4);

        Orden orden4 = new Orden();
        orden4.agregarComputadora(pc4);
        orden4.mostrarOrden();

        Monitor monitor5 = new Monitor("Samsung", 22);
        Raton raton5 = new Raton("Samsung", "USB");
        Teclado teclado5 = new Teclado("HP", "USB");
        Computadora pc5 = new Computadora("Pc5", monitor5, teclado5, raton5);

        Orden orden5 = new Orden();
        orden5.agregarComputadora(pc5);
        orden5.mostrarOrden();

        Monitor monitor6 = new Monitor("Samsung", 27);
        Raton raton6 = new Raton("Redragon", "USB");
        Teclado teclado6 = new Teclado("Redragon", "USB");
        Computadora pc6 = new Computadora("Pc6", monitor6, teclado6, raton6);

        Orden orden6 = new Orden();
        orden6.agregarComputadora(pc6);
        orden6.mostrarOrden();

        Monitor monitor7 = new Monitor("Samsung", 27);
        Raton raton7 = new Raton("Redragon", "USB");
        Teclado teclado7 = new Teclado("Redragon", "USB");
        Computadora pc7 = new Computadora("Pc7", monitor7, teclado7, raton7);

        Orden orden7 = new Orden();
        orden7.agregarComputadora(pc7);
        orden7.mostrarOrden();

        Monitor monitor8 = new Monitor("Asus", 22);
        Raton raton8 = new Raton("Redragon", "USB");
        Teclado teclado8 = new Teclado("Samsung", "Bluetooth");
        Computadora pc8 = new Computadora("Pc8", monitor8, teclado8, raton8);

        Orden orden8 = new Orden();
        orden8.agregarComputadora(pc8);
        orden8.mostrarOrden();

        Monitor monitor9 = new Monitor("Asus", 24);
        Raton raton9 = new Raton("Redragon", "USB");
        Teclado teclado9 = new Teclado("Samsung", "Bluetooth");
        Computadora pc9 = new Computadora("Pc9", monitor9, teclado9, raton9);

        Orden orden9 = new Orden();
        orden9.agregarComputadora(pc9);
        orden9.mostrarOrden();

        Monitor monitor10 = new Monitor("Asus", 22);
        Raton raton10 = new Raton("Redragon", "USB");
        Teclado teclado10 = new Teclado("Samsung", "Bluetooth");
        Computadora pc10 = new Computadora("Pc10", monitor10, teclado10, raton10);

        Orden orden10 = new Orden();
        orden10.agregarComputadora(pc10);
        orden10.mostrarOrden();

    };
}