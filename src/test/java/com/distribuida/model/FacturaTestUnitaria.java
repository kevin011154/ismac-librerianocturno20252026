package com.distribuida.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class FacturaTestUnitaria {

    private Cliente cliente;
    private Factura factura;


    @BeforeEach
    public void setUp(){
        cliente = new Cliente(1, "0606498632", "juan", "taipe", "Direccion1", "0993732222", "jtaipe@correo.com");
        factura = new Factura();
        factura.setIdFactura(1);
        factura.setNumFactura("FAC-0001");
        factura.setFecha(new Date());
        factura.setTotalNeto(100.00);
        factura.setIva(15.00);
        factura.setTotal(115.00);
        //
        factura.setCliente(cliente);
    }


    @Test
    public void facturaTestContructor(){
        assertAll("Validar Contructor - Factura",
                () -> assertEquals(1,factura.getIdFactura()),
                () -> assertEquals("FAC-0001",factura.getNumFactura()),
                () -> assertEquals(100.00,factura.getTotalNeto()),
                () -> assertEquals(15.00,factura.getIva()),
                () -> assertEquals(115.00,factura.getTotal()),
                () -> assertEquals("juan",factura.getCliente().getNombre())
        );
    }



    @Test
    public void facturaTestSetters(){
        cliente = new Cliente(1, "0606498632", "juan2", "taipe", "Direccion1", "0993732222", "jtaipe@correo.com");
        factura.setIdFactura(2);
        factura.setNumFactura("FAC-0002");
        factura.setFecha(new Date());
        factura.setTotalNeto(200.00);
        factura.setIva(30.00);
        factura.setTotal(230.00);


        factura.setCliente(cliente);

        assertAll("Validator Setters - Factura",
                () -> assertEquals(2,factura.getIdFactura()),
                () -> assertEquals("FAC-0002",factura.getNumFactura()),
                () -> assertEquals(200.00,factura.getTotalNeto()),
                () -> assertEquals(30.00,factura.getIva()),
                () -> assertEquals(230.00,factura.getTotal()),
                () -> assertEquals("juan2",factura.getCliente().getNombre())
        );
    }




    @Test
    public void facturaTestToString(){
        String str = factura.toString();
        assertAll("Validar to string - Factura",
                () -> assertTrue(str.contains("1")),
                () -> assertTrue(str.contains("FAC-0001")),
                () -> assertTrue(str.contains("100.0")),
                () -> assertTrue(str.contains("15.0")),
                () -> assertTrue(str.contains("115.0")),
                () -> assertTrue(str.contains("juan"))

        );
    }



    @Test
    public void facturaTestInyector(){
        assertAll("validar metodo inyector - Factura",
                () -> assertNotNull(factura.getCliente()),
                () -> assertNotNull("taipe",factura.getCliente().getApellido())
                );

    }

    @Test
    public void facturaTestValoresNegativos(){
        factura.setTotal(-100.00);
        assertAll("Validar datos negativos - factura",
                () -> assertEquals(-100,factura.getTotal())
                 );

    }

}

