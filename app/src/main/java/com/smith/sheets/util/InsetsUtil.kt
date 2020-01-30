package com.smith.sheets.util

import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import com.google.android.material.card.MaterialCardView

fun View.setInsetsToMargins(
    top: Boolean = false,
    bottom: Boolean = false
) {
    ViewCompat.setOnApplyWindowInsetsListener(this) { _, insets ->

        val lp = layoutParams as ConstraintLayout.LayoutParams

        if (top) {
            lp.topMargin = lp.bottomMargin + insets.systemWindowInsetBottom
        }

        if (bottom) {
            lp.bottomMargin = lp.bottomMargin + insets.systemWindowInsetBottom
        }

        layoutParams = lp
        insets
    }
}

fun View.setInsetsToHeight(top: Boolean = false, bottom: Boolean = false) {
    ViewCompat.setOnApplyWindowInsetsListener(this) { _, insets ->
        val lp = layoutParams
        if (top) {
            lp.height = lp.height + insets.systemWindowInsetTop
        }
        if (bottom) {
            lp.height = lp.height + insets.systemWindowInsetBottom
        }
        insets
    }
}

fun MaterialCardView.setInsetsToContentPadding(top: Boolean = false, bottom: Boolean = false) {
    ViewCompat.setOnApplyWindowInsetsListener(this) { _, insets ->
        var cpt = contentPaddingTop
        val cpr = contentPaddingRight
        var cpb = contentPaddingBottom
        val cpl = contentPaddingLeft
        if (top) {
            cpt += insets.systemWindowInsetTop
        }
        if (bottom) {
            cpb += insets.systemWindowInsetBottom
        }
        setContentPadding(cpl, cpt, cpr, cpb)
        insets
    }
}