/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javareto2;

/**
 *
 * @author GIOVANNI
 */
public class Asistencia {
    private String idTripulante;
    private int idDia, idRegistro;

    public Asistencia(int idRegistro, int idDia, String idTripulante) {
        this.idRegistro = idRegistro;
        this.idDia = idDia;
        this.idTripulante = idTripulante;
    }

    public int getIdDia() {
        return idDia;
    }

    public String getIdTripulante() {
        return idTripulante;
    }

    public int getIdRegistro() {
        return idRegistro;
    }
        
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Asistencia{idRegistro=").append(idRegistro);
        sb.append(", idDia=").append(idDia);
        sb.append(", idTripulante=").append(idTripulante);
        sb.append('}');
        return sb.toString();
    }

}
