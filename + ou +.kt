
fun main(args: Array<String>) {

        val fin = "abandonner"

        var i = 0

        print("Nombre à trouver:")
        var stringInput = readLine()!!

        val stringInput2 = null

        while (stringInput != stringInput2) {

                print("Réponse:")
                var stringInput2 = readLine()!!

                if (stringInput2 == stringInput) {
                        print("Bien joué, tu as gagné \n")
                        print("En ce nombre de tours : ")
                        println(i)
                        break
                }
                else if (stringInput > stringInput2) {
                        print("Dommage, essayez + \n")
                        i++
                }
                else if (stringInput < stringInput2) {
                        print("Dommage, essayez - \n")
                        i++
                }
                if (stringInput2 == fin) {
                        print("Abandonner \n")
                        println("Le nombre est ")
                        println(stringInput +"\n")
                        print("Tu as pris ce nombre de tours : ")
                        println(i)
                        break
                }
        }
}