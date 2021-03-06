package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by gilmar on 31/05/14.
 */

@Entity
public class Desaparecidos extends Model {

    @Id @GeneratedValue
    public long id;

    public String nome;
    public String sexo;
    public long idadeQuandoDesapareceu;
    public long idadeAtual;
    public String problemaMental;
    public String tipoFisico;
    public String corDaPele;
    public long peso;
    public long altura;
    public String olhos;
    public String cabelos;
    public Date dataCadastro;
    public Date dataAtualizacao;
}
