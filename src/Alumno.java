/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Al3x
 */
public class Alumno extends Persona{
    private String Matricula;
    private Carrera carrera = new Carrera();

    /**
     * @return the Matricula
     */
    public String getMatricula() {
        return Matricula;
    }

    /**
     * @param Matricula the Matricula to set
     */
    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    /**
     * @return the carrera
     */
    public Carrera getCarrera() {
        return carrera;
    }

    /**
     * @param carrera the carrera to set
     */
    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }
}
