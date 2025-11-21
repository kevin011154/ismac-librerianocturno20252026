package com.distribuida.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
        cliente.setCedula("06064922222");
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
    @Test
    public void clienteTestString(){
        String str = cliente.toString();
        assertAll("Validar datos cliente - To String",
                () -> assertTrue(str.contains("1")),
                () -> assertTrue(str.contains("F")),
                () -> assertTrue(str.contains("juan")),
                () -> assertTrue(str.contains("taipe")),
                () -> assertTrue(str.contains("Dirreccion1")),
                () -> assertTrue(str.contains("0993732222")),
                () -> assertTrue(str.contains("jtaipe@correo.com"))
                );
    }
}
