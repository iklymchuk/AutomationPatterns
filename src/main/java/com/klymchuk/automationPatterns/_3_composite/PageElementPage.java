package com.klymchuk.automationPatterns._3_composite;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.Table;

/**
 * Created by iklymchuk on 2/27/17.
 *
 * PAGE ELEMENT / COMPOSITE
 *
 * We try to use more complex structure based on logical gradation.
 *
 * As example HTMLElements/ JDI.
 *
 */
@Name("Account table form")
@FindBy(css = "table")
public class PageElementPage extends HtmlElement {

    //Table section
    @Name("Select the Account table")
    @FindBy(css = "table")
    private Table accounts;

    @Name("Filter button")
    @FindBy(id = "filter")
    private Button searchButton;

    public void filteringAccountTableByUserId() {
        searchButton.click();
    }
}
