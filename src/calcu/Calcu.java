package calcu;

public class Calcu {

    public static void main(String[] args) {
        pantalla inicio = new pantalla();
        inicio.setTitle("Calculadora basica");
        inicio.setBounds(300, 300, 400, 400); //posicion y dimensiones
        inicio.setResizable(false); //desactivar redimensión
        inicio.insertarPanel();
        inicio.insertarEtiquetas();
        inicio.insertarTexto();
        inicio.insertarBotones();

    }

}
