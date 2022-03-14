package data

class Vehichle(paramsType: String, paramsName:String, paramsBrand:String, paramsYears:String) {

    //properties
    var type = paramsType
    var name = paramsName
    var brand = paramsBrand
    var years = paramsYears

    init {
        println("Vechicle created")
    }

    constructor(paramsType: String,paramsName:String, paramsYears: String)
        :this(paramsType,paramsName, "",paramsYears){
            println("Secondary Constructor Created!")
        }

}