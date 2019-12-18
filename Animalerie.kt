class Animalerie{

    var list = mutableSetOf<Animal>()

    fun add(animalList : Animal){
        list.add(animalList)
    }

    fun display(){
        for (animal in list){
            animal.qui()
            animal.parler()
        }
    }
}
