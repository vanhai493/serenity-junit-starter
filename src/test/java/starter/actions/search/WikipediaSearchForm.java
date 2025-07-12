package starter.actions.search;

import net.serenitybdd.screenplay.targets.Target;

public class WikipediaSearchForm {
    public static Target SEARCH_FIELD = Target.the("Wikipedia search field").locatedBy("#searchInput");
    public static Target SEARCH_BUTTON = Target.the("Search button").locatedBy("input[type='submit']");
}