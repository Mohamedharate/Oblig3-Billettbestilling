package webprog.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BillettRepository {

    @Autowired
    private JdbcTemplate db;

    public void lagreBillett(Billett nyBillett){
        String sql = "INSERT INTO BILLETT (fornavn, etternavn, film, telefonnr, mail, antall) VALUES(?,?,?,?,?,?)";
        db.update(sql, nyBillett.getFornavn(),nyBillett.getEtternavn(),nyBillett.getFilm(),nyBillett.getTelefonnr(),nyBillett.getMail(),nyBillett.getAntall());
    }
    public List<Billett> hentAlleBilletter(){
        String sql = "SELECT * FROM BILLETT ";
        List<Billett> alleBilletter = db.query(sql, new BeanPropertyRowMapper(Billett.class));
        return  alleBilletter;
    }
    public void slettAlleBilletter(){
        String sql = "DELETE FROM BILLETT";
        db.update(sql);
    }
}