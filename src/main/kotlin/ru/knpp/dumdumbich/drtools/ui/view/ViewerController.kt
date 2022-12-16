package ru.knpp.dumdumbich.drtools.ui.view

import tornadofx.*

class ViewerController : Controller() {

    private val viewerModelList = mutableListOf<ViewerFragment>().asObservable()

    fun newViewer(): ViewerFragment {
        val logFile = LogFileViewModel()
        logFile.title.value = "Log File ${viewerModelList.size}"
        logFile.commit()

        val viewer = ViewerFragment(logFile)
        viewerModelList.add(viewer)
        return viewer
    }

}