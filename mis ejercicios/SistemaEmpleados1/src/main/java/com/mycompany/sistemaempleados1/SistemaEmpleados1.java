package com.mycompany.sistemaempleados1;

import com.mycompany.sistemaempleados1.gui.Principal;


public class SistemaEmpleados1 {

    public static void main(String[] args) {
        Principal principal= new Principal();
        principal.setVisible(true);
        principal.setResizable(false);
        principal.setTitle("Sistema de registro de empleados");
        principal.setLocationRelativeTo(null);
        
    }
}
