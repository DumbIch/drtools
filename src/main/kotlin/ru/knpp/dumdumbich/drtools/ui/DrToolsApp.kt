package ru.knpp.dumdumbich.drtools.ui


import javafx.application.Application
import ru.knpp.dumdumbich.drtools.ui.base.Styles
import ru.knpp.dumdumbich.drtools.ui.common.CommonWorkspace
import tornadofx.*


class DrToolsApp : App() {
    override val primaryView = CommonWorkspace::class

    init {
        importStylesheet(Styles::class)
    }

}

fun main(args: Array<String>) {
    println("Launch the Disturbance Recorders Tool Set")
    println("Program arguments: ${args.joinToString()}")
    Application.launch(DrToolsApp::class.java, *args)
}