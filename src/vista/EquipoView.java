package vista;

import modelo.EquipoModel;
import controlador.EquipoController;

public interface EquipoView {

    EquipoController getController();

    void setController(EquipoController controller);

    EquipoModel getModel();

    void setModel(EquipoModel model);

    void dataModelChanged();

    void display();

}
