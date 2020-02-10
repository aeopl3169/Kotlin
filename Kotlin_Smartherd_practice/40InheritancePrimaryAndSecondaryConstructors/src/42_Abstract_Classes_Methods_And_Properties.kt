fun main(){

}

abstract class Persons{ // we can not create instance/object of abstract class
    abstract var name: String // we can not instantiate/value to a abstract property
    abstract fun eat()      // abstract classes, method and properties are "open" by default
    open fun getHeight(){}  // Can have non abstract methods
    final fun goTo(){}
    public final fun goToSchool(){} // Normal methods are public by default in abstract
}

class Indians: Persons(){
    override var name: String = "Shiva"
//        get() = ""
//        set(value) {}
    override fun eat() {
    }
    override fun getHeight(){} // This is optional, we can get the function by overriding or leave it.
//    override fun goToSchool(){} //'goToSchool' in 'Persons' is final and cannot be overridden
}