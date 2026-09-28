package Ejercicio13_controlAccesoTarjeta;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ControladorDeAcceso {
    private Map<String, Integer> nivelRequeridoPorZona = new HashMap<>();
    private Set<String> tarjetasRegistradas = new HashSet<>();

    public void definirZona(String zona, int nivelRequerido) {
        nivelRequeridoPorZona.put(zona, nivelRequerido);
    }

    public void registrarTarjeta(String codigo) {
        tarjetasRegistradas.add(codigo);
    }

    public boolean verificarAcceso(TarjetaRFID tarjeta, String zona) {
        if (!tarjetasRegistradas.contains(tarjeta.getCodigo())) {
            return false;
        }
        Integer requerido = nivelRequeridoPorZona.get(zona);
        return requerido != null && tarjeta.getNivelAcceso() >= requerido;
    }
}
