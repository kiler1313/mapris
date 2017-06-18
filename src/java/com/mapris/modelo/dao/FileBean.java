/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mapris.modelo.dao;

import javax.servlet.http.Part;

/**
 *
 * @author SMEGS
 */
public class FileBean {

    private String fileName;
    private String type;
    private long size;
    private Part part;

    public FileBean() {
    }

    public FileBean(String fileName, String type, long size, Part part) {
        this.fileName = fileName;
        this.type = type;
        this.size = size;
        this.part = part;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileNameFull() {
        if (part.getSubmittedFileName() != null) {
            String[] datos = part.getSubmittedFileName().split("\\\\");
            return datos[datos.length - 1];
        }
        return null;
    }
    public String getExtension(){
        if (part.getSubmittedFileName() != null) {
            String[] datos = part.getSubmittedFileName().split("\\.");
            return datos[datos.length -1];
        }
        return null;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public Part getPart() {
        return part;
    }

    public void setPart(Part part) {
        this.part = part;
    }

    @Override
    public String toString() {
        return "FileBean{" + "fileName=" + fileName + ", type=" + type + ", size=" + size + ", part=" + part + '}';
    }

}
