package view;

import controller.Controller;

public abstract class BaseView {
    protected Controller controlador;

    public BaseView() {

    }

    public void setControlador(Controller c) {
        this.controlador = c;
    }

    public abstract void iniciar();

    public abstract void mostrarMensaje(String mensaje);

    public abstract void mostrarError(String mensaje);

    public abstract void finalizar();


}
