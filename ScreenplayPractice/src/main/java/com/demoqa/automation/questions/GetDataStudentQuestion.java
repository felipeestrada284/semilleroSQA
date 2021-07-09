package com.demoqa.automation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class GetDataStudentQuestion implements Question<String> {
    private Target target;

    public GetDataStudentQuestion(Target target) {
        this.target = target;
    }

    @Override
    public String answeredBy(Actor actor) {
        return target.resolveFor(actor).getText().trim();
    }

    public static GetDataStudentQuestion in (Target target){
        return new GetDataStudentQuestion(target);
    }
}
