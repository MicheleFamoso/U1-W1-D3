package Esercizio3;

public class Cliente {
    private int codiceCliente;
    private String nomeCognome;
    private String email;
    private int dataIscrizione;

    //Costruttore


    public Cliente(int codiceCliente, String nomeCognome, String email, int dataIscrizione) {
        this.codiceCliente = codiceCliente;
        this.nomeCognome = nomeCognome;
        this.email = email;
        this.dataIscrizione = dataIscrizione;
    }

    // Get e set


    public int getCodiceCliente() {
        return codiceCliente;
    }

    public void setCodiceCliente(int codiceCliente) {
        this.codiceCliente = codiceCliente;
    }

    public String getNomeCognome() {
        return nomeCognome;
    }

    public void setNomeCognome(String nomeCognome) {
        this.nomeCognome = nomeCognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getDataIscrizione() {
        return dataIscrizione;
    }

    public void setDataIscrizione(int dataIscrizione) {
        this.dataIscrizione = dataIscrizione;
    }
}
