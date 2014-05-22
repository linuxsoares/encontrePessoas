package controllers;

import play.*;
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

}
