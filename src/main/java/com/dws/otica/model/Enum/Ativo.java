
package com.dws.otica.model.Enum;

/**
 *
 * @author Flavio
 */
public enum Ativo  {
    
    SIM("S"),
    NAO("N");
    
    private final String status;
    
    Ativo(final String status){
        this.status = status;
    }
    public String isAtivo() {
        return this.status;
    }

    
}
