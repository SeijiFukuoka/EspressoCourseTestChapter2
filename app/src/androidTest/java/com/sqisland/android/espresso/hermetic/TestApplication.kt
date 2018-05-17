package com.sqisland.android.espresso.hermetic

class TestApplication : GreetingApplication() {
    override lateinit var component: ApplicationComponent
}