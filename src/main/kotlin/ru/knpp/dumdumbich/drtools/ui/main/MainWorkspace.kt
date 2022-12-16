package ru.knpp.dumdumbich.drtools.ui.main

import javafx.application.Platform
import ru.knpp.dumdumbich.drtools.ui.view.EmptyView
import ru.knpp.dumdumbich.drtools.ui.view.ViewerController
import tornadofx.*

class MainWorkspace : Workspace("Disturbance Recorders Tool Set") {

    private val viewerController: ViewerController by inject()

    init {
        menubar {
            menu("File") {
                item("View") { id = viewFileMenuItemId }.action {
                    log.info("View existing file")
                    workspace.dock(viewerController.newViewer(), true)
                }
                item("New") { id = newFileMenuItemId }.action {
                    log.info("Create new file")
                }
                item("Edit") { id = editFileMenuItemId }.action {
                    log.info("Edit existing file")
                }
                item("Save", "Shortcut+S") { id = saveFileMenuItemId }.action {
                    log.info("Save changes")
                }
                separator()
                item("Quit", "Shortcut+Q") { id = quitFileMenuItemId }.action {
                    log.info("Leaving main workspace")
                    Platform.exit()
                }
            }
            menu("Device") {

            }
            menu("Net") {

            }
            menu("Windows") {
                item("Close all...") { id = closeAllWindowsMenuItemId }.action {
                    log.info("Close all windows")
                    workspace.dock(EmptyView(), true)
                }
            }
            menu("Help") {
                item("About...") { id = aboutHelpMenuItemId }.action {
                    log.info("Show about message")
                }
            }
        }
    }


    companion object {
        const val viewFileMenuItemId = "File->View"
        const val newFileMenuItemId = "File->New"
        const val editFileMenuItemId = "File->Edit"
        const val saveFileMenuItemId = "File->Save"
        const val quitFileMenuItemId = "File->Quit"
        const val closeAllWindowsMenuItemId = "Windows->Close all"
        const val aboutHelpMenuItemId = "Help->About"
    }

}