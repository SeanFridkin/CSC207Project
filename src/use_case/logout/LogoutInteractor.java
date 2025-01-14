package use_case.logout;

import entity.User;

public class LogoutInteractor implements LogoutInputBoundary {

    final LogoutOutputBoundary logoutPresenter;

    public LogoutInteractor(LogoutOutputBoundary logoutOutputBoundary) {
        this.logoutPresenter = logoutOutputBoundary;
    }

    @Override
    public void logOut() { logoutPresenter.prepareLoginView(); }

}