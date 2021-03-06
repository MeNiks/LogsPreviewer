package com.niks.filelog.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = LogDWO.TABLE_NAME)
data class LogDWO(
    @ColumnInfo(name = TAG)
    val tag: String,
    @ColumnInfo(name = MESSAGE)
    val message: String,
    @ColumnInfo(name = LONG_INFO)
    val longInfo: String,
    @PrimaryKey
    @ColumnInfo(name = TIMESTAMP)
    val timestamp: Long = System.currentTimeMillis()
) {
    companion object {
        const val TABLE_NAME = "logs"
        const val TAG = "tag"
        const val LONG_INFO = "long_info"
        const val MESSAGE = "message"
        const val TIMESTAMP = "timestamp"
    }
}