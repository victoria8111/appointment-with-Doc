package com.mhutshow.daktarlagbe.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class PatientTest {
    String name="victoria";
    String address= "address";
    String tel= "0705174128";
    String email= "gatugivictoria@gmail.com";
    String appointmentDate="23 August 2021";
    String condition= "fever";
    Doctor doc=new Doctor();

    Patient patient=new Patient();

    @Test
    public void nameTest() {
        patient.setName(name);
        assertEquals(patient.getName(), "Dylan");
    }

    @Test
    public void addressTest() {
        patient.setAdresse(address);
        assertEquals(patient.getAdresse(), "Address");
    }

    @Test
    public void telTest() {
        patient.setTel(tel);
        assertEquals(patient.getTel(), "0705174128");
    }

    @Test
    public void emailTest() {
        patient.setEmail(email);
        assertEquals(patient.getEmail(), "gatugivictoria@gmail.com");
    }

    @Test
    public void appointmentTest() {
        patient.setDateNaissance(appointmentDate);
        assertEquals(patient.getDateNaissance(), "23 August 2021");
    }

    @Test
    public void conditionTest() {
            patient.setSituationFamiliale(condition);
            assertEquals(patient.getSituationFamiliale(),"fever");
    }
}