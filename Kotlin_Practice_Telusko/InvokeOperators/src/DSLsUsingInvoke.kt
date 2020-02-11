class DependencyHandler {
    fun compile(coordinate: String){
        //add coordinate to some collection
    }
    fun testCompile(coordinate: String){
        //add coordinate to some collection
    }
    operator fun invoke(action: DependencyHandler.() -> Unit): DependencyHandler {
        this.action()
        return this
    }
}

