package io.github.starwishsama.comet.objects.pojo.bilibili.liveroom

import com.google.gson.annotations.SerializedName

open class LiveInfo {
    @SerializedName("room_info")
    val roomInfo: RoomInfo = RoomInfo("", "", "", 0, 0, 0, "", "")
}