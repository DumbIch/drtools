package ru.knpp.dumdumbich.drtools.domain.entity

import kotlin.time.Duration

/*
В соответствии с ГОСТ Р 58601-2019 п.9.13.6:
"Представление информации пользователю об автономном РАС:
- территориальная энергосистема
-

 - по возможности проставить значения по умолчанию
 - поля без значений по умолчанию переместить в начало
 */

data class DisturbanceRecorder(
     val id: String, // нужно уточнить в ГОСТ и РЭ на ЦРАП
    // val equipmentContainer: EquipmentContainer,
    // val recorderType: RecorderType,
    val duration: Duration,
    val reason: ReasonType,
    val startup: StartupType,
    val isNestedStartup: Boolean = false
)
