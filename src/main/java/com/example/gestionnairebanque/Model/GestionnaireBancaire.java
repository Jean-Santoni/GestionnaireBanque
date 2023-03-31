package com.example.gestionnairebanque.Model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class GestionnaireBancaire {
    private ArrayList<Transaction> listTransaction;
    private ArrayList<Taux> listTaux;
    private Double soldeCompte;

    public GestionnaireBancaire() {
        this.listTransaction = new ArrayList<Transaction>() ;
        this.listTaux = new ArrayList<Taux>();
        this.soldeCompte = 0.0;
    }
    public void chargementTaux(){
        // Chemin du fichier
        Path P1 = Paths.get("D:","\\Java3il\\GestionnaireBanque\\Data\\taux.txt");
        try(BufferedReader br = Files.newBufferedReader(P1)){
// lecture de la première ligne
            byte[] tabByte = Files.readAllBytes(P1);
            String nom="";
            String vtamp="";
            Double valeur=0.0;
            char chartampon=' ';
            int cpt = 0;
// Parcours et affichage
            for(byte caract : tabByte){
                chartampon = (char) caract;
                if(' '!=chartampon){
                    if(cpt ==0){
                        nom+=chartampon;
                    }
                    if(cpt ==3){
                        vtamp+=chartampon;
                    }
                }else {
                    cpt++;
                }
            }
            valeur=valeur.doubleValue();
            System.out.println(nom+ "   "+valeur);


        }catch(IOException e){// Gestion des exceptions
// À ne pas oublier, évidemment !
// Cas possibles : fichier inexistant, manque de droits...
            e.printStackTrace();
        }
    }

    public ArrayList<Transaction> getListTransaction() {
        return listTransaction;
    }

    public ArrayList<Taux> getListTaux() {
        return listTaux;
    }

    public Double getSoldeCompte() {
        return soldeCompte;
    }
    public void enregistrementList(){

        Path P1 = Paths.get("D:","\\Java3il\\GestionnaireBanque\\Data\\SaveList.bin");
        try(ObjectOutputStream oos = new ObjectOutputStream(
                Files.newOutputStream(P1))){
            oos.writeObject(listTransaction);
        }catch(Exception e){
            e.printStackTrace();
        }

    }
    public void recuprationListe(){
        ArrayList<String> maListe = new ArrayList<>();
        Path P1 = Paths.get("D:","\\Java3il\\GestionnaireBanque\\Data\\SaveList.bin");
        try(ObjectInputStream ois = new ObjectInputStream(
                Files.newInputStream(P1))){
            listTransaction = (ArrayList<Transaction>) ois.readObject();
        }catch(Exception e){
            e.printStackTrace();
        }

    }

    public void operationCompte(Transaction t){
        if (t.getType()=='c'){
            if(t.getMontant()<1000){
            this.soldeCompte+=t.getMontant()-(t.getMontant()*0.03);
            }else if(t.getMontant()>999&& t.getMontant()<10000){
                this.soldeCompte+=t.getMontant()-(t.getMontant()*0.02);
            }else {
                this.soldeCompte+=t.getMontant()-(t.getMontant()*0.001);
            }
        }else{
            this.soldeCompte-=t.getMontant();
        }

    }

}
