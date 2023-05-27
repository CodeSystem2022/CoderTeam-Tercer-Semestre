
package accesodatos;


public interface IAccesoDatos {
    int MAX_REGISTRO = 10;//cuando se declara una variable si o si hay que asignarle un valor
    
    //Método insertar es abstracto y sin cuerpo
    void insertar();
    
    void listar();
    
    void acualizar();
    
    void eliminar();
}
