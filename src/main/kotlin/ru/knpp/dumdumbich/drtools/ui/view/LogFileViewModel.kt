package ru.knpp.dumdumbich.drtools.ui.view

import tornadofx.*

class LogFileViewModel(
    private var logFile: LogFile = LogFile()
) : ItemViewModel<LogFile>() {
    val title = bind { logFile.observable(LogFile::title) } as BindingAwareSimpleStringProperty
    val logs = bind { logFile.observable(LogFile::logs) } as BindingAwareSimpleStringProperty
}