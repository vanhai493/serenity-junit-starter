package starter.acceptancetests;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.annotations.CastMember;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.support.ui.ExpectedConditions;
import starter.actions.navigation.NavigateTo;

import starter.actions.search.WikipediaSearch;

@ExtendWith(SerenityJUnit5Extension.class)
class WhenSearchingForTerms {

    @CastMember
    Actor actor;

    @Test
    @DisplayName("Should be able to search for 'apple' on Wikipedia")
    void searchForAppleOnWikipedia() {
        actor.attemptsTo(
                NavigateTo.theWikipediaHomePage(),
                WaitUntil.the(ExpectedConditions.titleContains("Wikipedia")),
                WikipediaSearch.forTerm("Apple"),
                Ensure.that(TheWebPage.title()).containsIgnoringCase("Apple")
        );
    }
}
