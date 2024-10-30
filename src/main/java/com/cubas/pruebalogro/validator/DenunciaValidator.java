package com.cubas.pruebalogro.validator;

import com.cubas.pruebalogro.entity.Denuncia;
import com.cubas.pruebalogro.exception.ValidateException;

public class DenunciaValidator {
    public static void save(Denuncia registro) {
        if(registro.getTitulo() == null || registro.getTitulo().trim().isEmpty()) {
            throw new ValidateException("El titulo es requerido");
        }
        if(registro.getTitulo().length() > 100) {
            throw new ValidateException("El titulo no debe exceder los 100 caracteres");
        }
    }
}
