package DesignPatterns.Factory;

import DesignPatterns.Factory.Components.Button.Button;
import DesignPatterns.Factory.Components.Dropdown.Dropdown;
import DesignPatterns.Factory.Components.Menu.Menu;

public interface UIFactory {
    Button createButton();
    Dropdown createDropdown();
    Menu createMenu();
}
