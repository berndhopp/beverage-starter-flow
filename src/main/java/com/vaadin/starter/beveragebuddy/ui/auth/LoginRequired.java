package com.vaadin.starter.beveragebuddy.ui.auth;

import org.ilay.navigation.RestrictionAnnotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@RestrictionAnnotation(LoginRequiredAccessEvaluator.class)
public @interface LoginRequired {
}
