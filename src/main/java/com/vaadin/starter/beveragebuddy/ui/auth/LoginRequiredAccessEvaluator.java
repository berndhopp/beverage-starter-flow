package com.vaadin.starter.beveragebuddy.ui.auth;

import com.vaadin.flow.router.Location;
import com.vaadin.flow.server.VaadinSession;

import org.ilay.navigation.Access;
import org.ilay.navigation.AccessEvaluator;

public class LoginRequiredAccessEvaluator implements AccessEvaluator<LoginRequired> {
    @Override
    public Access evaluate(Location location, Class<?> aClass, LoginRequired loginRequired) {
        return Boolean.TRUE.equals(VaadinSession.getCurrent().getAttribute("user_is_logged_in"))
                ? Access.granted()
                : Access.restricted("");
    }
}
