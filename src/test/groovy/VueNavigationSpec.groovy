import geb.spock.GebSpec

// creating a GebSpec allows us to write a test that interacts with the browser
class VueNavigationSpec extends GebSpec {

    def "navigate from intro page to component registration"() {
        given:
        // starts the browser and goes to "https://vuejs.org/v2/guide/" (provided as baseUrl in GebConfig.groovy)
        // Note that this url could also be defined as part of the Page object (VueDocsHomePage.groovy)
        // When "to" is called, the "at" function in VueDocsHomePage.groovy is also executed
        to VueDocsHomePage


        when:
        // simulates clicking on the component registration link (defined in VueDocsHomePage.groovy) in the left nav bar
        componentRegistrationLink.click()


        then:
        // runs the "at" function in VueDocsComponentRegistrationPage.groovy
        at VueDocsComponentRegistrationPage

    }

}