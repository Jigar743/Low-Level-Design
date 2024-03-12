package DesignPatterns.Factory;

import DesignPatterns.Factory.Components.Button.Button;
import DesignPatterns.Factory.Components.Button.IosButton;
import DesignPatterns.Factory.Components.Dropdown.Dropdown;
import DesignPatterns.Factory.Components.Dropdown.IosDropdown;
import DesignPatterns.Factory.Components.Menu.IosMenu;
import DesignPatterns.Factory.Components.Menu.Menu;

public class IosUIFactory implements UIFactory{

    @Override
    public Dropdown createDropdown() {
        return new IosDropdown();
    }

    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public Menu createMenu() {
        return new IosMenu();
    }
}
