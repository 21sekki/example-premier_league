package modelo;

import java.io.Serializable;

public interface Equipo extends Serializable {

    String getPos_grupo();

    String getNombre();

    String getPais();

    String getGrupo();

    void setPos_grupo(String pos_grupo);

    void setNombre(String nombre);

    void setPais(String pais);

    void setGrupo(String grupo);

}
