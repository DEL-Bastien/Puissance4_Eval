package com.example.puissance4_eval.models;

public class Param {
    public static int width = 5;
    public static int height = 5;
    private static int nbJoueur = 2;

    public static int getNbJoueur() {
        return nbJoueur;
    }

    public void setNbJoueur(int nbJoueur) {
        Param.nbJoueur = nbJoueur;
    }

    public static int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        Param.width = width;
    }

    public static int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        Param.height = height;
    }

}
