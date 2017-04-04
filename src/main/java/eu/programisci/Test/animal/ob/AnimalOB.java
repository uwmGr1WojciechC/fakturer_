package eu.programisci.Test.animal.ob;

import javax.persistence.*;

/**
 * Created by student on 04.04.17.
 */
@Entity
@Table(name="animal")
@SequenceGenerator(allocationSize = 1, name = "SEKWENCJA", sequenceName = "gen_animals_id")
public class AnimalOB {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEKWENCJA")
    private Long id;

    @Column(name="gatunek")
    private String gatunek;

    @Column(name="rasa")
    private String rasa;

    @Column(name="imie")
    private String imie;

    @Column(name="wiek")
    private Integer wiek;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGatunek() {
        return gatunek;
    }

    public void setGatunek(String gatunek) {
        this.gatunek = gatunek;
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public Integer getWiek() {
        return wiek;
    }

    public void setWiek(Integer wiek) {
        this.wiek = wiek;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public String getUwagi() {
        return uwagi;
    }

    public void setUwagi(String uwagi) {
        this.uwagi = uwagi;
    }

    @Column(name="kolor")
    private String kolor;

    @Column(name="uwagi")
    private String uwagi;
}
