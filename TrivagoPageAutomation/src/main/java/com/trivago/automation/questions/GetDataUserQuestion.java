package com.trivago.automation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class GetDataUserQuestion implements Question<String> {

    private Target target;

    public GetDataUserQuestion(Target target) {
        this.target = target;
    }

    @Override
    public String answeredBy(Actor actor) {
        return target.resolveFor(actor).getText().trim();
    }

    public static GetDataUserQuestion in (Target target){
        return new GetDataUserQuestion(target);
    }
}
