package model;

import java.util.List;

public interface IRepository {
    List<Cultivo> cargar() throws RepositoryException;

    void guardar(List<Cultivo> cultivos) throws RepositoryException;

    void agregarCultivo(Cultivo cultivo) throws RepositoryException;

    void eliminarCultivo(Cultivo cultivo) throws RepositoryException;

    void modificarCultivo(Cultivo cultivo) throws RepositoryException;

    List<Cultivo> getTodosLosCultivos() throws RepositoryException;

}
