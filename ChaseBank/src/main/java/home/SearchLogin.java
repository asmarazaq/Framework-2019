package home;

import base.CommonAPI;

public class SearchLogin extends CommonAPI {

    public void chaselogin() {

        typeOnElementNEnter("//*[@id=\"userId-input-field\"]", "asmarazaq");
        typeOnElementNEnter("//*[@id=\"password-input-field\"]", "Minahil88");
        clickElement("//*[@id=\"signin-button\"]");
    }

}