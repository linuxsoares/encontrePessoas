package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by gilmar on 31/05/14.
 */


public class UsuarioSistema extends Model {

    @Id @GeneratedValue
    public long id;
    public String email;
    public String password;
    public String fullName;
    public boolean isAdmin;

    public UsuarioSistema(){}

    public UsuarioSistema(String email, String fullName, String password){
        this.email= email;
        this.fullName = fullName;
        this.password = password;
    }

}
