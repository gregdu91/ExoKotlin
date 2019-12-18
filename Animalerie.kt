class Chat : Animal {

    override fun parler() {
        println("Miaow")
    }

    override fun qui() {
        println("Je suis un chat")
    }
}

class Chien : Animal{


    override fun parler() {
        println("Waouf !")
    }

    override fun qui() {
        println("Je suis un chien")
    }

}
class Perroquet : Animal {

    override fun parler() {
        println("Repète")
    }

    override fun qui() {
        println("Je suis un perroquet")
    }
}

class Vache : Animal {

    override fun parler() {
        println("Meuh !")
    }

    override fun qui() {
        println("Je suis une vache")
    }
}

class Serpent : Animal {

    override fun parler() {
        println("Ssssss")
    }

    override fun qui() {
        println("Je suis un serpent")
    }
}

class Lion : Animal {

    override fun parler() {
        println("Rrrouah !")
    }

    override fun qui() {
        println("Je suis un lion")
    }
}

interface Animal{
    fun parler()
    fun qui()
}


fun main(){


    var place = Animalerie()
    var Rex: Animal  = Chien()
    var Joselin: Animal = Perroquet()
    var Felix: Animal = Chat()
    var Gertrude : Animal = Vache()
    var Kaa : Animal = Serpent()
    var Simba : Animal = Lion()

    place.add(Rex)
    place.add(Joselin)
    place.add(Felix)
    place.add(Gertrude)
    place.add(Kaa)
    place.add(Simba)

    place.display()

}

class Animalerie{

    var list = mutableSetOf<Animal>()

    fun add(animalList : Animal){
        list.add(animalList)
    }

    fun display(){
        for (animal in list){
            animal.parler()
            animal.qui()
        }
    }
}
