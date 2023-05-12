package com.plangestionestudios.gestion.services;

import com.plangestionestudios.gestion.entities.AcademicUnit;

import java.util.List;

public interface AcademicUnitService {
    public boolean deleteAcademicUnit(int id);
    public List<AcademicUnit> getAllAcademicUnits();
    public AcademicUnit updateAcademicUnit(int id, AcademicUnit academicUnit);
    public AcademicUnit getAcademicUnitById(int id);
    public AcademicUnit createAcademicUnit(AcademicUnit academicUnit);
}