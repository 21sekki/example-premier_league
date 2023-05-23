package modelo.persistencia;

import java.util.List;
import modelo.Equipo;

public interface EquipoDAO {

    Equipo read(String pk);

    void create(Equipo equipo);

    void update(Equipo equipo);

    void delete(Equipo equipo);
    
    //void createAMP(Equipo equipo);
    
    int num_equipos(String grupo);
    int posRepetidas(String grupo, String pos_grupo);

    List<Equipo> list();

}
