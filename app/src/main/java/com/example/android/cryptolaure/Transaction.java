package com.example.android.cryptolaure;

class Transaction {
    public float getMontant() {
        return montant;
    }
    public String getMontantString(){
        return String.valueOf(montant);
    }

    public String getAdresse() {
        return adresse;
    }

    public String getStatut() {
        return statut;
    }
    public int getIdTransation(){return idTransation;}
    public String getIdTransactionString(){return String.valueOf(idTransation);}

    private int idTransation;
    private float montant;
    private String adresse;
    private String statut;

    public Transaction( float montant, String adresse, String statut, int idTransation ){
        this.adresse = adresse;
        this.montant = montant;
        this.statut = statut;
        this.idTransation = idTransation;
    }
}
