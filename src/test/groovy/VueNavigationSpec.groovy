import geb.spock.GebSpec

class VueNavigationSpec extends GebSpec {

    def "navigate from intro page to component registration"() {
        given:
        to VueDocsHomePage

        when:
        componentRegistrationLink.click()

        then:
        at VueDocsComponentRegistrationPage

    }

}