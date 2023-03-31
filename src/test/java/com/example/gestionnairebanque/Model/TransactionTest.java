package com.example.gestionnairebanque.Model;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class TransactionTest {
    private Transaction t = new Transaction("cheque",'c',50.0);
    @Test
    void testgetNom() throws IOException {
        assertEquals("cheque",t.getNom());

    }
    @Test
    void testgetType() throws IOException {
        assertEquals('c',t.getType());
    }
    @Test
    void testgetMontant() throws IOException {
        assertEquals(50.0,t.getMontant());
    }

}