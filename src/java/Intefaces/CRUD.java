
package Intefaces;

import Entidad.Marca;
import java.util.List;


public interface CRUD {
    public List listar();
    public Marca list(int id);
    public boolean add(Marca per);
    public boolean edit(Marca per);
    public boolean eliminar(int id);
}
