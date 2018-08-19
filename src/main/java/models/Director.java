package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "directors")
public class Director extends Artist{

    public List<Film> films;

    public Director(){

    }

    public Director(String name, int age){
        super(name, age);
        films = new ArrayList<Film>();
    }

    @OneToMany(mappedBy = "director", fetch = FetchType.LAZY)
    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }
}
