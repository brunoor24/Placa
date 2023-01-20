fun main(){
// llamar  a las funciones test
    println("Prueba con guion 1 paso:"+dashSeparateTest())
    println("Prueba sin guion 1.0 error:"+dashSeparateTest2())
    println("Prueba del tamaño 2 paso:"+sizeLicPlateTest())
    println("Prueba del tamaño mas digitos 2.0 error:"+sizeLicPlate2Test())
    println("Prueba de provincias 3 paso:"+ getProvinceTest())
    println("Prueba provincias sin nombre especifico 3.0 error:"+ getProvinceTest2())
}

//CODIGO


fun sizeLicPlate(licPlate: String):Boolean{
    val tamaño = 8
    val  placa = licPlate.length
    return placa == tamaño
}
fun dashSeparate(licPlate: String):Boolean{
    val guion = "-"
    return licPlate.substring(3,4) == guion
}
fun getProvince(licPlate: String):String{
    val provincia = when (licPlate.substring(0,1)){
        "A" -> ("Azuay")
        "G" -> ("Guayas")
        "P" -> ("Pichincha")
        else -> ("Desconocido")
    }
    return (provincia)
}

//TEST

//Ejemplo
fun sizeLicPlateTest(): Boolean {
    val res = sizeLicPlate("AAA-8989")
    val esp= true
    return ( esp == res)
}

fun sizeLicPlate2Test(): Boolean {
    val res = sizeLicPlate("EAA-89890")
    val esp= true
    return ( esp == res)
}
fun dashSeparateTest(): Boolean {
    val res = dashSeparate("AAA-8989")
    val esp= true
    return ( esp == res)
}

fun dashSeparateTest2(): Boolean {
    val res = dashSeparate("AAA8989")
    val esp= true
    return ( esp == res)
}

fun getProvinceTest(): Boolean {
    val esp = "Azuay"
    val res = getProvince("AAA-8989")
    return( esp == res)
}

fun getProvinceTest2(): Boolean {
    val esp = "Desconocido"
    val res = getProvince("AAA-8989")
    return( esp == res)
}