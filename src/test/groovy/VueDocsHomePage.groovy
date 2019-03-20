import geb.Page

/*
 Creating a geb Page is helpful. Although you could technically access elements within the Specification
 itself (using selectors as discussed below), having the Page object defined makes the content reusable and
 easier to maintain. If there are changes in the pages content, the updates only need to occur in the Page
 object itself rather than in every Spec that would have used the element.
*/
class VueDocsHomePage extends Page {

    /*
     This "at" method can be used to make sure that, as you are navigating between web pages,
     the browser lands on the page that you anticipate. Everything inside the body of the at block
     should resolve to a true value for the check to pass.
     In this case, we know we're on the Vue.js main page when the title in the
     head tag of the HTML contains the word Introduction.
    */
    static at = { title.contains("Introduction") }

    /*
     The content block is used to define elements on the page that the Specification might need to access or interact with.
     Elements can be selected using a CSS selector and should resolve so that only a single element matches the criteria.
     Typically, an id is a safe way to go, but combinations of characteristics that would make the element unique are possible.
     Once these elements have been selected, they can be used in the Spec by using the method name
    */
    static content = {

        /*
         We want to select the element that is an "a" tag with the displayed text containing Component Registration
         Then, the spec can interact with this element using the componentRegistrationLink handle.
        */
        componentRegistrationLink{ $( "a", text:contains("Component Registration") ) }
    }
}
