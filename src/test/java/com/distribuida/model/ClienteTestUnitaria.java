package com.distribuida.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClienteTestUnitaria {

    private Cliente cliente;


    @BeforeEach
    public void setUp() {
        cliente = new Cliente(1, "0606498632", "juan", "taipe", "Direccion1", "0993732222", "jtaipe@correo.com");

    }


    @Test
    public void testClienteConstructor() {
        assertAll("Validar datos Cliente - Contructor",
                () -> assertEquals(1, cliente.getIdCliente()),
                () -> assertEquals("0606498632", cliente.getCedula()),
                () -> assertEquals("juan", cliente.getNombre()),
                () -> assertEquals("taipe", cliente.getApellido()),
                () -> assertEquals("Direccion1", cliente.getDiereccion()),
                () -> assertEquals("0993732222", cliente.getTelefono()),
                () -> assertEquals("jtaipe@correo.com", cliente.getCorreo())
        );


    }


    @Test
    public void testClienteSetters(){
        cliente.setIdCliente(2);
        cliente.setCedula(06064922222);
        cliente.setNombre("juan2");
        cliente.setApellido("taipe2");
        cliente.setDiereccion("Direccion2");
        cliente.setTelefono("0995555555");
        cliente.setCorreo("jtaipe22@correo.com");

        assertAll("Validar datos Cliente - Settrs",
                () -> assertEquals(1, cliente.getIdCliente()),
                () -> assertEquals("0606498632", cliente.getCedula()),
                () -> assertEquals("juan", cliente.getNombre()),
                () -> assertEquals("taipe", cliente.getApellido()),
                () -> assertEquals("Direccion1", cliente.getDiereccion()),
                () -> assertEquals("0993732222", cliente.getTelefono()),
                () -> assertEquals("jtaipe@correo.com", cliente.getCorreo())
        );





    }
}
