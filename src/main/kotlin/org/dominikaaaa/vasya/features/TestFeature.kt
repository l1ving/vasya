package org.dominikaaaa.vasya.features

import org.dominikaaaa.vasya.Feature

object TestFeature : Feature("TestFeature", null, Category.PLAYER) {
    override fun onEnable() {
        mc.player?.sendChatMessage("enabled $name")
    }

    override fun onDisable() {
        mc.player?.sendChatMessage("disabled $name")
    }

}