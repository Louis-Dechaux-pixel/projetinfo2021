/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dechaux.louis.projetinfo2021;
/**
 *
 * @author ldechaux01
 */
public class Barre {
    private int id;
    private Noeud debut;
    private Noeud fin;
    protected Type typebarre;
    
    
    public class Type {
    protected int id;
    protected double prix;
    protected double longmax;
    protected double longmin;
    protected double resmax;
    protected double resmin;    
    
    public Type(){
        this.id= 5;
        System.out.println("definissez la long max");
        this.longmax = Lire.d();
        System.out.println("definissez la long max");
        this.longmin = Lire.d();
        System.out.println("definissez la long max");
        this.resmax = Lire.d();
        System.out.println("definissez la long max");
        this.resmin = Lire.d();
        System.out.println("definissez la long max");
        this.prix = Lire.d();
        
    }
    public void toStrings(){
    System.out.println(this.id);
    System.out.println(this.prix);
    System.out.println(this.longmin);
    System.out.println(this.longmax);
    System.out.println(this.resmax);
    System.out.println(this.resmin);}
    }
    public void toStrings(){
    System.out.println(this.id);
    System.out.println(this.debut);
    System.out.println(this.fin);
    System.out.println(this.typebarre);
    
    
    
    }
    
    
}
