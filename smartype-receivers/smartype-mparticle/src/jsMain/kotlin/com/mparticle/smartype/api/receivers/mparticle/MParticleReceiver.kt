package com.mparticle.smartype.api.receivers.mparticle

import com.mparticle.smartype.api.MessageReceiver
import kotlinx.serialization.json.JsonObject

actual class MParticleReceiver : MessageReceiver {
    override fun receive(message: JsonObject) {

    }

}
