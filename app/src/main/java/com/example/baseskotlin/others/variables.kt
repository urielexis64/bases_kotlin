package com.example.baseskotlin.others

import android.util.Log
import kotlin.math.max

/*
* En Kotlin todo es un objeto.
* No hay tipos primitivos y no existe void.
* Si algo no devuelve nada, está devolviendo Unit object
* Las variables pueden ser mutables e inmutables, usaremos inmutables siempre
* que sea posible. (var y val)
* Los tipos son definidos después del nombre de la variable, con dos puntos y espacio
* (var nombre: tipo)
* */

class Variables{
    private var variable0 = 1
    private var variable1 = 1.toByte()
    private var variable2 = -123
    private var variable3 = 2147483648
    private var variable4 = 1.1.toFloat()
    private var variable5 = 1.1
    private var variable6 = 'a'
    private var variable7 = "a"
    private var variable8 = true
    private var variable9 = arrayOf(1,2,3,4,5)
    private var variable10 = arrayOfNulls<Int>(10)
    private val variable11 = "Esta variable es read-only/inmutable/constante"

    // Show case para Byte
    private fun showCase1(){
        Log.w("VARIABLE0","Es variable0 un Integer? --> "+ (variable0 is Int))
        Log.w("VARIABLE1","Es variable0 un Integer? --> "+ (variable1 is Byte ))
    }

    // Show case para Int
    private fun showCase2(){
        Log.w("VARIABLE2","Es variable0 un Integer? --> "+ (variable2 is Int))
        variable2 = Int.MAX_VALUE
    }

    // Show case para Long
    private fun showCase3(){
        Log.w("VARIABLE3","Es variable0 un Long? --> "+ (variable3 is Long))
    }

    // Show case para Float
    private fun showCase4(){
        Log.w("VARIABLE4","Es variable0 un Float? --> "+ (variable4 is Float))
    }

    // Show case para Double
    private fun showCase5(){
        Log.w("VARIABLE5","Es variable0 un Double? --> "+ (variable5 is Double))
    }

    // Show case para Char
    private fun showCase6(){
        Log.w("VARIABLE6","Es variable6 un Char? --> "+ (variable6 is Char))
    }

    // Show case para String
    private fun showCase7(){
        Log.w("VARIABLE7","Es variable0 un String? --> "+ (variable7 is String))

        // String Literals
        variable7 = "Hola, mundo\nAdios, Mundo" // Java Style
        variable7 = """
                    Hola, mundo
                    Adios, Mundo" 
                    """ // Kotlin Style
        // String templates
        var points = 9
        var maxPoints = 10
        variable7 = "Hola, tengo "+ points + "puntos sobre "+ maxPoints // Java
        variable7 = "Hola, tengo $points  puntos sobre $maxPoints" // Kotlin

    }

    // Show case para Boolean
    private fun showCase8(){
        Log.w("VARIABLE8","Es variable0 un Integer? --> "+ (variable8 is Boolean))
    }

    // Show case para Array<Int>
    private fun showCase9(){
        Log.w("VARIABLE9","Es variable0 un Integer? --> "+ (variable9 is Array<Int>))
    }

    // Show case para Array<Int?>
    private fun showCase10(){
        Log.w("VARIABLE9","Es variable0 un Integer? --> "+ (variable10 is Array<Int?>))

        variable10 = arrayOfNulls(3)
        variable10 = arrayOf(1,2,3,null,5)

        variable10[0]?.toFloat() // Safe Calls -- En caso de ser null, devuelve null
        variable10[0]?.toFloat() ?: "Ërror" // Elvis operator -- En caso de ser null, devuelve "Error"
        variable10[0]!!.toFloat() // The !! operator -- Estar seguros de que no es null
    }

    // Show case para Array<Int>
    fun showCases(){
        showCase1()
        showCase2()
        showCase3()
        showCase4()
        showCase5()
        showCase6()
        showCase7()
        showCase8()
        showCase9()
        showCase10()
    }

}








