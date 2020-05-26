package com.app.parallelscreen

import android.content.Intent
import android.os.Bundle
import com.stephentuso.welcome.BasicPage
import com.stephentuso.welcome.TitlePage
import com.stephentuso.welcome.WelcomeActivity
import com.stephentuso.welcome.WelcomeConfiguration

class MainActivity : WelcomeActivity() {

    override fun configuration(): WelcomeConfiguration {
        return WelcomeConfiguration.Builder(this)
            .defaultBackgroundColor(R.color.background)
            .page(TitlePage(R.drawable.logo_title, "Models Thought"))
            .page(
                BasicPage(
                    R.drawable.image_basic,
                    "Thought of the day",
                    "People are like stained - glass windows. They sparkle and shine when the sun is out," +
                            " but when the darkness sets in, their true beauty is revealed only if there is a light from within"
                ).background(R.color.background_basic)
            )
            .page(
                BasicPage(
                    R.drawable.image_basic_2, "Thought of the day",
                    "The soul that sees beauty may sometimes walk alone"
                )
            )
            .swipeToDismiss(true)
            .build()
    }

    override fun completeWelcomeScreen() {
        super.completeWelcomeScreen()
        startActivity(Intent(this, HelloActivity::class.java))
        finish()
    }

    override fun canScrollToNextPage(): Boolean {
        return super.canScrollToNextPage()
    }

    override fun canScrollToPreviousPage(): Boolean {
        return super.canScrollToPreviousPage()
    }


}
