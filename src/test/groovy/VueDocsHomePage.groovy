import geb.Page

class VueDocsHomePage extends Page {

    static at = { title.contains("Introduction") }

    static content = {
        componentRegistrationLink{ $( "a", text:contains("Component Registration") ) }
    }
}
