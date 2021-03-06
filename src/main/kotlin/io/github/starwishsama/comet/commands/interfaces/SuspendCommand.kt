package io.github.starwishsama.comet.commands.interfaces

import io.github.starwishsama.comet.objects.BotUser
import io.github.starwishsama.comet.sessions.Session
import net.mamoe.mirai.message.MessageEvent

/**
 * 阻塞命令
 *
 * 用于接收用户输入, 利用 [Session] 接收用户输入的内容
 *
 */
interface SuspendCommand {
    suspend fun handleInput(event: MessageEvent, user: BotUser, session: Session)
}