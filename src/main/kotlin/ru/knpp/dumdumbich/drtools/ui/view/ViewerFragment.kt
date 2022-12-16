package ru.knpp.dumdumbich.drtools.ui.view

import tornadofx.*

class ViewerFragment(
    private val logFileViewModel: LogFileViewModel
) : Fragment() {
    override val root = pane {
        title = logFileViewModel.title.value
        textarea(logFileViewModel.logs) {
            this.prefWidthProperty().bind(this@pane.widthProperty())
            this.prefHeightProperty().bind(this@pane.heightProperty())
        }
    }

    init {
        logFileViewModel.title.addListener { _, _, n ->
            this.title = n
        }
    }

    override val refreshable = logFileViewModel.dirty

    override fun onRefresh() {
        //super.onRefresh()
        logFileViewModel.rollback()
    }

}