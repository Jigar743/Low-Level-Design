package DesignPatterns.Factory;

import DesignPatterns.Factory.Components.Button.AndroidButton;
import DesignPatterns.Factory.Components.Button.Button;
import DesignPatterns.Factory.Components.Dropdown.AndroidDropdown;
import DesignPatterns.Factory.Components.Dropdown.Dropdown;
import DesignPatterns.Factory.Components.Menu.AndroidMenu;
import DesignPatterns.Factory.Components.Menu.Menu;

public class AndroidUIFactory implements UIFactory {

    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new AndroidDropdown();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }
}
