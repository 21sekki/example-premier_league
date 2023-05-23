package modelo;

import controlador.EquipoController;
import java.util.List;
import modelo.persistencia.EquipoDAO;
import modelo.persistencia.JDBC.EquipoDAOJDBC;

public class EquipoModelImpl implements EquipoModel {

    private EquipoController c;

    public EquipoController getController() {
        return c;
    }

    public void setController(EquipoController controller) {
        this.c = controller;
    }

    public void nuevoEquipo(Equipo contacto) {
        EquipoDAO dao = new EquipoDAOJDBC();
        dao.create(contacto);
        c.fireDataModelChanged();
    }

    public Equipo obtenerEquipo(String nombre) {
        EquipoDAO dao = new EquipoDAOJDBC();
        return dao.read(nombre);
    }

    public void eliminarEquipo(Equipo contacto) {
        EquipoDAO dao = new EquipoDAOJDBC();
        dao.delete(contacto);
        c.fireDataModelChanged();
    }

    public void actualizarEquipo(Equipo contacto) {
        EquipoDAO dao = new EquipoDAOJDBC();
        dao.update(contacto);
        c.fireDataModelChanged();
    }

    public List<Equipo> obtenerEquipos() {
        EquipoDAO dao = new EquipoDAOJDBC();
        return dao.list();

    }

    //metodo que nos devolverá el número de equipos que hay en un grupo
    public int num_equipos(String grupo) {
        EquipoDAO dao = new EquipoDAOJDBC();
        return dao.num_equipos(grupo);
    }

    //metodo que nos devolverá el número de posiciones igual a la posicion pasada por parametro dentro del grupo especificado
    public int posRepetidas(String grupo, String pos_grupo) {
        EquipoDAO dao = new EquipoDAOJDBC();
        return dao.posRepetidas(grupo, pos_grupo);
    }

}
