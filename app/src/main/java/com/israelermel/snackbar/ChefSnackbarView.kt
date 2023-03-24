package com.israelermel.snackbar

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.Group
import androidx.core.view.isVisible
import com.google.android.material.snackbar.ContentViewCallback

class ChefSnackbarView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr), ContentViewCallback {

    private val chefImage: TextView

    init {
        View.inflate(context, R.layout.view_snackbar_chef, this)
        this.chefImage = findViewById(R.id.toogle_button)
        chefImage.setOnClickListener {
            findViewById<Group>(R.id.cardGroup).apply {
                isVisible = !isVisible
            }
        }
        clipToPadding = false
    }

    override fun animateContentIn(delay: Int, duration: Int) {
//        val scaleX = ObjectAnimator.ofFloat(chefImage, View.SCALE_X, 0f, 1f)
//        val scaleY = ObjectAnimator.ofFloat(chefImage, View.SCALE_Y, 0f, 1f)
//        val animatorSet = AnimatorSet().apply {
//            interpolator = OvershootInterpolator()
//            setDuration(500)
//            playTogether(scaleX, scaleY)
//        }
//        animatorSet.start()
    }

    override fun animateContentOut(delay: Int, duration: Int) {

    }
}