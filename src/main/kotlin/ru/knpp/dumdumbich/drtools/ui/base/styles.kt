package ru.knpp.dumdumbich.drtools.ui.base

import javafx.scene.paint.Color
import tornadofx.*

class Styles : Stylesheet() {
    companion object {
        val wrapper by cssclass()
        val consola by cssclass()
    }

    init {
        Stylesheet.root {
            prefHeight = 600.px
            prefWidth = 800.px
        }
        textArea and consola {
            baseColor= Color.BLACK
            fontFamily = "Consolas"
            textFill = Color.LIGHTGRAY
        }
    }
}