/**
 * Created by fazenda on 30/11/17.
 */

public class Evento {

    private String nome;
    private String data;
    private String local;
    private String capacidade;
    private String promotor;
    private String patrocinio;
    private double valorIngresso;

    public Evento(String nome, String data, String local, String capacidade, String promotor, String patrocinio, double valorIngresso) {
        this.nome = nome;
        this.data = data;
        this.local = local;
        this.capacidade = capacidade;
        this.promotor = promotor;
        this.patrocinio = patrocinio;
        this.valorIngresso = valorIngresso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(String capacidade) {
        this.capacidade = capacidade;
    }

    public String getPromotor() {
        return promotor;
    }

    public void setPromotor(String promotor) {
        this.promotor = promotor;
    }

    public String getPatrocinio() {
        return patrocinio;
    }

    public void setPatrocinio(String patrocinio) {
        this.patrocinio = patrocinio;
    }

    public double getValorIngresso() {
        return valorIngresso;
    }

    public void setValorIngresso(double valorIngresso) {
        this.valorIngresso = valorIngresso;
    }
}
