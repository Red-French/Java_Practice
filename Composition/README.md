# Java_Practice - Composition

Composition is a “has a” relationship.

With composition, instead of having a class extend another, you have an instance of the class as a field of your class.

Using ‘extends’, you can only inherit from 1 class.
Composition takes care of this.
    With composition, you bring into a class other classes that make up that class.  An example would be class PC which uses composition for class Case, class Monitor, and class Motherboard to build the PC computer.

ex:
`
    public class PC {

    // the PC has class Case, class Monitor, and class Motherboard which make up this PC class
    private Case theCase;  // the Case, Monitor and Motherboard classes each have a constructor and getters
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public Case getTheCase() {
        return theCase;
    }
    public Monitor getMonitor() {
        return monitor;
    }
    public Motherboard getMotherboard() {
        return motherboard;
    }

}`
