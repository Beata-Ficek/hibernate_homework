import db.DBHelper;
import models.*;

public class Runner {

    public static void main(String[] args) {
        Studio warnerBros = new Studio("WarnerBros");
        DBHelper.save(warnerBros);

        Director aranofsky = new Director("Aranofsky", 46);
        DBHelper.save(aranofsky);

        Director fincher = new Director("Fincher", 49);
        DBHelper.save(fincher);

        Director vanDormael = new Director("van Dormael", 56);
        DBHelper.save(vanDormael);

        Film fightClub = new Film("Fight Club", Genre.THRILLER, warnerBros, fincher);
        DBHelper.save(fightClub);
        Film mrNobody = new Film("Mr Nobody", Genre.WEIRD, warnerBros, vanDormael);
        DBHelper.save(mrNobody);
        Film mother = new Film("Mother!", Genre.WEIRD, warnerBros, aranofsky);
        DBHelper.save(mother);

        Actor jaredLeto = new Actor("Jared Leto", 124);
        DBHelper.save(jaredLeto);
        Actor jenniferLawrence = new Actor("Jennifer Lawerence", 27);
        DBHelper.save(jenniferLawrence);
        Actor javierBardem = new Actor("Javier Bardem", 50);
        DBHelper.save(javierBardem);

        DBHelper.addFilmtoActor(fightClub, jaredLeto);
        DBHelper.addFilmtoActor(mrNobody, jaredLeto);
        DBHelper.addFilmtoActor(mother, jenniferLawrence);
        DBHelper.addFilmtoActor(mother, javierBardem);

    }

}
