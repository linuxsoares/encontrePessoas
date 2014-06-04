package controllers;

import models.Desaparecidos;
import play.*;
import play.data.Form;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {

        return ok(index.render("Your new application is ready."));
    }

    public static Result inicio(){

        return ok(views.html.inicio.render());
    }

    public static Result sobre(){

        return ok(views.html.sobre.render("", play.core.PlayVersion.current()));
    }

    public static Result formularioCadastroDesaparecido(){
        Form<Desaparecidos> form = Form.form(Desaparecidos.class);
        return ok(formularioCadastroDesaparecido.render(form));
    }

    public static Result novaPessoaDesaparecida(){
        return TODO;
    }

}
