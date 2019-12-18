interface Animal{
    fun parler()
    fun qui()
}


fun main(){


    var place = Animalerie()
    var Rex: Animal  = Chien()
    var Robert : Animal = Perroquet()
    var Felix: Animal = Chat()

    place.add(Rex)
    place.add(Robert)
    place.add(Felix)

    place.display()

}





