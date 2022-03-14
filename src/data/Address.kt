package data

class Address {

    var street = ""
    var country = ""
    var city = ""
    var province = ""

    constructor(paramsStreet: String, paramsCoutry: String, paramsCity: String, paramsProvince: String){
        street = paramsStreet
        country = paramsCoutry
        city = paramsCity
        province = paramsProvince

        println("First Secondary Constructor Created!")
    }

    constructor(paramsStreet: String, paramsCoutry: String)
        :this(paramsStreet,paramsCoutry,"",""){
        println("Second Secondary Constructor Created!")

    }



}