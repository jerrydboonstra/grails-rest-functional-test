import org.codehaus.groovy.grails.test.junit4.JUnit4GrailsTestType

eventAllTestsStart = {
    phasesToRun << "functional"
}

def testTypeName = "functional"
def testDirectory = "functional"
def junitTestType = new JUnit4GrailsTestType(testTypeName, testDirectory)

functionalTests = [junitTestType]

customTestPhasePreparation = {
    functionalTestPhasePreparation()
}
customTestPhaseCleanUp = {
    functionalTestPhaseCleanUp()
}